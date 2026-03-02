package com.coforge.Day6;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
	static HashSet<Employee> empSet=new HashSet<Employee>();
	static {
		
		empSet.add(new Employee(123,"Anuradha",70000));
		empSet.add(new Employee(125,"Shruti",80000));
		empSet.add(new Employee(126,"Avantika",78000));
		empSet.add(new Employee(127,"Agrima",98000));
		
		
		
	}
public static void main(String[] args) {
	empSet.forEach(e->System.out.println(e));
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Employee details empId,empName,salary");
	Employee emp=new Employee(sc.nextLong(),sc.next(),sc.nextDouble());
	empSet.add(emp);
	System.out.println("Emter employee id for updation");
	long id=sc.nextLong();
	
		
		
	}

}
