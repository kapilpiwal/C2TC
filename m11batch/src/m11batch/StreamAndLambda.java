package m11batch;

import java.util.*;
import java.util.stream.Stream;

public class StreamAndLambda {

	public static void main(String[] args) {
		
		List<Integer> orig=new ArrayList<Integer>();
		orig.add(23);
		orig.add(53);
		orig.add(78);
		orig.add(17);
		orig.add(0);
		orig.add(23);
		orig.add(33);
		orig.add(50);
		
		
		System.out.println(orig);
		
		Stream<Integer> stream=orig.stream();
		List<Integer> l=stream.filter(i->i<33).collect(Collectors.toList());
		System.out.println(l);
		
		long fail= l.stream().filter(i->i<33).count
	}

}
