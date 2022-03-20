package m11batch;

public class Test {

	public static void main(String[] args) {
		// 11-march-2022
		/*int[][] x = new int[4][];
		x[0]=new int[3]; x[1]=new int[2]; x[2]=new int[1]; x[3]= new int[1];
		x[0][2]=456;
		System.out.println(x[0][2] + " = x[0][2]");*/
		int[][][] x= {{{10,20,30},{40,50,60}},{{70,80},{90,100,110}}};
		System.out.println(x[0][1][2]);
		System.out.println(x[1][0][1]);
		System.out.println(x[1][1][1]);
		System.out.println(x[1][2][0]);
		System.out.println(x[2][1][0]);
		
		
	}

}
