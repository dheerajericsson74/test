package com.ericsson.generics;

import java.util.ArrayList;
import java.util.Collection;

public class Demo {
	
	
	public static <T> void typeArgInference(T Object) {
		
		System.out.println(" Type Argument: "+Object.getClass().getName());
	}
	
	static <T> void arrayToCollection(T[] arrayObj,Collection<T> collectionObj) {
		for(T o:arrayObj) {
			collectionObj.add(o);
		}

		System.out.println(" Final Collection  --> "+collectionObj);
	}

	public static void main(String[] args) {
     
		 		
//		Container<Integer> s1 = new Store<>();
//		
//		s1.set(1);
//		
//		System.out.println(" store ->"+s1.get());
//
//		
//		
//       Container<Double> s2 = new Store<>();
//		
//		s2.set(1.00);
//		
//		System.out.println(" store ->"+s2.get());
		
//		typeArgInference(1.0);
//		typeArgInference("JAVA");
//		typeArgInference(123);
		
		Integer[] na = new Integer[10];
		na[0] = 100;
		na[1] = 102;
		na[2] = 103;
		na[3] = 105;
		
		Collection<Integer> cs = new ArrayList<>();
		
		arrayToCollection(na,cs);
		
		
	}

}
