package snippets;

public class ObjectArray 
{
	public static void main(String ...args)
	{
		Object arr[] = new Object[3];
		arr[0] = "abc";
		arr[1] = 12;
		arr[2] = 12.3;
		
		for(Object o:arr)
			System.out.println(o);
		
	}
}
