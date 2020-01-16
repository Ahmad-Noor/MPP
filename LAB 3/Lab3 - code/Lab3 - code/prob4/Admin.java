package lab3.prob4;

public class Admin {
	public static double computeTotalRent(Property[] properties) {
		double totalRent = 0;
		for (Property prop : properties) {
			totalRent += prop.computeRent();
		}
		return totalRent;
	}
}
