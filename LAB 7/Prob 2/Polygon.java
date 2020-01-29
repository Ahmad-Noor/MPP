
public interface Polygon extends ClosedCurve {
	@Override
	default double computePerimeter() {
		double per = 0;
		for (double side : getLengths()) {
			per += side;
		}
		return per;
	}
	
	public double[] getLengths();
}
