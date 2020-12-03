package com.ericsson.innerclasses;

public class Bookmark {
	private long id;
	private String title;
	private double rating;
	
	
	
	
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "Bookmark [id=" + id + ", title=" + title + ", rating="+rating+"]";
	}
	
	

}
