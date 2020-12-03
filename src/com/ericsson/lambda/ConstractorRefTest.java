package com.ericsson.lambda;

import java.util.HashMap;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstractorRefTest {

	public static void main(String[] args) {
	
		Supplier<String> supplier = () -> new String();
		System.out.println(" 1 "+supplier.get());
		Supplier<String> supplier1 = String :: new;
		System.out.println("2 "+supplier1.get());
		
		
		Function<String,String> fun = s-> new String(s);
		System.out.println(" fun is --> "+fun.apply("JAVA"));
		
		Function<String,String> fun1 =String :: new;
		System.out.println(" fun is --> "+fun1.apply("KAVA"));
		
		
		BiFunction<Integer,Float,HashMap> biFun = (c, lf) -> new HashMap(c,lf);
		
		System.out.println(" New hashMap --> "+biFun.apply(100, 0.75f));

		
       BiFunction<Integer,Float,HashMap> biFun1 = HashMap::new;
		
		System.out.println(" New hashMap1 --> "+biFun1.apply(100, 0.75f));
		
		
		
		Consumer<String> consumer = String:: new;
		//No use :(
		consumer.accept("Hello Consumer");
	}

}
