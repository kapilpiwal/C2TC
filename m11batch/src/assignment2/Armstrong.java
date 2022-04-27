package assignment2;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// program to check Arm strong number
		
		System.out.println("Check here armstrong number = ");
		Scanner n = new Scanner(System.in);
		int num , number, temp, total = 0;
		num = n.nextInt();
        number = num;
        while (number != 0)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
            number /= 10;
        }

        if(total == num)
        {
        	System.out.println("\n"+num + " is an Armstrong number"); 
        }
        else
        {
        	System.out.println("\n"+num + " is not an Armstrong number");
        }

	}

}
