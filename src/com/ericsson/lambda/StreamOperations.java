package com.ericsson.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {
	// Print at most 5 DISTINCT books with rating >= 4.5
	// DB world: select distinct (ISBN) from book where rating >= 4.5 limit 0, 5;
	
	private static void slice(List<Book> books) {
		System.out.println("\nSlice ... ");
		//		Map<String,book> bookmap =
/*       books
       .stream()
       .filter(b -> b.getRating() >= 4.5)
       .distinct()
       .limit(5)
       .map(d -> d.getTitle()).
       forEach(System.out::println);*/
       
       
       List<String> bookTitleLst =books
    		                     .stream()
    		                     .filter(b -> b.getRating() >= 4.5)
    		                     .map(d -> d.getTitle())
    		                     .collect(Collectors.toList());
		
       System.out.println(bookTitleLst);
       
       
       
       
       String bookTitle =books
    		                     .stream()
    		                     .filter(b -> b.getRating() >= 4.5)
    		                     .map(d -> d.getTitle())
    		                     .collect(Collectors.joining(","));
		
       System.out.println(bookTitle);
       
       
       
       
       
	}
	
	
	private static void match(List<Book> books) {
		
		System.out.println("\n Matching...... ");
		
		boolean anyMathc = books
				                 .stream()
				                 .anyMatch(d -> d.getRating() >= 4.8 && d.getPrice() <= 50.0);
		System.out.println(" anyMathc -> "+anyMathc);
		
		
		boolean isAllMatch =books.stream().allMatch(d -> d.getRating() >= 4.8);
		System.out.println(" isAllMatch -->"+isAllMatch);
	}
	
	private static void find(List<Book> books) {
		
		System.out.println("\n finding...... ");
		
		Optional<Book> b =books.stream().filter(d -> d.getRating() >= 4.5 && d.getPrice() <= 50.0).findAny();
		
		
	   if(b.isPresent()) {
		System.out.println(" finding -->"+b.get());
	   }
	}

	public static void main(String[] args) {

		List<Book> books = new ArrayList<>();

		books.addAll(getFromAmazon("java"));
		books.addAll(getFromBarnesAndNoble("java"));

		//slice(books);
		//match(books);
		find(books);
	}

	static List<Book> getFromAmazon(String keyword) {
		Book b1 = new Book(9780596009201L, "Java 1", 4.0, 25.0, "Amazon");
		Book b2 = new Book(9780596009202L, "Java 2", 4.1, 25.0, "Amazon");
		Book b3 = new Book(9780596009203L, "Java 3", 4.5, 25.0, "Amazon");
		Book b4 = new Book(9780596009204L, "Java 4", 4.5, 25.0, "Amazon");
		Book b5 = new Book(9780596009205L, "Java 5", 3.9, 30.0, "Amazon");
		Book b6 = new Book(9780596009206L, "Java 6", 4.8, 40.0, "Amazon");
		Book b7 = new Book(9780596009207L, "Java 7", 4.9, 40.0, "Amazon");
		Book b8 = new Book(9780596009208L, "Java 8", 4.7, 50.0, "Amazon");
		Book b9 = new Book(9780596009209L, "Java 9", 4.3, 50.0, "Amazon");
		Book b10 = new Book(9780596009210L, "Java 10", 4.5, 60.0, "Amazon");

		return Arrays.asList(b1, b2, b3, b4, b5, b6, b7, b7, b8, b9, b10);
	}

	static List<Book> getFromBarnesAndNoble(String keyword) {
		Book b1 = new Book(9780596009201L, "Java 1", 3.9, 20.0, "B&N");
		Book b2 = new Book(9780596009202L, "Java 2", 4.1, 20.0, "B&N");
		Book b3 = new Book(9780596009203L, "Java 3", 4.6, 20.0, "B&N");
		Book b4 = new Book(9780596009204L, "Java 4", 4.5, 20.0, "B&N");
		Book b5 = new Book(9780596009211L, "Java 11", 4.9, 40.0, "B&N");
		Book b6 = new Book(9780596009212L, "Java 12", 4.9, 55.0, "B&N");
		Book b7 = new Book(9780596009213L, "Java 13", 4.9, 60.0, "B&N");

		return Arrays.asList(b1, b2, b3, b4, b5, b6, b7);
	}

}
