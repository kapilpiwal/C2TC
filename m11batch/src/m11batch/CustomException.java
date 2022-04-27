package m11batch;
import java.util.*;

public class CustomException {

	public static void main(String[] args) {
		int age;
			System.out.println("Enter your age ...");
			Scanner s=new Scanner(System.in);
			age=s.nextInt();
			
			if(age<18)
			{
				throw new CantVote("You cannot cast your vote as age is less than 18");
			}
			else
			{
				System.out.println("You can vote...");
			}
	}

}
//exception class
class CantVote extends RuntimeException
{
	CantVote(String msg)
	{
		super(msg);
	}
}