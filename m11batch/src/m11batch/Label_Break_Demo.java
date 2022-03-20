package m11batch;

public class Label_Break_Demo {

	public static void main(String[] args) {
		int x=0;
		l:
		{
			System.out.println("Login");
			
			if(x==0)
				break l;
			
			System.out.println("End");
		}
System.out.println("Hello");
	}

}
