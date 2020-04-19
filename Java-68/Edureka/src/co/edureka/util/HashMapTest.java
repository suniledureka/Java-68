package co.edureka.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) throws InterruptedException {
		HashMap<String,Float> bank = new HashMap<String,Float>();
		
		System.out.println(bank.put("Sunil",25000f)); //null
		System.out.println(bank.put("Sunil",11500.5f)); //25000.0
		
		bank.put("Anil",45000f);
		bank.put("Sanjay",50000f);
		bank.put("Naveen",10000.5f);
		
		System.out.println(bank);
		
		float bal = bank.get("Sunil");
		System.out.println("A/C Balance of Sunil = "+ bal);
		bal = bal + 1150.5f;
		bank.put("Sunil",bal);
		System.out.println(bank);
		
		System.out.println("-----------------------");
		System.out.print("A/C HOLDERS :  ");
		Set<String> names = bank.keySet();
		for(String name : names) {
			System.out.print(name+" | ");
		}
		System.out.println("\n----------------------");

		Set<Map.Entry<String,Float>> entries = bank.entrySet();
		Iterator<Map.Entry<String,Float>> it = entries.iterator();
		while(it.hasNext()) {
			Map.Entry<String,Float> entry = it.next();
			String key = entry.getKey();
			Float val = entry.getValue();
			System.out.println(key+" : "+val);
			Thread.sleep(1500);
		}
	}
}
