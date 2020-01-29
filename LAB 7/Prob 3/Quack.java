public interface Quack extends QuackBehavior {
	public default void quack() {
		System.out.println("  quacking");
	}
}
