package core_java_practice;

import java.util.Scanner;

public class Decision_Making2 {

	public static void main(String[] args) {
		int x= 10, y=11;
		if ((x<y)||(x==y))
		{
			System.out.println("Condition is true");
		}
		else
		{
			System.out.println("Condition is false");
		}
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Boy's Age: ");
		int a = input.nextInt();
		int boyage = a;
		Scanner inputs = new Scanner(System.in);
		System.out.println("Enter girl's age: ");
		int girlage = inputs.nextInt();
		
		if ((boyage>=21)&&(girlage>=18))
		{System.out.println("ready to get married");}
		else {System.out.println("Wait for it kiddo!");}

	}

}
