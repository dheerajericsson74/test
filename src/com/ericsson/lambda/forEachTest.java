package com.ericsson.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class forEachTest {
	
	
	static Integer[] intArr=  new Integer[]{1,2,3,4,5,6,7,8,9};
	
	static List<Integer> numbers = Arrays.asList(intArr);

	static AtomicInteger index = new AtomicInteger(4);
	static AtomicInteger zeroCount = new AtomicInteger(intArr.length);
	
	
	public static Integer squreLst(Integer i){
		if(numbers.indexOf(i) <= index.get()) {
		return i*i;
		}else {
			return i;
		}
	}
	
	public static boolean isZero(Integer i){
		if( i  == 0 ) {
			zeroCount.getAndIncrement();
			System.out.println(" zeroCount "+zeroCount.get());
		return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.println(" before --> "+numbers);
		
		System.out.println(" index --> "+index);
		  List<Integer> num=numbers.stream() .map( forEachTest:: squreLst )
		  .collect(Collectors.toList());
		  
		  System.out.println(" after --> "+num);
		 
		       
		
		
	//	numbers.forEach(i -> System.out.println(i));

		
		
		
		/*
		 * //#01 way of using System.out.println(" #01 way of using");
		 * numbers.forEach(new Consumer<Integer>() {
		 * 
		 * @Override public void accept(Integer t) { System.out.print(t); } });
		 * System.out.println(""); System.out.println(" --");
		 * System.out.println(" #02 way of using");
		 * 
		 * numbers.forEach((Integer e) -> System.out.print(e));
		 * 
		 * System.out.println(""); System.out.println(" --");
		 * System.out.println(" #03 way of without Type using");
		 * 
		 * numbers.forEach((e) -> System.out.print(e));
		 * 
		 * System.out.println("");System.out.println(" --");
		 * System.out.println(" #03 way of without without () using");
		 * 
		 * numbers.forEach(e -> System.out.print(e));
		 * 
		 * System.out.println(""); System.out.println(" --");
		 * 
		 * 
		 * System.out.println(" #04 way of Method Ref using");
		 * 
		 * numbers.forEach(System.out::print);
		 * 
		 * System.out.println(""); System.out.println(" --");
		 */
		
		
		
		
		
		
	}

}
