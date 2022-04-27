package core_java_practice;

public class Typecasting {

	public static void main(String[] args) {
		int x= 10;
		double y =x;
		System.out.print("x = "+x);	System.out.print("\ty = "+y);	System.out.println("\t\t. . . Implicit typecasting");
		
		double a = 20.532;
		int s = (int) a;
		System.out.print("\na = "+a); System.out.print("\tb = "+s);	System.out.print("\t\t. . . Explicit typecasting");

	}
}
