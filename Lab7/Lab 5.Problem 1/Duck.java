package prob1duck;


public abstract class Duck {
	private FlyBehaviour flyBehaviour;
	private QuackBehaviour quackBehaviour;
//	the abstract display method will implement different from every class extend Duck
	public abstract void display();
	
//	common method so we implement it here in the abstract class
	public void swim() {
		System.out.println("swimming");
	}
	
	public void fly() {
		flyBehaviour.fly();
	}
	
	public void quack() {
		quackBehaviour.quack();
	}

//	when creating a new type of Duck (MallardDuck, RedheadDuck, ....) you set the flyBehaviour
//	and  quackBehaviour throw setter methods in their constructor (MallardDuck, RedheadDuck,...)
	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}
	
}
