package prob1;

import java.util.*;

public class GroupUtil {
	// Fix this code
	public static <T> Group<? extends T> copy(Group<?> group) {
		List<?> elements = group.getElements();

		Group<? extends T> grp = new Group(group.getSpecialElement(), elements);
		return grp;
	}

	// Test using this main method
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0, 1, 2, 3, 4);
		Group<Integer> group = new Group<>(0, list);
		// System.out.println(group);

		List<String> liststr = Arrays.asList("A", "B", "C");
		Group<String> groupstr = new Group<String>("1", liststr);
		// System.out.println(groupstr);

		System.out.println(GroupUtil.copy(group));
		System.out.println(GroupUtil.copy(groupstr));

	}
}
