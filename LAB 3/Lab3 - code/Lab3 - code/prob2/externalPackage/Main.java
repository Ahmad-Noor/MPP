package lab3.prob2.externalPackage;
import lab3.prob2.*;

public class Main {

	public static void main(String[] args) {
		Landlord ll = new Landlord("Landlord 001");
		Building b1 = ll.addBuilding("A", 500);
		b1.AddApartment("A1", 1000);
		b1.AddApartment("A2", 1100);
		b1.AddApartment("A3", 1200);
		b1.AddApartment("A4", 1300);
		b1.AddApartment("A5", 1400);
		b1.AddApartment("A6", 1500);
		System.out.println(ll.getBuildings());
		System.out.println(ll.MonthlyTotalProfits());

	}

}
