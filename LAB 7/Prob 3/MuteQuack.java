public interface MuteQuack extends QuackBehavior {
	public default void quack() {
		System.out.println("  cannot quack");
	}
}
