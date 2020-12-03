package com.ericsson.innerclasses;

public class DataTranslator {
	
	public static String getBookAsXml(int id,String title,double rating,int fbLikes,int tweetCount) {
		
		class Book{
			
			private int id;
			private String title;
			private double rating;
			private int fbLikes;
			private int tweetCount;
			
			public Book(int id, String title, double rating, int fbLikes, int tweetCount) {
				super();
				this.id = id;
				this.title = title;
				this.rating = rating;
				this.fbLikes = fbLikes;
				this.tweetCount = tweetCount;
			}
			
			Book bk = new Book(id,title,rating,fbLikes,tweetCount);
			//new StaxDriver()
			//XStream xstream = new XStream();
			
			
		}
		
		
		return null;
		
	}
	

}
