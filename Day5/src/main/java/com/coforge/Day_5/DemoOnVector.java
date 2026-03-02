package com.coforge.Day_5;
import java.util.Enumeration;
import java.util.Vector;
 
public class DemoOnVector {
	public static void main(String[] args) {
		Vector<Integer> vector=new Vector<Integer>();
		
		System.out.println(vector.capacity());
		vector.ensureCapacity(22);
		System.out.println(vector.capacity());
		vector.add(12);
		vector.add(23);
		vector.add(34);
		vector.add(56);
		vector.add(78);
		vector.add(200);
		vector.add(566);
		vector.add(234);
		vector.add(100);
		vector.add(67);
		vector.add(57);
		vector.add(7888);
		vector.add(2390);
		vector.add(9000);
		vector.add(8000);
		vector.add(7000);
		vector.add(6000);
		vector.add(5000);
		vector.add(4000);
		vector.add(3000);
		vector.add(2000);
		vector.add(1000);
		vector.add(4500);
		
    	System.out.println(vector.capacity());
//		Enumeration<Integer> enums=vector.elements();
//		
//		while(enums.hasMoreElements())
//			System.out.println(enums.nextElement());
		vector.trimToSize();
		System.out.println(vector.size());
		
		vector.add(43);
		System.out.println(vector.capacity());
		
		
		
	
		
		
		
		
		
	}
 
}
 
 
 