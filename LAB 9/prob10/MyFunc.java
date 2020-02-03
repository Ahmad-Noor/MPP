package prob10;

@FunctionalInterface
public interface MyFunc<T1, T2, T3, R> {
	public R apply(T1 t1, T2 t2, T3 t3);
}
