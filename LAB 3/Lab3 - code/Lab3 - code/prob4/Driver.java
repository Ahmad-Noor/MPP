package lab3.prob4;

public class Driver {

	public static void main(String[] args) {
		Property[] prop = { new House(9000), new Condo(2), new Trailer() };
		double totalRent = Admin.computeTotalRent(prop);
		System.out.println(totalRent);
	}
}
