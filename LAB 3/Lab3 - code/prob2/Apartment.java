package lab3.prob2;

public class Apartment {
	private String apartmentName;
	private double rent;

	Apartment(String apartmentName, double rent) {
		this.apartmentName = apartmentName;
		this.rent = rent;
	}

	public String getApartmentName() {
		return apartmentName;
	}

	public void setApartmentName(String apartmentNname) {
		this.apartmentName = apartmentNname;
	}

	public double getRent() {
		return rent;
	}

	public void setRent(double rent) {
		this.rent = rent;
	}
	
	public String toString() {
		return "apartment name: " + apartmentName + ", rent: " + rent;
	}
}
