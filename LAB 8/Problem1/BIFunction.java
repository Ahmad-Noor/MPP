package Problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BIFunction {

	public static void main(String[] args) {
		BiFunction<Double, Double, List> bif = (x, y) -> {
			List<Double> list = new ArrayList<>();
			list.add(Math.pow(x, y));
			list.add(x * y);
			return list;
		};
		System.out.println(bif.apply(2.0, 3.0).toString());

	}

}
