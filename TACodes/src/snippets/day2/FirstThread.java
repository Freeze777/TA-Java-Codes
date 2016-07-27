package snippets.day2;
class PrinterThread implements Runnable
{
	public void run()
	{
		System.out.println("Hello World");
	}
}
public class FirstThread 
{
	public static void main(String args[])
	{
		Thread t = new Thread(new PrinterThread());
		t.start();
		
	}
}
