package lab5.prob3;

public class VehicleFactory {
	
	private VehicleFactory() {
		
	}
	
	public static Vehicle getVehicle(String v) {
		if(v.equalsIgnoreCase("car")) {
			return new Car();
		} else if(v.equalsIgnoreCase("bus")) {
			return new Bus();
		} else if(v.equalsIgnoreCase("truck")) {
			return new Truck();
		} else if(v.equalsIgnoreCase("electricCar")) {
			return new ElectricCar();
		}
		return null;
	}
}
