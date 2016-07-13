package day1;

public class PrettyPrint1 {
	public static void main(String[] args) {
		int n = 10;
		prettyPrint_method1(n);

	}
	//O(n^2)--- slower
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
	//O(n^2)--why?? but faster ???---less I/O calls
	// one loop-- using string builder.... why stringBuilder??why not Strings??why not StringBuffer???
	//Complexity??? append()--O(1) insert()--O(n)(char[] is used in StringBuilder)
	public static void prettyPrint_method2(int n) {
		StringBuilder prefix = new StringBuilder();
		StringBuilder suffix = new StringBuilder();
		for (int line = 0; line < n; line++) {
			System.out.println(prefix + ("" + line) + suffix);
			prefix.append(line);
			suffix.insert(0, line);//costly..!!
		}

	}
	// O(n)-- fastest and best
	// Number theory involved!!
	public static void prettyPrint_method3(int n) {
		// TODO Auto-generated method stub
		System.out.println(0);
		for (int j = 1; j < n; j++) {
			long temp = (long) (Math.pow(10, j) - 1);
			temp /= 9;
			temp = temp * temp;
			System.out.println("0" + temp + "0");
		}

	}

}
