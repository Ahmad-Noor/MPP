package lab3.prob2;

import java.util.ArrayList;
import java.util.List;

public class Landlord {
	private String name;
	private List<Building> buildings;
	
	public Landlord(String name) {
		this.name = name;
		buildings = new ArrayList<Building>();

	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<Building> getBuildings() {
		return buildings;
	}

	public Building addBuilding(String section, double maintenanceCost) {
		for (Building building : buildings) {
			if (building.getMaintenanceCost() == maintenanceCost && building.getSection().equals(section)) {
				return building;
			}
		}
		Building bldg = new Building(section, maintenanceCost);
		buildings.add(bldg);
		return bldg;
	}
	
	public double MonthlyTotalProfits() {
		double sum = 0;
		for (Building building : buildings) {
			sum += building.generateProfit();
		}

		return sum;
	}

}
