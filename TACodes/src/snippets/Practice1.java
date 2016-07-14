package snippets;

import java.util.Scanner;

/*

 Usual format of contest sites:
 #testcases
 t blocks of input needed

 */
public class Practice1 {
	public static void main(String[] args) {
		/* Check whether a string is a Panagram */
		// eg: "The quick brown fox jumps over the lazy dog"
		// "Pack my box with five dozen liquor jugs"

		// ignore spaces..
		// convert to lower or upper case

		// O(n*26)==O(n) time O(1) space?? Brute Force
		// O(n) time O(26)==O(1) space??
		// anythg better??

		// General format for input taking
		Scanner sc = new Scanner(System.in);
		int tst = sc.nextInt();// dont mix nextLine() and nextInt()..!!
		
		 /*
		  String t = sc.nextLine();
		  int tst=Integer.parseInt(t);
		 */
		
		/*
		 int tst = sc.nextInt();
		 sc.nextLine();
		 */
		while (tst > 0) {

			// String input = sc.next(); // this is wrong thing to use here??
			// why???
			String input = sc.nextLine();
			//System.out.println(input);
			System.out.println(isPanagram(input.toLowerCase()) ? "YES" : "NO");

			tst--;
		}

	}

	public static boolean isPanagram(String s) {
		/* logic */
		return false;
	}
}
