package prob2;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Stream<Integer> myIntStream = Stream.of(0, 2, 5, 10, 60, 1, 99, 10000);

		List<Integer> result = myIntStream.collect(Collectors.toList());

		Optional<Integer> max = result.stream().max(Integer::compare);
		Optional<Integer> min = result.stream().min(Integer::compare);

		System.out.println("Minimum = " + min.get());
		System.out.println("Maximum = " + max.get());

	}

}
