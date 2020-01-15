
public class Circle {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	double getRadius() {
		return radius;
	}
	
	public double computeArea() {
		return Math.PI * radius * radius;
	}
}
