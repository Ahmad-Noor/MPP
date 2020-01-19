package lab5.probOne;

public class CannotFly implements FlyBehaviour{

	@Override
	public void fly() {
		System.out.println("Cannot fly");
	}

}
