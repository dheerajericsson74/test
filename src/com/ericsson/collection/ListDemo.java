package com.ericsson.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
	
	private static void iteratorDemo(List<Integer> list) {
		
		Iterator<Integer> itr =list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	
	
	public static void main(String[] args) {
	
		List<Integer> lst = new ArrayList<>();
		
		lst.add(2);
		lst.add(24);
		lst.add(16);
		lst.add(14);
		lst.add(33);
		lst.add(144);
		lst.add(2);
		lst.add(1);
		lst.add(86);
		lst.add(54);
		lst.add(60);
		lst.add(44);
		lst.add(96);
		lst.add(544);
		lst.add(86);
		lst.add(243);
		
		
		iteratorDemo(lst);
	}

}
