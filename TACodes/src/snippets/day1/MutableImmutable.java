package snippets.day1;

public class MutableImmutable {
	public static void main(String[] args) {
		String in = "Hello";
		func(in);
		System.out.println(in);
		StringBuilder sb = new StringBuilder("Hello");
		func(sb);
		System.out.println(sb);

		// One more mutable string type: StringBuffer..!!
		// Read about difference of StringBuilder and StringBuffer..!!
	}

	private static void func(String in) {
		in = in + "World";
	}

	private static void func(StringBuilder s) {
		s = s.append("World");
	}
}
