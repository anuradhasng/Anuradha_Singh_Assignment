package com.coforge.Day_5;

import java.util.ArrayList;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
public class ArrayListClass {
	public static void main(String[] args) {
		
		ArrayList aList=new ArrayList();
		System.out.println("--------------------------------");
		aList.add("Anuradha");
		aList.add(56);
		aList.add(true);
		aList.add(78.87);
		aList.add(76.876);
		aList.add(67.87);
		aList.add('A');
		
		for(int i=0;i<aList.size();i++)
			System.out.println(aList.get(i));
		System.out.println("--------------------------------");
		aList.add(null);
		aList.add(null);
		for(int i=0;i<aList.size();i++)
			System.out.println(aList.get(i));
		
		System.out.println(aList);
		
		ArrayList<Integer>intAList=new ArrayList<Integer>();
		intAList.add(55);
		intAList.add(65);
		intAList.add(43);
		intAList.add(43);
		intAList.add(43);
		//intAList.add(null);
		System.out.println(intAList);
		
		for(int i=0;i<intAList.size();i++)
			System.out.println(intAList.get(i));
		
		for(int i:intAList)
			System.out.println(i);
		
		
		//Integer iobj=567;
		//int i1=iobj.intValue(); //Unboxing
		//Boxing: Rapping up of primitive values
		
		System.out.println("==================================");
		Iterator<Integer> itr=intAList.iterator();
		while(itr.hasNext())
		{
			Integer i=itr.next();
			if(i==43)
				itr.remove();
			System.out.println(i);
		}
		    System.out.println("After iteration arrayList is:");
			System.out.println(intAList);
		//Enumeration: It is a list, values are symbolic constraints,Has Elements
			System.out.println("Forward direction list values");
			ListIterator<Integer>listItr=intAList.listIterator();
			while(listItr.hasNext())
				System.out.println(listItr.next());
			System.out.println("Reverse direction of list values");
			while(listItr.hasPrevious())
				System.out.println(listItr.previous());
			
			ArrayList<Integer>aList1=new ArrayList<Integer>();
			aList1.add(65);
			aList1.add(78);
			aList1.add(87);
			System.out.println(aList1);
			intAList.addAll(5,aList1);
			
			System.out.println(intAList);
			intAList.remove(2);
			System.out.println(intAList);
			Integer i=138;
			intAList.remove(i);
			System.out.println(intAList);
			intAList.remove(i);
			System.out.println(intAList);
			
			intAList.removeAll(aList);
			System.out.println("After removal collection");
			System.out.println(intAList);
			System.out.println(aList);
			
			intAList.replaceAll(e->e+10);
			System.out.println(intAList);
			
			//System.out.println("Before clear"+aList);
			//aList.clear();
			//System.out.println("After clear"+aList);
			
			//Integer i1=999;
			//intAList.addFirst(i1);
			//System.out.println(intAList);
			
			ArrayList<Integer> clonedArrayList=(ArrayList<Integer>)aList.clone();
			System.out.println(clonedArrayList);
			
			System.out.println(aList.hashCode());
			System.out.println(clonedArrayList.hashCode());
			
			//clonedArrayList.add(87);
			aList.add(76);
			System.out.println(aList);
			System.out.println(clonedArrayList);
			System.out.println(aList.hashCode());
			System.out.println(clonedArrayList.hashCode());
			
			//Cloneable
			//javaserializable
			//Marker interface 
			 System.out.println(aList.contains(87));
			 System.out.println(aList.containsAll(intAList));
			 
			 aList.forEach(e->System.out.println(e));
			 System.out.println(aList.indexOf(98));
			 intAList.retainAll(aList);
			 System.out.println(intAList);
			 System.out.println(aList.toString().getClass());
			 
			 aList.sort(null);
			 //comparator is an iterface
			 Collections.sort(aList);
			 //Integer[] irr=aList.toArray(new Integer);		 
			 
			 
			 
			 
			 
			 
			 
			
			

			
		
		
		
	}

}
