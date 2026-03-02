package com.coforge;
 
public class Student {
private String sname;
private int id;
 
public Student() {
	super();
}
 
 
public Student(String sname, int id) {
	super();
	this.sname = sname;
	this.id = id;
}
private static CollegeAddress address;
 
 
public static CollegeAddress getAddress() {
	return address;
}
 
 
@Override
public String toString() {
	return "Student [sname=" + sname + ", id=" + id + ",CollegeAddress="+address+" ]";
}
 
 
public static void setAddress(CollegeAddress address) {
	Student.address = address;
}
 
 
static class CollegeAddress{
	 private String city;
	 private String state;
	 private long pincode;
	 public CollegeAddress() {
		super();
	 }
	 public CollegeAddress(String city, String state, long pincode) {
		super();
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	 }
	 @Override
	 public String toString() {
		return "CollegeAddress [city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	 }
	
}
public static void main(String[] args) {
	CollegeAddress address=new CollegeAddress("HYD","Telegana",500032);
	Student s1=new Student("Abc",123);
	setAddress(address);
	System.out.println(s1);
	Student s2=new Student("def",133);
	System.out.println(s2);
 
}
}
 
 