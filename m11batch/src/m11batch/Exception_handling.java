package m11batch;

public class Exception_handling {
	public static void main(String args[])
	{
		try
		{
			throw new NullPointerException("Hello");
			
			
		}
		catch(ArithmeticException e)
		{
			System.out.print("B");
		}
	}
}