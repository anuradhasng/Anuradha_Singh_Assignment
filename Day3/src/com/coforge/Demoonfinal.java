package com.coforge;

public class Demoonfinal {
	private String name="Anuradha";
	public void printDetails() {
		this.name="Anuradha";
		System.out.println(this.name);
	}
	
    public static void main(String[] args) {
    	Demoonfinal dof=new Demoonfinal();
    	dof.printDetails();
    	final double pi=3.14;
    }

}
