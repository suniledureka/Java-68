package co.edureka.util;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> names = new HashSet<String>();
		
		System.out.println(names.add("Sunil")); //true
		System.out.println(names.add("Sunil")); //false
		names.add("Sanjay");
		names.add("Pankaj");
		names.add("Rahul");
		names.add("Anil");
		names.add("Bharath");
		names.add(null);
		
		System.out.println(names);
	}
}
