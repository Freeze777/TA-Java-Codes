package snippets;

import java.util.HashSet;
import java.util.Set;

class A {
	int x;
	int y;

	public A(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public String toString() {
		return "A [x=" + x + ", y=" + y + "]";
	}

}

public class NeedForHaschCode {
	public static void main(String[] args) {
		Set<A> s = new HashSet<A>();
		s.add(new A(5, 6));
		s.add(new A(5, 6));
		System.out.println(s);
	}

}
