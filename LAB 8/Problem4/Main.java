package Problem4;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.*;

public class Main {

	public static void main(String[] args) {

		String[] names = { "Alexis", "Tim", "Kyleen", "KRISTY" };
		Consumer<String[]> consumer2 = (a) -> Arrays.sort(a);
		consumer2.accept(names);
		for (int i = 0; i < names.length; i++)
			System.out.println(names[i]);

	}

}
