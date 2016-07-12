package day1;

public class PrettyPrint1 {
	public static void main(String[] args) {
		int n = 10;
		prettyPrint_method2(n);

	}

	// one loop using string builder
	public static void prettyPrint_method2(int n) {
		StringBuilder prefix = new StringBuilder();
		for (int line = 0; line < n; line++) {
			System.out.println(prefix + "" + line + prefix.reverse());
			prefix.reverse();
			prefix.append(line);
		}

	}

	// two loops
	public static void prettyPrint_method1(int n) {
		for (int line = 0; line < n; line++) {
			for (int i = 0; i <= line; i++)
				System.out.print(i);

			for (int i = line - 1; i >= 0; i--)
				System.out.print(i);

			System.out.println();
		}
	}

}
