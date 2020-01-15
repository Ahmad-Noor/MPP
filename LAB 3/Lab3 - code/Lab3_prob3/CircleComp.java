
public class CircleComp {
	private double radius;

	public CircleComp(double radius) {
		this.radius = radius;
	}

	double getRadius() {
		return radius;
	}

	public double computeArea() {
		return Math.PI * radius * radius;
	}
}
