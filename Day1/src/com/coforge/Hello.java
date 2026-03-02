package com.coforge;

public class Hello {
	
	public static void main(String[] args) {
		System.out.println("Hello");
		int num1=56;
		int num2=67;
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		num1=5;
		num2=2;
		System.out.println((float)num1/num2);
		System.out.println(num1%num2);
		
//		num1=num1+20;
		num1+=20;
		System.out.println(num1);
		
		int res=num1++;
		System.out.println(res);
		//++num1;
		
		//swapping two numbers
		int a=6,b=7,temp, c=8;
		System.out.println("Before swap a:"+a+" b:"+b+" c:");
//		temp=a;
//		a=b;
//		b=temp;
		
		a=a+b+c;
		b=a-b-c;
		c=a-b-c;
		a=a-b-c;
		System.out.println("After swap a:"+a+" b:"+b+" c:"+c);
		//swapping 3 number without using temp var
		
		
		
	}

}