package com.coforge.Day6;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class Account {
	
	private long accId;
	private String accHolderName;
	private String bankName;
	private double balance;
	
	public void withDraw(double amount) {
		if(amount<=this.balance)
		{
			this.balance-=amount;
			System.out.println("Withdraw Successfull");
		}
		
		else
			System.out.println("Insufficient Funds");
	}
	
	public void deposit(double amount) {
		
		this.balance+=amount;
		System.out.println("Amount Deposited");
		
	}

}
