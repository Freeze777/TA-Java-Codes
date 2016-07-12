package snippets;

public class ShortCircuitEvalBoolExpr {
	public static void main(String[] args) {
		int i = 0;
		if ((5 > 4) || (++i > 1)) {
			System.out.println("Jus a print statement when True");
		} else {
			System.out.println("Jus a print statement when False");
		}
		System.out.println(i);
		if ((5 > 9) || (++i > 1)) {
			System.out.println("Jus a print statement when True");
		} else {
			System.out.println("Jus a print statement when False");
		}
		System.out.println(i);

		int a = 5, b = 0;
		//evaluation from left to right
		if ((a % b == 0) && (b != 0)) {
			System.out.println("Jus a print statement when True");
		} else {
			System.out.println("Jus a print statement when False");
		}
		//correction
		if ((b != 0) && (a % b == 0)) {
			System.out.println("Jus a print statement when True");
		} else {
			System.out.println("Jus a print statement when False");
		}

	}
}
