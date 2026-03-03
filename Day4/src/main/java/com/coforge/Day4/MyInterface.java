package com.coforge.Day4;

public interface MyInterface {
	public void display();
	
	public default void printDetails() {
		
		System.out.println("default method of MyInterface invoked");
	}

}

