package Lab3_prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {
	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	private List<Apartment> apartments;
	private double maintenanceCost;
	private String section;

	Building() {
		this.apartments = new ArrayList<Apartment>();
	}

	public double getMaintenanceCost() {
		return maintenanceCost;
	}

	public void AddApartment(String apartmentName, double rent) {
		Apartment ap = new Apartment(apartmentName, rent);
		apartments.add(ap);
	}

	public void setMaintenanceCost(double maintenanceCost) {
		this.maintenanceCost = maintenanceCost;
	}

	public double generateProfit() {
		double sum = 0;
		for (Apartment apartment : apartments) {
			sum += apartment.getRent();
		}
		return sum - maintenanceCost;
	}

}
