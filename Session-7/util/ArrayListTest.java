package co.edureka.util;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		System.out.println(names+" | Size="+names.size());
		
		names.add("Anil");
		names.add("Sunil");
		names.add("Praveen");
		names.add("Naveen");
		names.add("Sunil");
		names.add("Rahul");
		System.out.println(names+" | Size="+names.size());
		
		names.add(1,"edureka");
		System.out.println(names+" | Size="+names.size());
		names.set(3, "Sanjay");
		System.out.println(names+" | Size="+names.size());
		
		System.out.println("Index of Sunil = "+ names.indexOf("Sunil"));
		System.out.println("Last Index of Sunil = "+ names.lastIndexOf("Sunil"));
		
		System.out.println(names.contains("edureka")); //true
		System.out.println(names.remove("Sunil")); //true
		System.out.println(names.remove(4)); //Sunil
		System.out.println(names+" | Size="+names.size());
		
		System.out.println("Person @ 0 = "+ names.get(0));
	}
}
