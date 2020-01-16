import java.util.List;

public class Commissioned extends Employee {
	private double commission;
	private double baseSalary;
	private List<Order> orders;
	
	public Commissioned(String empId, double commission, double baseSalary, List<Order> list) {
		super(empId);
		orders = list;
		this.commission = commission;
		this.baseSalary = baseSalary;
	}

	@Override
	public double calcGrossPay(int month, int year) {
		// TODO Auto-generated method stub
		int orderAmounts = 0;
		for (Order order : orders) {
			if (order.getOrderDate().getMonth().getValue() == month - 1) {
				orderAmounts += order.getOrderAmount();
			}
		}
		return baseSalary + (orderAmounts * commission);
	}

}
