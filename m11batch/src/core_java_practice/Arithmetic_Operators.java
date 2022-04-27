package core_java_practice;
import java.util.* ;
public class Arithmetic_Operators 
{
	public static void main(String[] args)
{	
	System.out.println("Enter your first no.: ");
	Scanner x =new Scanner(System.in);
	int a = x.nextInt();
	
	System.out.println("Enter your second no.: ");
	Scanner y = new Scanner(System.in);
	int b = y.nextInt();
	int c=a+b;
	System.out.println("\nAddition of these two numbers is: "+c);
	c=a-b;
	if(c<0)
	{ c*=-1; }
	System.out.println("Difference between these two numbers is: "+c);
	++a;	System.out.println("\nAfter using increament operator on 1st no.: "+a);	--a;
	--a;	System.out.println("After using decreament operator on 1st no.: "+a);	++a;
	++b;	System.out.println("After using increament Operator on 2nd no.: "+b);	--b;
	--b;	System.out.println("After using decreament operator on 2nd no.: "+b);	++b;
	
}
}