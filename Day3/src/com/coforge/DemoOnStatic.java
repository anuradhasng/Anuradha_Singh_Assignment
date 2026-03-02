package com.coforge;
 
public class DemoOnStatic {
//  static {
//	  System.out.println("this is my first static block");
//  }
//  static {
//	  System.out.println("this is my second static block");
//
//  }
  public static void main(String[]args) {
	  System.out.println("inside main");
	  DemoOnStatic ds =new DemoOnStatic();
	  ds.printName("ABC");
	  DemoOnStatic ds1= new DemoOnStatic();
	  ds1.printName("BCD");
 
  }
//  static {
//	  System.out.println("this is my third static block");
//
//  }
//  static {
//	  System.out.println("this is my fourth static block");
//
//  }
private String companyName="Coforge";
  public void printName( String name) {
	  System.out.println(name);
	  System.out.println(this.companyName);
  }
  
}
 
 