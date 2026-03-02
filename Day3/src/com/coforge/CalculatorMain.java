package com.coforge;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator c=new Calculator();
		System.out.println(c.add(5,6));
		System.out.println(c.sub(78, 54));
		System.out.println(c.mul(6, 5));
		c.div(65, 5);
		c.power(5, 2);
		c.squarerRoot(144);
		c.logValue(10);

	}

}
