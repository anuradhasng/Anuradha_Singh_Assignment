package com.coforge;
 
public class EmployeeMain {
 
	public static void main(String[] args) {
	Employee e1= new Employee("A",123,70000);
	Employee e2= new Employee("B",124,40000);
	Employee e3= new Employee("C",125,30000);
    e1.setCompanyName("Ct");
	System.out.println(e1);
	System.out.println(e2);
	System.out.println(e3);
 
	e1.calcSalary();
	e2.calcSalary();
	e3.calcSalary();
	}
 
}
 
 