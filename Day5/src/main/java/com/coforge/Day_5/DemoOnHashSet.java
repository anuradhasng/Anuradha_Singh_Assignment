package com.coforge.Day_5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.function.Predicate;

public class DemoOnHashSet {
	public static void main(String[] args) {
		HashSet<Integer> hset=new HashSet<Integer>();
		hset.add(87);
		hset.add(65);
		hset.add(62);
		hset.add(28);
		System.out.println(hset);
		
		hset.add(90);
		System.out.println(hset);
		//hset.add(null);
		System.out.println(hset);
		
		for(Integer i:hset)
			System.out.println(i);
		    Predicate<Integer> isEven=(e)->e%2==0;
		    hset.removeIf(isEven);
		    System.out.println(hset);
		    
		    LinkedHashSet<Integer> lset=new LinkedHashSet<Integer>();
		    
		    lset.add(76);
		    lset.add(77);
		    lset.add(97);
		    lset.add(75);
		    
		    System.out.println(lset);
		    
		    //LinkedHashSet
		    //Stack
		    //Queue- Dequeue, Priority Queue
		    
		    Iterator<Integer> itr=lset.iterator();
		    while(itr.hasNext())
		    	System.out.println(itr.next());
		    
		    
	}

}
