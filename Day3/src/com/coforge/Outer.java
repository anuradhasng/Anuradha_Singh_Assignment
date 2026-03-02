package com.coforge;
 
public class Outer {
static String name;
public static void printDetails() {
	name="abc";
	System.out.println("Name "+ name);
}
static class Inner{
	private String innerName;
	public void printDetailsOfInnername() {
		this.innerName="Mia";
		System.out.println(innerName);
	}
}
public static void main(String[]args) {
//	 Outer out = new Outer();
//	 out.printDetails();
//	 Outer.Inner in= new Outer().new Inner();
//	 in.printDetailsOfInnername();
	 Outer.name="abc";
	 Outer.printDetails();
	 Inner inner=new Inner();//if inner class is static we don't need outer
	 inner.printDetailsOfInnername();
}
}
 
 