package lab3.prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {
	private double maintenanceCost;
	private String section;
	private List<Apartment> apartments;
	
	//package level access
	Building(String section, double maintenanceCost) {
		this.section = section;
		this.maintenanceCost = maintenanceCost;
		this.apartments = new ArrayList<Apartment>();
	}
	
	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public double getMaintenanceCost() {
		return maintenanceCost;
	}
	
	public void setMaintenanceCost(double maintenanceCost) {
		this.maintenanceCost = maintenanceCost;
	}

	public void AddApartment(String apartmentName, double rent) {
		apartments.add(new Apartment(apartmentName, rent));
	}

	public double generateProfit() {
		double sum = 0;
		for (Apartment apartment : apartments) {
			sum += apartment.getRent();
		}
		return sum - maintenanceCost;
	}
	
	
	public String toString() {
		return "section: " + section + ", maintenanceCost: " + maintenanceCost  + ", apartments: " + apartments.toString();
	}

}
