package m11batch;
import java.util.Scanner;
public class EvenOdd
{
	public static void main(String[] args)
	{
		Scanner reader= new Scanner(System.in);
		System.out.print("Enter your number : ");
		int num = reader.nextInt();
		
		if (num%2 == 0)
			System.out.println("\nNumber is Even");
		else
			System.out.println("\nNumber is Odd");

	}
	
}