public class RubberDuck extends Duck implements Squeak, CannotFly {
	public RubberDuck() {
//		setQuackBehavior(new Squeak());
//		setFlyBehavior(new CannotFly());
	}
	@Override
	public void display() {
		System.out.println("  displaying");
		
	}
}
