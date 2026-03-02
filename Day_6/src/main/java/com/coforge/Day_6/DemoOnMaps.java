package com.coforge.Day_6;


import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.ObjIntConsumer;
 
 
public class DemoOnMaps {
	
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap=new HashMap<Integer, String>();
		hashMap.put(1,"Shruti");
		hashMap.put(1,"Smriti");
		hashMap.put(1,"Sneha");
		hashMap.put(1,"Akriti");
		
		System.out.println(hashMap);
		for(Integer key:hashMap.keySet())
			System.out.println(key);
	    for(String val:hashMap.values())
	    	System.out.println(val);
	    //hashMap.put(null, "Sneha");
	    //System.out.println(hashMap);
		
	    System.out.println(hashMap.containsKey(5));
	    System.out.println(hashMap.containsValue("Sneha"));
	    Set<Entry<Integer, String>> entrySet=hashMap.entrySet();
	    System.out.println(entrySet);
	    
	    Iterator<Entry<Integer, String>> itr=entrySet.iterator();
	    while(itr.hasNext())
	    	System.out.println(itr.next());
	    System.out.println(hashMap.get(6));
	    
	    TreeMap<Integer, String> fruitTree=new TreeMap<Integer, String>();
	    fruitTree.put(1,"Apple");
	    fruitTree.put(2,"Banana");
	    fruitTree.put(3,"Orange");
	    fruitTree.put(4,"Apple");
	    fruitTree.put(5,"Orange");
	    
	    System.out.println(fruitTree);
	    
	    for(Integer key:fruitTree.keySet())
	    	System.out.println(key+"----->"+fruitTree.get(key));
	    
	    
	    
	    
	    
		
		
	}
 
}
 
 
