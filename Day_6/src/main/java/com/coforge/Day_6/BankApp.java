package com.coforge.Day_6;



import com.coforge.Day_6.Account;

public class BankApp {
	
	public static void name(String[] args) {
		
		Account acc=new Account(1223333,"Anuradha","HDFC",870000);
		acc.withDraw(10000);
		acc.deposit(10000);
		acc.withDraw(12000);
		
	}

}
