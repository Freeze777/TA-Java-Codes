package day1;

public class PrettyPrint2 {
	public static void main(String[] args) {
		int n = 10;
		prettyPretty_method1(n);
	}

	// two loops -- O(n^2)
	public static void prettyPretty_method1(int n) {
		int lineWidth = 2 * n - 1;
		StringBuilder prefix = new StringBuilder();
		StringBuilder suffix = new StringBuilder();

		for (int line = 0; line < n; line++) {
			int numDigits = 2 * line + 1;
			int numSpaces = lineWidth - numDigits;
			for (int i = 0; i < numSpaces / 2; i++)
				System.out.print(" ");
			System.out.print(prefix + ("" + line) + suffix);
			for (int i = 0; i < numSpaces / 2; i++)
				System.out.print(" ");
			prefix.append(line);
			suffix.insert(0, line);
			System.out.println();
		}
	}

	// one loop -- O(n^2)??? insert()!!!!
	public static void prettyPretty_method2(int n) {
		int lineWidth = 2 * n - 1;

		StringBuilder prefix = new StringBuilder();
		StringBuilder suffix = new StringBuilder();

		for (int line = 0; line < n; line++) {
			int numDigits = 2 * line + 1;
			int numSpaces = lineWidth - numDigits;
			System.out.format("%" + ((numSpaces / 2) + (numDigits)) + "s",
					prefix + "" + line + suffix);
			if (numSpaces != 0)
				System.out.format("%" + (numSpaces / 2) + "s", " ");
			prefix.append(line);
			suffix.insert(0, line);
			System.out.println();
		}

	}

}
