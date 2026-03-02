package com.coforge.Day_5;

import java.util.Comparator;

public class CityComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		return o1.getCity().compareTo(o2.getCity());	
	
	}
	
}