package snippets;

public class MutableImmutable {
	public static void main(String[] args) {
		String in = "afjkshdgf";
		func(in);
		System.out.println(in);
		StringBuilder sb = new StringBuilder("afjkshdgf");
		func(sb);
		System.out.println(sb);

		// One more mutable string type: StringBuffer..!!
		// Read about difference of StringBuilder and StringBuffer..!!
	}

	private static void func(String s) {
		s = s + "sgdfedhf";
	}

	private static void func(StringBuilder s) {
		s = s.append("sgdfedhf");
	}
}
