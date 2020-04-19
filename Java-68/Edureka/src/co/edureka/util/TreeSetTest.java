package co.edureka.util;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<>();
		
		System.out.println(names.add("Sunil")); //true
		System.out.println(names.add("Sunil")); //false
		names.add("Sanjay");
		names.add("Pankaj");
		names.add("Rahul");
		names.add("Anil");
		names.add("Bharath");
		//System.out.println("Sanjay".compareTo("Sunil"));
		
		//names.add(null); //java.lang.NullPointerException
		System.out.println(names);
	}
}
