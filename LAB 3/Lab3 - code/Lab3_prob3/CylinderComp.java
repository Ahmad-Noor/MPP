
public class CylinderComp {
	private double height;
	private CircleComp circle;
	
	public CylinderComp(double radius, double height) {
		circle = new CircleComp(radius);
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double computeVolume() {
		return height * circle.computeArea();
	}
}
