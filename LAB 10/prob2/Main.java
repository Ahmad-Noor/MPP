package prob2;

import java.util.List;

public class Main {

	public static <T extends Comparable<? super T>> T secondSmallest(List<T> list) {
		return list.stream().sorted().distinct().skip(1).min(T::compareTo).get();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(secondSmallest(List.of('a', 'b', 'a', 'd', 'e')));
		System.out.println(secondSmallest(List.of(4, 5, 8, 6, 2)));

	}

}
