package Hint_2;

import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
 
//     lambda expression

		Supplier<Double> l = ()->Math.random();
		System.out.println(l.get());
		
		
	}

}