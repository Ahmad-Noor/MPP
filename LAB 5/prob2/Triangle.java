package lab5.probTwo;

public class Triangle implements Figure{
	private final double base;
	private final double height;
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public double computeArea() {
		return (height * base) / 2;
	}
	
	
}
