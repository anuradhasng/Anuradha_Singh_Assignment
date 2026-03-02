package com.coforge.Day_5;

public class Customer implements Comparable <Customer> {
	
	private int custid;
	private String custName;
	private String city;
	private double ordercost;
	public Customer() {
		super();
	}
	public Customer(int custid, String custName, String city, double ordercost) {
		super();
		this.custid = custid;
		this.custName = custName;
		this.city = city;
		this.ordercost = ordercost;
	}
	
	
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getOrdercost() {
		return ordercost;
	}
	public void setOrdercost(double ordercost) {
		this.ordercost = ordercost;
	}
	@Override
	public String toString() {
		return "CustomerClass [custid=" + custid + ", custName=" + custName + ", city=" + city + ", ordercost="
				+ ordercost + "]";
	}
//	@Override
//	public int compareTo(CustomerClass o) {
//		
//		return (int)(this.getOrdercost()-o.getOrdercost());
//	}
//	@Override
//	public int compareTo(CustomerClass o) {
//		
//		return this.getCustName().compareTo(o.getCustName());
//	}
	@Override
	public int compareTo(Customer o) {
		
		return this.getCity().compareTo(o.getCity());
	}
	
	
	
	
	
	
	
	
 
}
 
 
 