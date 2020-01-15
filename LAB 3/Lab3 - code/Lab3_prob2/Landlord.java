package Lab3_prob2;

import java.util.ArrayList;
import java.util.List;

public class Landlord {
	private List<Building> buildings;
	private String name;

	public Landlord(String name) {
		this.name = name;
		buildings = new ArrayList<Building>();

	}

	public double MonthlyTotalProfits() {
		double sum = 0;
		for (Building building : buildings) {
			sum += building.generateProfit();
		}

		return sum;
	}

	public Building addBuilding(String section, double maintenanceCost) {
		for (Building building : buildings) {
			if (building.getMaintenanceCost() == maintenanceCost && building.getSection().equals(section)) {
				return building;
			}
		}
		
		Building bldg = new Building();
		bldg.setMaintenanceCost(maintenanceCost);
		bldg.setSection(section);
		buildings.add(bldg);
		return bldg;
	}

	public List<Building> getBuildings() {
		return buildings;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
