package m11batch;
import java.util.Scanner;
class SwitchHW {

	public static void main(String[] args) {
		byte x;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter 'x' =");
		x = s.nextByte();
		switch(x)
		{
		case 0: System.out.println(0); break;
		case 1: System.out.println(1);
		case 2: System.out.println(2);
		default: System.out.println("default statement");
		
		}
		

	}

}
