
abstract public class Employee {
	private String empId;
	
	public Employee(String empId) {
		this.empId = empId;
	}
	
	public void print(int month, int year) {
		System.out.println("Employee Id: " + empId);
		calcCompensation(month, year).print();
	}
	
	public Paycheck calcCompensation(int month, int year) {
		return new Paycheck(calcGrossPay(month, year));
	}
	
	abstract public double calcGrossPay(int month, int year);
}
