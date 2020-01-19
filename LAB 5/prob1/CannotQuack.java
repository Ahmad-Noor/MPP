package lab5.probOne;

public class CannotQuack implements QuackBehaviour{

	@Override
	public void quack() {
		System.out.println("Cannot Quack");
	}

}
