package com.ericsson.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class CollableLambda {

	public static int[] arrayInt = IntStream.rangeClosed(0, 10).toArray();

	public static void main(String[] args) {

		Callable<Integer> callableFirst = () -> {
			int sum = 0;

			for (int i = 0; i < arrayInt.length / 2; i++) {
				sum = sum + arrayInt[i];
			}

			return sum;
		};

		Callable<Integer> callableSecond = () -> {
			int sum = 0;

			for (int i = arrayInt.length / 2; i < arrayInt.length; i++) {
				sum = sum + arrayInt[i];
			}
			return sum;
		};

		ExecutorService es = Executors.newFixedThreadPool(2);
		List<Callable<Integer>> taskLst = Arrays.asList(callableFirst, callableSecond);

		try {
			List<Future<Integer>> result = es.invokeAll(taskLst);
			for(Future<Integer> r :result) {
				
				System.out.println(" result r isDone -> "+r.isDone()+" value -->"+r.get());
			}
		

		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
		es.shutdown();
	}

}
