package com.coforge;

public class Person {
	
	 private String name;
	 private int age;//instance variable,non static variables, object variables
	 public Person() {
		 
		 System.out.println("this is default constructor");
		
	 }
	 public Person(String name, int age) {
		this();
		this.name = name.toUpperCase();
		this.age = age;
	 }
	 
	 public Person(String name) {
		 this(name,20);
		 System.out.println("constructor with one parameter");
		 
	 }
	 
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public int getAge() {
		 return age;
	 }
	 public void setAge(int age) {
		 this.age = age;
	 }
	 @Override
	 public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	 }
	 
	
	
}