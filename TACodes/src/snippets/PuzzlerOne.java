package snippets;

public class PuzzlerOne 
{
	public static void main(String ...arg)
	{
		int l = Integer.MAX_VALUE;
		
		System.out.println(l);
		long x = l+1;
		System.out.println(x); //??why
		
		long y = (long)(l+1);
		System.out.println(y);
		
		long z = l + (long)1;
		System.out.println(z);
		
		
		
	}
}
