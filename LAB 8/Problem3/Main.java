package Problem3;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.*;

public class Main {

	public static void main(String[] args) {

			List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Cherries", "blums");
 
		System.out.println("--------------------Lambdas---------------------------------");
		fruits.forEach(x->System.out.println(x));
		System.out.println("--------------------Method reference------------------------");
		fruits.forEach(System.out::println);
		

	}

}
