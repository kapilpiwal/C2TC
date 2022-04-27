package m11batch;

import java.util.ArrayList;

public class Collection_Demo {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		
		l.add( 56 );
		l.add( 45.78 );
		l.add( "M11" );
		l.add( 'a' );
		l.add(  null  );
		
		l.add( 2 , "Kapil urf Hitesh" );
		
		l.remove( 1 );
		
		System.out.println( l );

	}

}
