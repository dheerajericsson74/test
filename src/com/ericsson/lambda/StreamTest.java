package com.ericsson.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {
	
		List<Bookmark> books = new ArrayList<>();
		
		Bookmark item1 = new Bookmark();
		item1.setId(2000);
		item1.setTitle("Use Final Liberally");
		item1.setRating(1.0);
		books.add(item1);
		
		Bookmark item2 = new Bookmark();
		item2.setId(2001);
		item2.setTitle("How do I import a pre-existing Java project into Eclipse and get up and running?");
		item2.setRating(2.5);
		books.add(item2);
		
		Bookmark item3 = new Bookmark();
		item3.setId(2002);
		item3.setTitle("Interface vs Abstract Class");
		item3.setRating(3.5);
		books.add(item3);
		
		Bookmark item4 = new Bookmark();
		item4.setId(2003);
		item4.setTitle("NIO tutorial by Greg Travis");
		item4.setRating(4.0);
		books.add(item4);
		
		Bookmark item5 = new Bookmark();
		item5.setId(2004);
		item5.setTitle("Virtual Hosting and Tomcat");
		item5.setRating(5.0);
		books.add(item5);
		
	List<Bookmark> booksList = books.stream()
			                        .filter(book -> book.getRating() >= 2.5)
			                        .collect(Collectors.toList());
	
	
//	booksList.forEach( System.out:: println);
	booksList.forEach( b -> System.out.println("id :"+b.getId()+",Title :"+b.getTitle()+",Rating :"+b.getRating()));
	}

}
