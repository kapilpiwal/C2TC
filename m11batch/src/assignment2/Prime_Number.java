package assignment2;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		// check prime number
		
		int x;
		boolean a=true;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num=scan.nextInt();
	        
		for(int i=2;i<=num/2;i++)
		{
	           x=num%i;
		   if(x==0)
		   {
		      a=false;
		      break;
		   }
		}
		
		//If 'a' is true then the number is prime else not
		if(a)
		   System.out.println("\n"+num + " is a Prime Number");
		else
		   System.out.println("\n"+num + " is not a Prime Number");

	}

}