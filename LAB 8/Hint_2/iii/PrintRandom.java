package Hint_2;

import java.util.function.Supplier;

public class PrintRandom {

	public static void main(String[] args) {
		class Inner_Random implements Supplier<Double> {
			@Override
			public Double get() {
				return Math.random();
			}
		}

		System.out.println(new Inner_Random().get());

	}

}
