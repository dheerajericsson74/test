package com.ericsson.functionalprogramming;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<String> consumerStr = (str) -> {
			
			System.out.println(" input to consumer is --> "+str);
		};  

		
		consumerStr.accept(" hello !!! ");
		
		
		
		Consumer<Integer> consumerInt = (x) -> {
			
			System.out.println(" input is x   -> "+x);
			
		};
		
		
		consumerInt.accept(100);
		
		
		IntConsumer cInt = (a)->{ System.out.println("the squre of IntConsumer a : "+a+" --> "+a*a );};
		cInt.accept(100);
		
		LongConsumer cLong = (a)->{ System.out.println("the squre of LongConsumer a : "+a+" --> "+a*a );};
		cLong.accept(123456789);
		
		
		DoubleConsumer cDouble = (a)->{ System.out.println("the squre of DoubleConsumer a : "+a+" --> "+a*a );};
		cDouble.accept(5.5);
		
	}

}
