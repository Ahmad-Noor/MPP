package prob1duck;


public class CannotQuack implements QuackBehaviour{

	@Override
	public void quack() {
		System.out.println("Cannot Quack");
	}

}
