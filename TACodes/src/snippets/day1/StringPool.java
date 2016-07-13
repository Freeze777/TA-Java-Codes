package snippets.day1;

public class StringPool {
	public static void main(String[] args) {
		String s1 = "apple";
		String s2 = "apple";
		String s3 = new String("apple");
		String s4 = new String(s1);

		if (s1 == s2)
			System.out.println("s1 and s2 points to same location!!!!!!");
		else
			System.out.println("s1 and s2 points to differnt location!!!!!!");

		if (s1 == s3)
			System.out.println("s1 and s3 points to same location!!!!!!");
		else
			System.out.println("s1 and s3 points to differnt location!!!!!!");

		if (s1.equals(s3))
			System.out.println("s1 and s3 points to different location which stores the same value!!!!!!");
		else
			System.out
					.println("s1 and s3 points to different location which stores the different value!!!!!!");

		if (s1 == s4)
			System.out.println("s1 and s4 points to same location!!!!!!");
		else
			System.out.println("s1 and s4 points to differnt location!!!!!!");

		if (s1.equals(s4))
			System.out.println("s1 and s4 points to different location which stores the same value!!!!!!");
		else
			System.out.println("s1 and s4 points to different location which stores the different value!!!!!!");
		
		
		// Is there a similar Integer Pool??????
	}
}
