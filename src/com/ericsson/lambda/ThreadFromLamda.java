package com.ericsson.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ThreadFromLamda {

	public static void main(String[] args) {
//		Old ways to create a Thread 
//		Thread t1 = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				System.out.println(" Started the t1 thead ");
//			}
//		});

//		New ways

		/*
		 * Thread t1 = new Thread(() -> System.out.println("hi from t1"));
		 * 
		 * 
		 * 
		 * t1.start();
		 * 
		 * System.out.println(" started t1 from main thread ");
		 */

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//		numbers.forEach(new Consumer<Integer>() {
//			@Override
//			public void accept(Integer t) {
//				System.out.println(t);
//			}
//		});

		
//		numbers.forEach((e) -> System.out.println(e));
		
//		If it have For only arg No need of parenthesis around e
//		numbers.forEach(e -> System.out.println(e));
		
//	    If you are not doing anything with the arg then get rid of e and just using method reference	
//		numbers.forEach(System.out::println);
		
		
		
		// Find the total of double of even number
		
		
		int sum = numbers.stream()
		       .filter(e -> e % 2 == 0 )
		       .mapToInt(e -> e*2)
		       .sum();
//		       .forEach(System.out::println);
		
		System.out.println(sum);
		 
		 

		
		
	}

}
