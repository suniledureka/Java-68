package co.edureka.util;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		LinkedHashSet<String> names = new LinkedHashSet<>();
		System.out.println(names.add("Sunil")); //true
		System.out.println(names.add("Sunil")); //false
		names.add("Sanjay");
		names.add("Pankaj");
		names.add("Rahul");
		names.add("Anil");
		names.add("Bharath");
		
		System.out.println(names);
	}

}
