package com.ericsson.generics;

import java.io.Serializable;
import java.util.List;

public interface Container<T extends Number> {
	void set(T a);
	public T get();
	
	//public <E> E[] getAll(List<E> objList);
	
//	<T extends List & Serializable> void go(T Object);

}
