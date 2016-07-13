package snippets;

public class ShortCircuitEvalBoolExpr {
	public static boolean func(int i) {
		System.out.println("func was called");
		return i == 20;
	}

	public static void main(String[] args) {

		int a = 5, b = 4;
		if ((a > b) || func(10)) {
			System.out.println("Jus a print statement when True");
		} else {
			System.out.println("Jus a print statement when False");
		}
		if ((a < b) || func(10)) {
			System.out.println("Jus a print statement when True");
		} else {
			System.out.println("Jus a print statement when False");
		}
		/*********************************************************/
		int i = 0;
		if ((a > b) || (++i > 1)) {
			System.out.println("Jus a print statement when True");
		} else {
			System.out.println("Jus a print statement when False");
		}
		System.out.println("Value of i:" + i);
		
		a = 5;
		b = 9;
		i = 0;
		if ((a > b) || (++i > 1)) {
			System.out.println("Jus a print statement when True");
		} else {
			System.out.println("Jus a print statement when False");
		}
		System.out.println("Value of i:" + i);
		/*********************************************************/
		a = 5;
		b = 0;
		// evaluation from left to right...
		if ((a % b == 0) && (b != 0)) {
			System.out.println("Jus a print statement when True");
		} else {
			System.out.println("Jus a print statement when False");
		}
		// correction---- used as gaurds
		if ((b != 0) && (a % b == 0)) {
			System.out.println("Jus a print statement when True");
		} else {
			System.out.println("Jus a print statement when False");
		}

	}

}
