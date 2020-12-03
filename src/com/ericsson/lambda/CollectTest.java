package com.ericsson.lambda;

import java.util.Arrays;

public class CollectTest {
	
	private static void overloadedReduction() {
		
		String[] grades = {"A","A","B"};
		
		String concate1 = Arrays.stream(grades)
				                .reduce("", (s1,s2) -> s1+s2);
		
		System.out.println("concate1 --> "+concate1);
		
		
		StringBuilder concate2 = Arrays.stream(grades)
				                       .reduce(new StringBuilder(),(sb,s2) -> sb.append(s2),(sb1,sb2) -> sb1.append(sb2));
		System.out.println("concate2 --> "+concate2);
		
		
	}
	

	public static void main(String[] args) {
		overloadedReduction();

	}

}
