package m11batch;
interface A
{
	void display_A(); // abstract and public
}
interface B
{
	void display_B();
}

class AB implements A,B
{
	public void display_A()
	{
		System.out.println("I am from interface A");
	}
	public void display_B()
	{
		System.out.println("I am from interface B");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		//date 15-03-2022
		AB obj = new AB();
		obj.display_A();
		obj.display_B();

	}

}
