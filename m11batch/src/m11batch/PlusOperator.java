package m11batch;

public class PlusOperator {

	public static void main(String[] args) {
		String a= "Java";
		int b=10,c=20,d=30;
		System.out.println(a+b+c+d); //concatenation
		
		System.out.println(b+c+d+a); // addition then concatenation
		
		System.out.println(b+c+a+d);
		
		System.out.println(b+a+c+d);
	}

}
