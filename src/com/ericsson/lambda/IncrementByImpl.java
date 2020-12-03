package com.ericsson.lambda;

public class IncrementByImpl {

	public static void main(String[] args) {

		
		
		IncrementByInterface IncrmByInc = ( num) -> num + 5;
		
		
		System.out.println(IncrmByInc.incrementByNum(100));
		
	}

}
