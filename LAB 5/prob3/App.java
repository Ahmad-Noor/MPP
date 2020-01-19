package lab5.prob3;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		List<Vehicle> listOfVehicles = new ArrayList<Vehicle>();
		listOfVehicles.add(VehicleFactory.getVehicle("car"));
		listOfVehicles.add(VehicleFactory.getVehicle("bus"));
		listOfVehicles.add(VehicleFactory.getVehicle("truck"));
		listOfVehicles.add(VehicleFactory.getVehicle("electricCar"));
	    for(Vehicle v : listOfVehicles) {
	    	v.startEngine();
	    }
	}
}
