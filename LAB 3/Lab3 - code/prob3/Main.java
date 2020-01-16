package lab3.prob3;

public class Main {
	public static void main(String[] args) {
		CircleComp circle = new CircleComp(5);
		System.out.println(circle);
		System.out.println(circle.computeArea());
		
		CylinderComp cylinder = new CylinderComp(10, 50);
		System.out.println(cylinder);
		System.out.println(cylinder.computeVolume());
	}
}
