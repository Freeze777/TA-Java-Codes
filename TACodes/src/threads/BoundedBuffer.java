/**
*This program implements the Bounded Buffer problem over ring buffer
*@author Prachi Prakash Mahapatro
*
*/

package threads;

class RingBuffer
{
	int buf[];
	int readFrom;
	int writeTo;
	boolean full;
	boolean empty;

	public RingBuffer(int size)
	{
		buf = new int[size];
		readFrom = -1;
		writeTo = 0;
		full = false;
		empty = true;
	}

	public synchronized void put(int item) 
	{
		if(full)
			return;
		
		buf[writeTo] = item;

		if(readFrom == -1){
			readFrom = 0;
			empty = false;
		}
		
		

		writeTo = (writeTo + 1)%buf.length;

		if(readFrom == writeTo){
			full = true;
			empty = false;
		}

		System.out.println("Produced: "+ item);
				


	}

	public synchronized int get()throws Exception
	{
		
		if(empty)
			throw new Exception("buffer is empty");

		int item = buf[readFrom];

		readFrom = (readFrom + 1)%buf.length;
		
		if(readFrom == writeTo){
			empty = true;
			full = false;
			readFrom = -1;
			writeTo = 0;
		}

		System.out.println("Consumed "+item);
		return item;


	}
}

class ProducerThread implements Runnable
{
	private RingBuffer buffer;

	public ProducerThread(RingBuffer buffer)
	{
		this.buffer = buffer;
	}
	public void run()
	{
		int count =0;
		while(true){

			try{
 
				while(buffer.full)
					Thread.sleep(100);

				
				buffer.put(count++);
				//System.out.println("Produced: "+count++);
			}

			catch(InterruptedException ex){
				System.out.println(ex);
			}


		}
	}
}

class ConsumerThread implements Runnable
{
	private RingBuffer buffer;

	public ConsumerThread(RingBuffer buffer)
	{
		this.buffer = buffer;
	}

	public void run()
	{
		while(true){

			try{

				while(buffer.empty)
					Thread.sleep(100);

				buffer.get();

			}

			catch(InterruptedException ex){
				System.out.println(ex);
			}

			catch(Exception ex){
				System.out.println(ex);
			}
		}
	}

}

public class BoundedBuffer
{
	public static void main(String args[])
	{
		RingBuffer rb = new RingBuffer(5);

		new Thread(new ProducerThread(rb)).start();
		new Thread(new ProducerThread(rb)).start();
		new Thread(new ProducerThread(rb)).start();
		new Thread(new ConsumerThread(rb)).start();
	}	
}