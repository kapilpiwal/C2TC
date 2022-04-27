package m11batch;

public class Exception_Demo {

	public static void main(String[] args) { // default exception handling
		
		m();

	}
	static	void m()
		{
			n();
		}
	static	void n()
		{
			System.out.println(10/0);
		}
}
