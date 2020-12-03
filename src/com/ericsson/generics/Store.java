package com.ericsson.generics;

public class Store<T extends Number> implements Container<T> {
     private T a;
	
	public void set(T a) {
		this.a =a;

	}
	public T get() {
		return a;
	}

}
