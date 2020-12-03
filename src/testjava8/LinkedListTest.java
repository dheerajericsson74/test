package testjava8;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> llist = new LinkedList<>();
		llist.add("First");
		llist.add("Second");
		llist.add("Third");
		llist.add("Fourth");
		llist.add("Fifth");
				

		System.out.println(llist);
		llist.stream().forEach(System.out::println );
		
		Integer[] numbers = {1,2,3,4,5,6,7,8,9,10};
		List<Integer> Nlist = new LinkedList<>();
		
		Nlist.addAll(Arrays.asList(numbers));
		
		System.out.println(Nlist);
		
		//System.out.println(Nlist.toArray(a));
	}

}
