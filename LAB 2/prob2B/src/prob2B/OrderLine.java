package prob2B;

public class OrderLine {
	private Order order;
	private int lineNum;
	private double price, quantity;

	OrderLine (Order order, int lineNum, double price, double quantity){
		this.order = order;
		this.lineNum = lineNum;
		this.price = price;
		this.quantity = quantity;
	}
	
	public int getLineNum() {
		return lineNum;
	}

	public double getPrice() {
		return price;
	}

	public double getQuantity() {
		return quantity;
	}

	public Order getOrder() {
		return order;
	}
	
	public void setLineNum(int lineNum){
		this.lineNum = lineNum;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public void setQuantity(double quantity){
		this.quantity = quantity;
	}
	
	@Override
	public String toString(){
		return "line Num: " + lineNum + ", price: " + price + ", quantity: " + quantity;
	}
	
}
