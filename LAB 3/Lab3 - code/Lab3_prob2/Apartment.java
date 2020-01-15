package Lab3_prob2;

public class Apartment {
	private String apartmentName;
	private double rent;

	Apartment(String apartmentNname, double rent) {
		this.apartmentName = apartmentNname;
		this.rent = rent;
	}

	public String getApartmentNname() {
		return apartmentName;
	}

	public void setApartmentNname(String apartmentNname) {
		this.apartmentName = apartmentNname;
	}

	public double getRent() {
		return rent;
	}

	public void setRent(double rent) {
		this.rent = rent;
	}
}
