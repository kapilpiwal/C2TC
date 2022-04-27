package m11batch;

public class Multithreading_demo {

	public static void main(String[] args) 
	{
		MyThread obj=new MyThread();
		obj.start();
		// main thread
		for (int i=0;i<10;i++)
		{
		System.out.println("I am MainThread...");
		}
	}

}
//thread
class MyThread extends Thread // try using runnable interface
{
	// override the run()
	public void run()
	{for (int i=0;i<10;i++)
	{
		System.out.println("I am MyThread...");
	}
		
	}
}