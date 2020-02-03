package prob8;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class PuttingIntoPractice {
	public static void main(String... args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		List<Trader> traders = Arrays.asList(raoul, mario, alan, brian);

		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 950));

		Comparator<Transaction> valueTransactionComparator = Comparator.comparing(Transaction::getValue);
		// Query 1: Find all transactions from year 2011 and sort them by value (small
		// to high).
		System.out.println("Query 1: ");
		transactions.stream().filter(transaction -> transaction.getYear() >= 2011).sorted(valueTransactionComparator)
				.forEach(System.out::println);

		// Query 2: What are all the unique cities where the traders work?
		System.out.println("----------------------------------------------------");
		System.out.println("Query 2: ");
		traders.stream().map(trader -> new String(trader.getCity())).distinct().forEach(System.out::println);

		// Query 3: Find all traders from Cambridge and sort them by name.
		System.out.println("----------------------------------------------------");
		System.out.println("Query 3: ");
		Comparator<Trader> nameTraderComparator = Comparator.comparing(Trader::getName);
		traders.stream().filter(trader -> trader.getCity().equalsIgnoreCase("Cambridge")).sorted(nameTraderComparator)
				.forEach(System.out::println);

		// Query 4: Return a string of all traders names sorted alphabetically.
		System.out.println("----------------------------------------------------");
		System.out.println("Query 4: ");
		String names = traders.stream().map(trader -> new String(trader.getName())).sorted().reduce("",
				(x, y) -> x.concat(y + " "));
		System.out.println(names);
		// Query 5: Are there any trader based in Milan?
		System.out.println("----------------------------------------------------");
		System.out.println("Query 5: ");
		Optional<String> basedInMilan = traders.stream().filter(trader -> trader.getCity().equalsIgnoreCase("Milan"))
				.map(trader -> new String("trader: " + trader.getName() + " in " + trader.getCity())).findAny();
		if (basedInMilan.isPresent())
			System.out.println("based In Milan: " + basedInMilan.get());
		
		//   		System.out.println("based In Milan: " + basedInMilan.orElse("No one based in Milan"));

		// Query 6: Update all transactions so that the traders from Milan are set to
		// Cambridge.
		System.out.println("----------------------------------------------------");
		System.out.println("Query 6: ");
		transactions.stream().map(transaction -> {
			if (transaction.getTrader().getCity().equalsIgnoreCase("Milan")) {
				transaction.getTrader().setCity("Cambridge");
			}
			return transaction;
		}).forEach(System.out::println);

		// Query 7: What's the highest value in all the transactions?
		System.out.println("----------------------------------------------------");
		System.out.println("Query 7: ");
		Transaction t = transactions.stream()
		
		//        			.max(valueTransactionComparator)
				.max((x, y) -> Integer.compare(x.getValue(), y.getValue())).get();
		System.out.println(t);
	}
}
