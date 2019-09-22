package co.edureka.util;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) throws InterruptedException {
		HashSet<String> names = new HashSet<String>();
		
		System.out.println(names.add("Sunil")); //true
		names.add("Anil");
		names.add("Praveen");
		names.add("Rahul");
		names.add("Naveen");
		System.out.println(names.add("Sunil")); //false
		
		System.out.println(names);
		
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			Thread.sleep(1000);
		}
		
		names.add(null);
		System.out.println(names);
	}
}
