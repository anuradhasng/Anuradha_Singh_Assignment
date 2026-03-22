package com.coforge.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Account {

	private long accNo;
	private String accHolderName;
    private String acctype;
    private double balance;

}
