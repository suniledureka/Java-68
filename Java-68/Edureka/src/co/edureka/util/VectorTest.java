package co.edureka.util;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		//Vector<Integer> v = new Vector<>(); //initial capacity = 10
		//Vector<Integer> v = new Vector<>(5); //initial capacity = 5
		Vector<Integer> v = new Vector<>(5,3); //initial capacity = 5, capacity increment=3
		
		System.out.println(v+" |Size="+v.size()+" |Capacity="+v.capacity());
		
		for(int i=10;i<=19;i++) {
			v.add(i);
		}
		System.out.println(v+" |Size="+v.size()+" |Capacity="+v.capacity());
		
		v.add(20);
		System.out.println(v+" |Size="+v.size()+" |Capacity="+v.capacity());
		
		//Iterator<Integer> it = v.iterator();
		Enumeration<Integer> en = v.elements();
		while(en.hasMoreElements()) {
			Integer n = en.nextElement();
			System.out.println(n);
			try {
				Thread.sleep(500);
			}catch(Exception ex) {}
		}
	}
}
