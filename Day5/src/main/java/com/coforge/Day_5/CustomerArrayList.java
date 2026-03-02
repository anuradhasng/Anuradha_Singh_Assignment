package com.coforge.Day_5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class CustomerArrayList {
	
	public static void main(String[] args) {
		Customer c1=new Customer(1,"Aparna","Chennai",98000);
		Customer c2=new Customer(2,"Aman","Mumbai",78000);
		Customer c3=new Customer(3,"Anuj","Hyderbad",79000);
		Customer c4=new Customer(4,"Astha","Mumbai",99000);
		Customer c5=new Customer(5,"Arun","Bangalore",65000);
		
		ArrayList<Customer> custList=new ArrayList<Customer>();
		custList.add(c1);
		custList.add(c2);
		custList.add(c3);
		custList.add(c4);
		custList.add(c5);
		
		
		Collections.sort(custList);
		custList.forEach(cust->System.out.println(cust));
		
		
		
		
	}

}
