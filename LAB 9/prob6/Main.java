package prob6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Set<String>> t = new ArrayList<Set<String>>();

		Set<String> s1 = new HashSet<String>();
		s1.add("A");
		s1.add("B");
		t.add(s1);

		Set<String> s2 = new HashSet<String>();
		s2.add("D");
		t.add(s2);

		Set<String> s3 = new HashSet<String>();
		s3.add("1");
		s3.add("3");
		s3.add("5");
		t.add(s3);

		Set<String> result = union(t);
		System.out.println(result);

	}

	public static Set<String> union(List<Set<String>> sets) {
		Set<String> result = new HashSet<String>();

		return sets.stream().reduce(result, (x, y) -> {
			x.addAll(y);
			return x;
		});

	}

}
