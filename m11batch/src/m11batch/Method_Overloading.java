package m11batch;

public class Method_Overloading {
	
	public void n()// signature is not same... method name  +  parameters
	{
		System.out.println("No arguments");
	}
	public void n(int i)
	{
		System.out.println("integer arguments");
	}
	public void n(double d)
	{
		System.out.println("double arguments");
	}

	public static void main(String[] args) {
		
		Method_Overloading obj=new Method_Overloading();
		obj.n(7.20); 
		
		obj.n(2);
		
		obj.n();// exact match
		
		// tell the output
		//automatic promotion will work here..
		
		obj.n('a');
		
		obj.n(22);
		
		obj.n(10l);
		
		obj.n(5.6f);

	}

}
