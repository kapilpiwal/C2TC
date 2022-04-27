package assignment2;

import java.util.Scanner;

public class Sum
{

	public static void main(String[] args)
	{
		// sum of natural numbers
		System.out.println("Enter the numbers upto which\nyou want sum of natural numbers = ");
		Scanner num = new Scanner(System.in);
		int total = num.nextInt();
		
		
		int i , sum = 0;  
		
		for(i = 1; i <= total; i++)  
		{  
		sum = sum + i;  
		}  
		 
		System.out.println("Sum of first " +total+ " Natural Numbers are = " + sum); 

	}

}
