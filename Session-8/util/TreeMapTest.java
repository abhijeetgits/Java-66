package co.edureka.util;

import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap<String,Float> bank = new TreeMap<>();
		System.out.println(bank.put("Sunil", 15000f)); //null
		bank.put("Naveen",25000f);
		System.out.println(bank.put("Sanjay",55000f)); //null
		bank.put("Rahul",12500f);
		System.out.println(bank.put("Sunil", 11500.5f)); //15000.0
		System.out.println(bank);
		
		bank.put("Pankaj",null);
		System.out.println(bank);
		bank.put(null,15250f); //java.lang.NullPointerException
		System.out.println(bank);
	}

}
