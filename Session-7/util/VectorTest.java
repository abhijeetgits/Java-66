package co.edureka.util;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		//Vector<Integer> v = new Vector<Integer>();
		//Vector<Integer> v = new Vector<Integer>(5);
		Vector<Integer> v = new Vector<Integer>(5,3);
		
		System.out.println(v+" |Size="+v.size()+" |Capacity="+v.capacity());
		
		for(int i=11;i<=20;i++) {
			//v.add(i);
			v.add(Integer.valueOf(i));
		}
		System.out.println(v+" |Size="+v.size()+" |Capacity="+v.capacity());
		
		v.add(21);
		System.out.println(v+" |Size="+v.size()+" |Capacity="+v.capacity());
		
		Enumeration<Integer> en = v.elements();
		while(en.hasMoreElements()) {
			System.out.print(en.nextElement()+"  ");
			try {
				Thread.sleep(1000);
			}catch(Exception ex) {}
		}
	}
}
