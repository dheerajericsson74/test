package com.ericsson.collection.resource;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class ClassDemo {

	public static void main(String[] args) {
		
		

	      
	     /* URL baseUrl = cls.getResource("file.txt");
	      System.out.println(" baseURL -> "+baseUrl);
	      // finds resource relative to the class location
	      URL url;
		try {
			url = new URL(baseUrl, "file:/C:/MyData/sashakt-workspace/testjava8/src/file.txt");
		      //URL url = cls.getResource("file.txt");
		      System.out.println("Value = " + url);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		
		try {
			Properties currConfigProperties = new Properties();
			String configPropertiesFile = "../../../../file.txt";
			
			 ClassDemo c = new ClassDemo();
		   
			currConfigProperties.load(c.getClass().getResourceAsStream(configPropertiesFile));
			
			System.out.println("currConfigProperties  ->> "+currConfigProperties);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

/*	      // finds resource relative to the class location
	      url = cls.getResource("newfolder/a.txt");
	      System.out.println("Value = " + url);*/

	}

}
