package snippets;

import java.util.Scanner;

public class ArithematicExpressionEval {
	public static void main(String[] args) {
		int b1 = 80, b2 = 10;
		/*
		 * x=(left_expr)*(right_expr) side-effects in left_expr can effect the
		 * right and never can the side-effects of right_expr effect the left
		 * because the left is already evaluated
		 */
		System.out.println(++b1 * b1 / 100 + ++b2 * b1++);// (((++b1)*b1)/100)+((++b2)*(b1++));
		System.out.println((char) (int) (float) 68);// right to left
													// ((char)((int)((float)68)));
		System.out.println(4 * 6 / 2 + 7 + 3 * 6 % 5 + 10);// since no
															// paranthesis
															// evaluation from
															// left to right

		int a = 3, b = 4;
		System.out.println(a++ * b-- / a-- + ++b);
		/*
		 * Step 1: (a++* b-- / a-- + ++b) to (3* b-- / a-- + ++b)
		 * 
		 * a=4,b=4
		 * 
		 * Step 2: (a++ *b--/ a-- + ++b) to (3 *4/ a-- + ++b)
		 * 
		 * a=4,b=3
		 * 
		 * Step 3: (a++ * b-- /a--+ ++b) to (3 * 4 /4+ ++b)
		 * 
		 * a=3,b=3
		 * 
		 * Step 4: (a++ * b-- / a-- +++b) to (3 * 4 / 4 +4)
		 * 
		 * a=3,b=4
		 * 
		 * So the final expression is (3 * 4 / 4 + 4)
		 */

		System.out.println(2 + 0 + 1 + 6 + "MTech2016");
		System.out.println("MTech2016" + 2 + 0 + 1 + 6);
		System.out.println(2 + 0 + 1 + 5 + "MTech2016" + 2 + 0 + 1 + 6);
		System.out.println(2 + 0 + 1 + 5 + "MTech2016" + (2 + 0 + 1 + 6));
	}

}
