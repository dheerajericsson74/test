package com.ericsson.lambda;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Predicate;
import java.util.function.Consumer;

@FunctionalInterface
interface Test{
	void apply();
}

public class LambdaTest {
	static int global =0;
	
	
	
	public static void go(Test test) {
		test.apply();
		
		int count =100;
		ExecutorService es = Executors.newFixedThreadPool(5);
		
		for(int i=0;i<5;i++) {
			es.submit(() -> System.out.println(count));
			es.submit(() -> System.out.println(global++));
		}
		
		
		
		es.shutdown();
	}
	
	public static void main(String[] args) {
		
		//new LambdaTest();
		LambdaTest.go(() -> System.out.println(" Inside go method"));
		
/*		Set<String> set = new TreeSet<String>(new Comparator<String>() {
			@Override
			public int compare(String str1, String str2) {
				return str1.length()-str2.length();
			}
		});
			*/

//		Set<String> setWithLambda = new TreeSet<String>((String s1, String s2) ->  { return str1.length()-str2.length();});
		
		
	}

}


