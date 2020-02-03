package prob7.a;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Comparator<Employee> nameComparator = Comparator.comparing(Employee::getFirstName) ;
		
		List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000));
		
		//your stream pipeline here
		list.stream().filter(employee -> employee.getSalary() > 100000)
					.filter(employee -> 
										(int) employee.getLastName().charAt(0) > 78 &&
										(int) employee.getLastName().charAt(0) <= 90
										)
					.sorted(nameComparator)
					.map(e -> new String(e.getFirstName() + " " + e.getLastName() + ", "))
//					.sorted()
					.forEach(System.out::print);

	}

}
