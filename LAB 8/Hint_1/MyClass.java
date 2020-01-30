package Hint_1;

import java.util.function.Function;

public class MyClass {
	int x;
	int y;

	public MyClass(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public boolean myEqual(MyClass c1) {

		Function<MyClass, Boolean> var = this::equals;
		return var.apply(c1);

	}

	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (!(o instanceof MyClass))
			return false;
		MyClass obj = (MyClass) o;
		if (this.x == obj.x && this.y == obj.y)
			return true;
		return false;

	}

}
