package com.coforge;

public class TernaryApp {
	public static void main(String[] args) {
		int a=134,b=556,c=178;
//		System.out.println(a>b?a:b);
		System.out.println(a>b&&a>c?a:b>c?b:c);
		
		//System.out.println(a>b||a>c?a:b);
		System.out.println(a>b?a>c?a:c:b>c?b:c);
//		System.out.println(a>b?b>c?a:b:c);
	}

}