package m11batch;

public class Generics_Demo {

	public static void main(String[] args) {
		Cont<Integer> obj1=new Cont<>();
		obj1.value=2;
		
		obj1.show();

	}

}

class Cont<T>
{
	T value;
	void show()
	{
		System.out.println(value);
		
		System.out.println(value.getClass().getName());
	}
}