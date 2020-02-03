package prob9;

import java.util.*;

public class Dish {

	public enum Type {
		MEAT, FISH, OTHER
	}

	private final String name;
	private final boolean vegetarian;
	private final int calories;
	private final Type type;

	public Dish(String name, boolean vegetarian, int calories, Type type) {
		this.name = name;
		this.vegetarian = vegetarian;
		this.calories = calories;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public int getCalories() {
		return calories;
	}

	public Type getType() {
		return type;
	}

	@Override
	public String toString() {
		return name;
	}

	public static final List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
			new Dish("beef", false, 700, Dish.Type.MEAT), new Dish("chicken", false, 400, Dish.Type.MEAT),
			new Dish("french fries", true, 530, Dish.Type.OTHER), new Dish("rice", true, 350, Dish.Type.OTHER),
			new Dish("season fruit", true, 120, Dish.Type.OTHER), new Dish("pizza", true, 550, Dish.Type.OTHER),
			new Dish("prawns", false, 400, Dish.Type.FISH), new Dish("salmon", false, 450, Dish.Type.FISH));

	public static boolean IsThereAnyVegetarianMeal(List<Dish> menu) {
		return menu.stream().anyMatch(dish -> dish.isVegetarian());
	}

	public static boolean IsThereAnyHealthyMealCaloriesLessThan1000(List<Dish> menu) {
		return menu.stream().anyMatch(dish -> dish.getCalories() < 1000);
	}

	public static boolean IsThereAnyUnHealthyMealCaloriesGreaterThan1000(List<Dish> menu) {
		return menu.stream().anyMatch(dish -> dish.getCalories() > 1000);
	}

	public static Optional<Dish> firstItemOfTypeMeat(List<Dish> menu) {
		return menu.stream().filter(dish -> dish.getType() == Type.MEAT).findFirst();
	}

	public static int calculateTotalCalories(List<Dish> menu) {
		return menu.stream().map(dish -> dish.getCalories()).reduce(0, (x, y) -> x + y);
	}

	public static int calculateTotalCaloriesMethodReference(List<Dish> menu) {
		return menu.stream().map(dish -> dish.getCalories()).reduce(0, Integer::sum);
	}

//	e. Implement a main method to test.
	public static void mainMethod(List<Dish> menu) {
//    	a. Is there any Vegetarian meal available ( return type boolean)
		System.out.println("Is there any vegetarian meal: " + IsThereAnyVegetarianMeal(menu));

//    	b. Is there any healthy menu have calories less than 1000 ( return type boolean)
		System.out.println("Is there any healthy menu have calories less than 1000 : "
				+ IsThereAnyHealthyMealCaloriesLessThan1000(menu));

//    	c. Is there any unhealthy menu have calories greater than 1000 ( return type boolean)
		System.out.println("Is there any unhealthy menu have calories greater than 1000: "
				+ IsThereAnyUnHealthyMealCaloriesGreaterThan1000(menu));

//    	d. find and return the first item for the type of MEAT( return type Optional<Dish>)
		System.out.println("The first item for the type MEAT: " + firstItemOfTypeMeat(menu).get());

//    	e. calculateTotalCalories() in the menu using reduce. (return int)
		System.out.println("Total calories in the menu: " + calculateTotalCalories(menu));

//    	f. calculateTotalCaloriesMethodReference()in the menu using MethodReferences. (return int)
		System.out.println(
				"Total calories in the menu using Method References: " + calculateTotalCaloriesMethodReference(menu));

	}

	public static void main(String[] args) {
		mainMethod(menu);
	}
}