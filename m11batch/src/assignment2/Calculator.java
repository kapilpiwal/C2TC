package assignment2;

import java.util.Scanner;

public class Calculator
{

	public static void main(String[] args)
	{
		//simple calculator using switch case
		
		System.out.println("What operation do you want to perform:\n1)Addition\n2)Substraction\n3)Multiplication\n4)Division");
		System.out.println("Enter operation number: ");
		Scanner operation= new Scanner(System.in);
		int calc = operation.nextInt();
		
		switch (calc)
		{
		case 1: System.out.println("Enter 1st number: ");
		Scanner x = new Scanner(System.in);		int a = x.nextInt();
		System.out.println("Enter 2nd Number: ");
		Scanner y = new Scanner(System.in); int b = y.nextInt();
		int c = a + b ;
		System.out.println("Addition is "+c);
		break;
		
		case 2: System.out.println("Enter 1st number: ");
		Scanner p = new Scanner(System.in);		int m = p.nextInt();
		System.out.println("Enter 2nd Number: ");
		Scanner q = new Scanner(System.in); int n = q.nextInt();
		int d = m - n ;
		System.out.println("Substraction is "+d);
		break;
		
		case 3: System.out.println("Enter 1st number: ");
		Scanner r = new Scanner(System.in);		int j = r.nextInt();
		System.out.println("Enter 2nd Number: ");
		Scanner s = new Scanner(System.in); int k = s.nextInt();
		int e = j * k ;
		System.out.println("Multiplication is "+e);
		break;
		
		case 4: System.out.println("Enter 1st number: ");
		Scanner u = new Scanner(System.in);		int g = u.nextInt();
		System.out.println("Enter 2nd Number: ");
		Scanner v = new Scanner(System.in); int z = v.nextInt();
		int f = g / z ;
		System.out.println("Division is "+f);
		break;
		
		default: System.out.println("Invalid Entry\tPlease try again.");
		break;
		}
	}

}
