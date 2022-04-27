package m11batch;

public class Try_Catch_Demo {

	public static void main(String[] args) {
		System.out.println("I am the best");
		//no flow control statement
		try {
			System.out.println(2/0);
		}
		catch(ArithmeticException e)//inbuilt exception class
		{
			System.out.println("Can't divide by zero . . .");
			System.out.println(2/2);
			System.out.println(e);
		}
		System.out.println("Why i am not best");

	}

}
