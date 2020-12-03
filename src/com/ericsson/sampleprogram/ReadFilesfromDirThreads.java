package com.ericsson.sampleprogram;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

public class ReadFilesfromDirThreads {

	
	
	public static void listFilesForFolder(final File folder) {
	    for (final File fileEntry : folder.listFiles()) {
	        if (fileEntry.isDirectory()) {
	            listFilesForFolder(fileEntry);
	        } else {
	            System.out.println(fileEntry.getName());
	        }
	    }
	}
	
	
	public static void listFilesForFoldersNew() throws IOException {
		
		
		try (Stream<Path> paths = Files.walk(Paths.get("C:\\Users\\eshdhee\\Desktop\\Income-Tax"))) {
		    paths
		        .filter(Files::isRegularFile)
		        .forEach(System.out::println);
		} 
	}
	
	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(10);

		executorService.execute(new Runnable() {
		    public void run() {
		        System.out.println("Asynchronous task");
		        try {
		        	  System.out.println("Thread from pool --> "+Thread.currentThread().getId());
					listFilesForFoldersNew();
				} catch (IOException e) {
				
					e.printStackTrace();
				}
		    }
		});

		executorService.shutdown();
		
//		final File folder = new File("C:\\Users\\eshdhee\\Desktop\\Income-Tax");
//		listFilesForFolder(folder);
//		try {
//			listFilesForFoldersNew();
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
	}

}
