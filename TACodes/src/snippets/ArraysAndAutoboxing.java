package snippets;

public class ArraysAndAutoboxing {
	public static void main(String[] args) {
		// Object??? where is it in the hierrarchy??
		Object[] arr = new Object[10];
		System.out.println(arr[0].toString());// ???
		arr[0] = new Integer(10);
		arr[1] = new String("34210");
		arr[4] = 9.544;// autoboxing
		

	}
}
