package lab5.probOne;

public class DecoyDuck extends Duck{
	
	public DecoyDuck() {
		super();
		super.setFlyBehaviour(new CannotFly());
		super.setQuackBehaviour(new CannotQuack());
	}
	
	@Override
	public void display() {
		System.out.println("displaying Decoy Duck");
	}

}
