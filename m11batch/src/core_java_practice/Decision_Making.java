package core_java_practice;
import java.util.Scanner;
public class Decision_Making {

	public static void main(String[] args) {
		// decision making with operators ... OK
		Scanner a = new Scanner(System.in);
		System.out.println("Enter number: ");
		int x = a.nextInt();
		Scanner b = new Scanner(System.in);
		System.out.println("Enter number: ");
		int y = b.nextInt();
		if(x!=y)
		{
			if (x>y) {System.out.print("The Entered numbers are not equal\nHere, the first entered number which is ");	System.out.print(x+" is greater than the second entered number ");	System.out.print(y+"\n\n\n\tThank you for using our service!!!"); }
			else {System.out.print("The Entered numbers are not equal\nHere, the second entered number which is ");	System.out.print(y+" is greater than the first entered number ");	System.out.print(x+"\n\n\n\tThank you for using our service!!!");}
		}
		else
		{
			System.out.print("\nYou have entered equal numbers	\n\n\n\tThank you for using our service!!!");
		}
}

}