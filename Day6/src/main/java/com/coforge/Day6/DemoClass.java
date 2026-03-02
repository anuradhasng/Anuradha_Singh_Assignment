package com.coforge.Day6;

public class DemoClass {
	
	public static void calculate() {
		int a=5,b=0;
		if(b==0)
			throw new ArithmeticException();
		else
			System.out.println(a/b);
	}
	
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            calculate();
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			
		}
System.out.println("Application completed");
 
	}
 
}
 
 