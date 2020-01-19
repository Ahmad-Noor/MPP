package lab5.probTwo;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Figure> list = new ArrayList<Figure>();
		list.add(new Triangle(2,2));
		list.add(new Rectangle(4,5));
		list.add(new Circle(5));
		double sum = 0;
		for(Figure f : list) {
			sum += f.computeArea();
		}
		System.out.println(sum);
	}
}
