package Hint_2;

import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {

		Supplier<Double> r = Math::random;
		System.out.println(r.get());
 
		
	}

}