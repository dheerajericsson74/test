package com.ericsson.collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTest {

	public static void main(String[] args) {

		Book b1 = new Book("Walden", "Henry Thoreau", 1854);
		Book b2 = new Book("Walden", "Henry Thoreau", 1854);
		Book b3 = new Book("Harry Potter", "J K Rowling", 1977);
		Book b4 = new Book("Effective Java", "Joshua Bloch", 2008);

		
		Set<Book>	booksTreeSet=new TreeSet<>(new TitleComparator());
		
		booksTreeSet.add(b1);
		booksTreeSet.add(b2);
		booksTreeSet.add(b3);
		booksTreeSet.add(b4);
		
		booksTreeSet.forEach(book -> System.out.println(book) );
		
	/*	Set set = new HashSet();

		set.add(b1);
		set.add(b2);

		System.out.println(" set is --> " + set);*/
		
		
/*	Set<String>	ts=new TreeSet<>();
	ts.add("z");
	ts.add("b");
	ts.add("c");
	ts.add("m");
	ts.add("h");
	ts.add("x");
	ts.add("a");
	ts.add("b");
	System.out.println(ts);*/
	
	
	
	try {
		
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		
	}
	
		
	}

}

class Book /*implements Comparable*/ {
	private String name;
	private String author;
	private int year;

	public Book(String name, String author, int year) {
		super();
		this.name = name;
		this.author = author;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", year=" + year + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

/*	@Override
	public int compareTo(Object obj) {
		
    return getName().compareTo(((Book)obj).getName());
	}*/

}

class TitleComparator implements Comparator{

	@Override
	public int compare(Object Obj1, Object obj2) {
		
		return ((Book)Obj1).getAuthor().compareTo(((Book)obj2).getAuthor());
	}
	
	
}