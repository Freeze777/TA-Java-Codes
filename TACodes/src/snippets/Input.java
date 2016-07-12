package snippets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Input {
	public static void main(String[] args) {

		// Scanner -- slower ??? but easy..!!
		Scanner sc = new Scanner(System.in);// what is System.in???
		//default delimiter 
		String s = sc.next();//reads token
		int n = sc.nextInt();
		long l = sc.nextLong();
		float f = sc.nextFloat();
		double d = sc.nextDouble();
		//sc.nextLine() reads a line from the input--- but beware...!!!!
		// BufferedReader---- faster?? but bulky..!!!
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			int i = br.read();
			String s2 = br.readLine();
			//want integers??? use Integer.ParseInt(s2)
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
