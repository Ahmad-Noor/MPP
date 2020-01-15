
public class Condo extends Property {
	private int numFloors;
	
	public Condo(int numFloors) {
		this.numFloors = numFloors;
	}

	public int getNumFloors() {
		return numFloors;
	}

	public void setNumFloors(int numFloors) {
		this.numFloors = numFloors;
	}

	@Override
	public double computeRent() {
		return 400 * numFloors;
	}

}
