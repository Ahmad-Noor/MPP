package lab3.prob4;

public class House extends Property {
	private double lotSize;
	
	public House(double lotSize) {
		super();
		this.lotSize = lotSize;
	}

	public double getLotSize() {
		return lotSize;
	}
	
	public void setLotSize(double lotSize) {
		this.lotSize = lotSize;
	}

	@Override
	public double computeRent() {
		// TODO Auto-generated method stub
		return lotSize * 0.1;
	}
}
