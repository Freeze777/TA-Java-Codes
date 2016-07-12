package snippets;

public class StringBuilderVsString {
	public static void main(String[] args) {
		int n=100000;
		long s = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			System.out.print(i);
		}
		System.out.println("\nTime elapsed:" + (System.currentTimeMillis() - s));

		s = System.currentTimeMillis();
		String ans = "";
		for (int i = 0; i < n; i++)
			ans += i;
		System.out.print(ans);
		System.out.println("\nTime elapsed:"+ (System.currentTimeMillis() - s));

		s = System.currentTimeMillis();
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < n; i++)
			res.append(i);
		System.out.print(res);
		System.out.println("\nTime elapsed:"+ (System.currentTimeMillis() - s));

	}
}
