package prob7.b;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaLibrary {
	private static Comparator<Employee> nameComparator = Comparator.comparing(Employee::getFirstName);
	public static final Function<List<Employee>, List<String>> NAMES_LASTNAMES = (list) -> {
		return list.stream().filter(employee -> employee.getSalary() > 100000)
				.filter(employee -> (int) employee.getLastName().charAt(0) > 78
						&& (int) employee.getLastName().charAt(0) <= 90)
				.sorted(nameComparator).map(e -> new String(e.getFirstName() + " " + e.getLastName() + ", "))
				.collect(Collectors.toList());
	};

}
