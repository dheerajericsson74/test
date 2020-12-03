package com.ericsson.innerclasses;

import java.util.Arrays;
import java.util.Comparator;

interface CacheIterator {
	boolean hasNext();
	Bookmark next();
}

public class Cache {

	private Bookmark[] items;
	private int next = 0;

	public Cache(int size) {
		items = new Bookmark[size];
	}

	public void add(Bookmark item) {

		if (next < items.length) {
			items[next++] = item;
		}
		
	}
	
	public 	CacheIterator itrator()
	{
		return new MyCacheIterator();
	}
	private class MyCacheIterator implements CacheIterator{
        private int i=0;
		@Override
		public boolean hasNext() {
			return i < items.length;
		}

		@Override
		public Bookmark next() {
			return items[i++];
		}
		

	}
	
	 public static void main(String[] args) {
		
		 Cache cache = new Cache(4);
		 Bookmark bm =new Bookmark();
		 bm.setId(1000L);
		 bm.setTitle("Alpha");
		 bm.setRating(1.0);
		 
		 Bookmark bm1 =new Bookmark();
		 bm1.setId(1001L);
		 bm1.setTitle("Beta");
		 bm1.setRating(5.0);
		 
		 Bookmark bm2 =new Bookmark();
		 bm2.setId(1002L);
		 bm2.setTitle("Gama");
		 bm2.setRating(2.3);
		 
		 Bookmark bm3 =new Bookmark();
		 bm3.setId(1003L);
		 bm3.setTitle("Theta");
		 bm3.setRating(2.8);
		 
		 cache.add(bm);
		 cache.add(bm1);
		 cache.add(bm2);
		 cache.add(bm3);
		 
		 CacheIterator itr= cache.itrator();
		 
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
			 
		 }
		 
		 Arrays.sort(cache.items,new Comparator<Bookmark>() {

			@Override
			public int compare(Bookmark b1, Bookmark b2) {
				return b1.getRating() < b2.getRating() ? 1 : -1;
			}
			 
			 
		 });
		 
		 System.out.println(">>>  Sorted by  Anonymous Class >>>");
		 CacheIterator itr1= cache.itrator();
		 while(itr1.hasNext()) {
			 System.out.println(itr1.next());
			 
		 }
		 
		 
		// Arrays.sort(cache.items,(Bookmark b1, Bookmark b2) -> {return (b1).compareTo(b2.getRating()) ;});
		 
	}

}


