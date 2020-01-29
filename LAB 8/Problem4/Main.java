package Problem4;

import java.util.function.BiFunction;
import java.util.stream.Stream; 
import java.util.function.Consumer;
import java.util.*;



public class Main {

	public static void main(String[] args) {

		String[] names = { "Alexis", "alexis", "Tim", "Kyleen", "KRISTY" };
		Arrays.sort(names, String::compareToIgnoreCase);
		Stream<String> strArr = Stream.of(names);
		strArr.forEach(System.out::println);

	}

}
 