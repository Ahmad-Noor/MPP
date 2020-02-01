package prob4;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSquares(4);
	}

	public static void printSquares(int num) {

		IntStream intStream = IntStream.iterate(1, n -> n + 1).map(i -> i * i).limit(num);
		intStream.forEach(System.out::println);

	}

}
