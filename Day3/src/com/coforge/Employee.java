package com.coforge;
 
public class Employee {
private String  name;
private int id;
private static String companyName="coforge";
private double bSalary;
 
public Employee() {
	super();
}
 
public Employee(String name, int id, double bSalary) {
	super();
	this.name = name;
	this.id = id;
	this.bSalary=bSalary;
}
 
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
 
 
public double getSalary() {
	return bSalary;
}
 
public void setSalary(double salary) {
	this.bSalary = salary;
}
 
@Override
public String toString() {
	return "Employee [name=" + name + ", id=" + id + ", salary=" + bSalary + "]";
}
public void calcSalary() {
	double netSalary;
	if(this.bSalary>50000) {
		double hra=0.10;
		double da=0.10;
		netSalary=bSalary+bSalary*hra+bSalary*da;
		
	}
	else {
		 netSalary=bSalary;
	}
	System.out.println("Net Salary:"+netSalary);
}
 
 
}
 
 