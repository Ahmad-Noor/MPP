package  prob10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import java.util.stream.Stream;

class Human {
	String name;
	int age;
	String gender;

	public Human(String name) {
		this.name = name;
	}

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Human(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}



public class ConstructorReference {
	public static Stream<Human> streamOfHuman(Human[] list) {
		return Stream.of(list); 	     
	}
	
	public static void main(String args[]) {
		Human[] list = { new Human("Ahmed", 35, "Male"), new Human("Jane", 45, "Female"), new Human("John", 30, "Male") };

		// Query 1 : Print only Female candidates names
		
		streamOfHuman(list).filter(human -> human.getGender().equalsIgnoreCase("Female"))
				.forEach(human -> System.out.println(human.getName()));

                // Query 2 : Cretae an objecy by choosing suitable Interface to the specified constructors(Totally 3 constuctors)using fouth type of Method Reference ClassName::new. Then print the object status 
		System.out.println("Query 2, 1st constructor: ");
		List<String> names = Arrays.asList("Ahmed", "Jane", "John"); 
		names.stream().map(Human::new)
						.forEach(System.out::println);
		
		BiFunction<String, Integer, Human> secondConstructor = Human::new;
		System.out.println("Query 2, 2nd constructor: ");
		System.out.println(secondConstructor.apply("Ahmed", 35));
		System.out.println(secondConstructor.apply("Jane", 45));
		System.out.println(secondConstructor.apply("John", 30));
		
		MyFunc<String, Integer, String, Human> thirdConstructor = Human::new;
		System.out.println("Query 3, 3nd constructor: ");
		System.out.println(thirdConstructor.apply("Ahmed", 35, "Male"));
		System.out.println(thirdConstructor.apply("Jane", 45, "Female"));
		System.out.println(thirdConstructor.apply("John", 30, "Male"));
		
		// Query 3 : Count the male candidates whose age is more than 30
		long count = streamOfHuman(list).filter(human -> human.getGender().equalsIgnoreCase("Male") && human.getAge() > 30)
										.count();
		System.out.println("Count of the male candidates whose age is more than 30: " + count);

	}

}
