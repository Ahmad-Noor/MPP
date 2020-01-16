
public final class Paycheck {
	private double grossPay;
	private double fica = 0.23;
	private double state = 0.05;
	private double local = 0.01;
	private double medicare = 0.03;
	private double socialSecurity = 0.075;

	public Paycheck(double grossPay) {
		this.grossPay = grossPay;
//		this.fica = fica;
//		this.state = state;
//		this.local = local;
//		this.medicare = medicare;
//		this.socialSecurity = socialSecurity;
	}

	public void print() {
		System.out.println("Paystub:\n  Gross Pay: " + grossPay + "\n Fica: " + fica + "\n State: " + state
				+ "\n Local: " + local + "\n Medicare: " + medicare + "\n Social Security: " + socialSecurity
				+ "\n NET PAY: " + getNetPay());
	}

	public double getNetPay() {
		return grossPay * (1 - fica - state - local - medicare - socialSecurity); 
	}
}
