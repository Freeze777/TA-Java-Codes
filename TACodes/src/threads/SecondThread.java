package threads;
class SecondPrinterThread extends Thread
{
	public SecondPrinterThread()
	{
		super();
	}
	
	public void run()
	{
		try{
			while(true){
				System.out.print("Hello");
				Thread.sleep(1000);
				System.out.println(" world Thread");
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}
public class SecondThread 
{
	public static void main(String args[])throws Exception
	{
		Thread t = new SecondPrinterThread();
		t.start();
		t.join();
		System.out.println("Hello Main Thread");
	}
}
