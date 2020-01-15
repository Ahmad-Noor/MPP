package Lab3_prob201;

import Lab3_prob2.*;

import java.util.ArrayList;
import java.util.List;

import Lab3_prob2.Apartment;
import Lab3_prob2.Building;
import Lab3_prob2.Landlord;

public class Main {

	public static void main(String[] args) {

		Landlord ll = new Landlord("Landlord 001");
		ll.addBuilding("A", 500).AddApartment("A1", 1000);
		ll.addBuilding("A", 500).AddApartment("A2", 1100);
		ll.addBuilding("A", 500).AddApartment("A3", 1200);
		ll.addBuilding("A", 500).AddApartment("A4", 1300);
		ll.addBuilding("A", 500).AddApartment("A5", 1400);
		ll.addBuilding("A", 500).AddApartment("A6", 1500);
		
		System.out.println(ll.MonthlyTotalProfits());

	}

}
