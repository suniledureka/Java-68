package co.edureka.util;

import java.util.ArrayList;

public class ArrayListTest 
{
	public static void main(String[] args) 
	{
		ArrayList<String> names = new ArrayList<String>();
		System.out.println(names+" | Size="+names.size());
		
		names.add("edureka");
		names.add("Sunil");
		names.add("Sanjay");
		names.add("Praveen");
		names.add("Pankaj");
		names.add("Roshan");
		names.add("Sunil");
		System.out.println(names+" | Size="+names.size());
		
		names.add(1,"Rahul");
		System.out.println(names+" | Size="+names.size());
		
		names.set(4, "PRAVEEN");
		System.out.println(names+" | Size="+names.size());
		
		System.out.println("Is PRAVEEN in List: "+names.contains("PRAVEEN"));
		
		System.out.println("Person @ Index 0 = "+ names.get(0));
		
		System.out.println("Index of Sunil = "+ names.indexOf("Sunil"));
		System.out.println("Last Index of Sunil = "+ names.lastIndexOf("Sunill")); //-1
		
		System.out.println(names.remove(1));// Rahul
		System.out.println(names.remove("Rahul")); 
		
		System.out.println(names+" | Size="+names.size());
	}
}
