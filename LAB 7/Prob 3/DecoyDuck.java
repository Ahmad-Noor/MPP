public class DecoyDuck extends Duck implements MuteQuack, CannotFly {
	public DecoyDuck() {
//		setQuackBehavior(new MuteQuack());
//		setFlyBehavior(new CannotFly());
	}
	@Override
	public void display() {
		System.out.println("  displaying");
		
	}
}
