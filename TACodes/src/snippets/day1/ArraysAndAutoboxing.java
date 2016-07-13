package snippets.day1;

class B {
	int x;
	int y;

	public B(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class C {
	int x;
	int y;

	public C(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "C [x=" + x + ", y=" + y + "]";
	}

}

public class ArraysAndAutoboxing {
	public static void main(String[] args) {
		// Object??? where is it in the hierrarchy??
		Object[] arr = new Object[10];
		// System.out.println(arr[0].toString());// ???
		arr[0] = new Integer(10);
		arr[1] = new String("34210");
		arr[2] = new B(5, 8);
		arr[3] = new C(2, 9);
		arr[4] = 9.544;// autoboxing

		System.out.println(arr[1]);//why it printed "34210"?? Overriden toString in String Class..!!!
		System.out.println(arr[2]);// why??? why is toString() needed??!!
		System.out.println(arr[3]);

	}
}
