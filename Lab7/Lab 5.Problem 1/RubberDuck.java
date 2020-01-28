package prob1duck;


public class RubberDuck extends Duck{
	
	public RubberDuck() {
		super();
		super.setFlyBehaviour(new CannotFly());
		super.setQuackBehaviour(new Squeak());
	}
	
	@Override
	public void display() {
		System.out.println("displaying Rubber Duck");
	}

}
