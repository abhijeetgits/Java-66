package co.edureka.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Bank {

	public static void main(String[] args) throws InterruptedException {
		HashMap<String,Float> bank = new HashMap<String,Float>();
		
		System.out.println(bank.put("Sunil", 15000f)); //null
		bank.put("Naveen",25000f);
		bank.put("Sanjay",55000f);
		bank.put("Rahul",12500f);
		System.out.println(bank.put("Sunil", 11500.5f)); //15000.0
		System.out.println(bank);
		
		float bal = bank.get("Sunil");
		System.out.println("A/C Balance of Sunil = "+ bal);
		bal = bal + 1500.5f;
		bank.put("Sunil",bal);
		System.out.println(bank);
		
		System.out.print("A/C Holders  :  ");
		Set<String> keys = bank.keySet();
		for(String key : keys) {
			System.out.print(key+" | ");
		}
		System.out.println();
		System.out.println("---------------------------");
		
		Set<Map.Entry<String,Float>> entries = bank.entrySet();
		Iterator<Map.Entry<String,Float>> it = entries.iterator();
		
		while(it.hasNext()) 
		{
			Map.Entry<String,Float> entry = it.next();
			String name = entry.getKey();
			float balance =  entry.getValue();
			System.out.println(name+" - "+balance);
			Thread.sleep(1500);
		}
		
		bank.put(null,null);
		System.out.println(bank);
	}
}
