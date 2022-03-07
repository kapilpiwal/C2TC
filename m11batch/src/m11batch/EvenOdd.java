package m11batch;
import java.util.Scanner;
public class EvenOdd {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a number\t:");
		int num = reader.nextInt();
		
		if (num%2 == 0)
			System.out.println("\n This is even number ");
		else
			System.out.println("\n This is odd number ");

	}

}