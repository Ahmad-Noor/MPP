package prob1;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// Write the one line of code necessary to print this
		System.out.println(Stream.of("Bill", "Thomas", "Mary").collect(Collectors.toList()));

		// ---------------------------------------
		Stream stringStream = Stream.of("Bill", "Thomas", "Mary");
		System.out.println(stringStream.collect(Collectors.toList()));
	}

}
