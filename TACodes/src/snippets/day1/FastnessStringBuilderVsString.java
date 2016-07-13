package snippets.day1;

public class FastnessStringBuilderVsString {
	public static void main(String[] args) {
		int n=10000;
		long s = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("Time elapsed:" + (System.currentTimeMillis() - s));
		
		s = System.currentTimeMillis();
		String ans = "";
		for (int i = 0; i < n; i++)
			ans += i;
		System.out.println(ans);
		System.out.println("Time elapsed:" + (System.currentTimeMillis() - s));
		
		s = System.currentTimeMillis();
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < n; i++)
			res.append(i);
		System.out.println(res);
		System.out.println("Time elapsed:" + (System.currentTimeMillis() - s));
		
		s = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for (int i = n-1; i >= 0; i--)
			sb.insert(0,i);
		System.out.println(sb);
		System.out.println("Time elapsed:" + (System.currentTimeMillis() - s));

	}
}
