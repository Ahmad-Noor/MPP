package prob1duck;


public class RedheadDuck extends Duck{
	
	public RedheadDuck() {
		super();
		super.setFlyBehaviour(new FlyWithWings());
		super.setQuackBehaviour(new Quack());
	}
	
	@Override
	public void display() {
		System.out.println("displaying Redhead Duck");
	}

}
