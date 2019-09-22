package co.edureka.util;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) 
	{		
		TreeSet<String> names = new TreeSet<>();
		System.out.println(names.add("Sunil")); //true
		names.add("Anil");
		names.add("Praveen");
		names.add("Rahul");
		names.add("Naveen");
		System.out.println(names.add("Sunil")); //false
		
		System.out.println(names);	
		//names.add(null); //java.lang.NullPointerException
		System.out.println(names);
	}
}
