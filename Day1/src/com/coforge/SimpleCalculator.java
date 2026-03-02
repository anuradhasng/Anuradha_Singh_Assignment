package com.coforge;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		char op=sc.next().charAt(0);
//		if(op=='+')
//			System.out.println(a+b);
//		else if(op=='-')
//			System.out.println(a-b);
//		else
//			System.out.println("invalid operator");
		
		
		switch(op)
		{
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		default:
			System.out.println("invalid operation");
		}
		
		

	}

}