package collections;

public class InnerClassDemo 
{
	int x;
	public InnerClassDemo(int x)
	{
		this.x = x;
	}
	
	private class Inner
	{
		public void setX(int xy)
		{
			x = xy;
		}
	}
	
	public Inner getObject()
	{
		return new Inner();
	}
	
	public static void main(String args[])
	{
		InnerClassDemo ob = new InnerClassDemo(10);
		Inner o = ob.getObject();
		o.setX(12);
		System.out.println(ob.x);
	}
}
