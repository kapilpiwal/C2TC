package core_java_practice;

public class For_loop2
{

	public static void main(String[] args)
	{
		// if_else in this for loop
		
		int no = 8;
		boolean isPrime = true;
		for (int i = 2; i<no/2; i++)
		{
			if(no%i == 0)
			{
				isPrime= false;
			}
		}
		if(isPrime == true)
		{System.out.println("The number is a prime number");}
		else
		{System.out.println("The number is not a prime numbr");}

	}

}
