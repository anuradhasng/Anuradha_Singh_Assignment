package com.coforge.Day_5;

import java.util.Comparator;

public class OrderCostComparator implements Comparator<Customer> {
	

	public int compare(Customer o1, Customer o2) {
		return (int)(o1.getOrdercost()-o2.getOrdercost());
	}

}
