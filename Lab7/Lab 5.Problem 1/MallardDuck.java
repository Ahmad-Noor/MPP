package prob1duck;

public class MallardDuck extends Duck{
	
	public MallardDuck() {
		super();
		super.setFlyBehaviour(new FlyWithWings());
		super.setQuackBehaviour(new Quack());
	}
	
	@Override
	public void display() {
		System.out.println("displaying Maller Duck");
	}

}
