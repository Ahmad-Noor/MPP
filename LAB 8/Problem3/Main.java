package Problem3;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.*;

public class Main {

	public static void main(String[] args) {

		List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Cherries", "blums");
		fruits.forEach(x -> System.out.println("fruit : " + x));
		System.out.println("-----------------------------------------------------");
		Consumer<List<String>> consumer = (s) -> System.out.println(s);
		consumer.accept(fruits);
		

	}

}
