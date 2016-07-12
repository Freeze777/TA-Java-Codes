package snippets;

public class StringPool {
	public static void main(String[] args) {
		String s1="apple";
		String s2="apple";
		String s3=new String("apple");
		String s4=new String(s1);
		
		if(s1==s2)
			System.out.println("s1 and s2 points to same location!!!!!!");
		
	}
}
