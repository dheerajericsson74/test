package com.ericsson.lambda;

public class LamdaTheadTest {

	public static void main(String[] args) {
		

		
		
		new Thread(
				() ->{
					
					int sum =0;
					for(int i=0;i<=10;i++) {
						
						sum+=i;
					}
					System.out.println(" final sum is :"+sum);
				}
				
				).start();
	}

}
