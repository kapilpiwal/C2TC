package assignment2;

import java.util.Scanner;

public class Leap_Year
{

	public static void main(String[] args)
	{
		int year;
	      System.out.println("Enter an Year :: ");
	      Scanner kapil = new Scanner(System.in);
	      year = kapil.nextInt();

	      if (( (year % 4 == 0) && (year % 100!= 0) ) || (year%400 == 0))
	         {
	    	  System.out.println("Specified year is a leap year");
	    	 }
	      else
	         {
	    	  System.out.println("Specified year is not a leap year");
	         }
	}

}