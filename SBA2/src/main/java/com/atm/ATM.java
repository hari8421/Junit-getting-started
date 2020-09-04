package com.atm;

import java.math.BigDecimal;


public class ATM {
	public BigDecimal balance=new BigDecimal(5000);
	
	public BigDecimal withDraw(BigDecimal wAmount) {
		
		if(balance.compareTo(wAmount)!=-1) {
			balance=balance.subtract(wAmount);
		}else {
			System.out.println("Balance amount is less than reuested amount");
			printBalance();
		}
		return balance;
	}
	
     public BigDecimal checkBalance() {
		
		
		return balance;
	}
     
     public String printBalance() {
    	 System.out.println("Updated Balance amount is:"+balance);
    	 return "Updated Balance amount is:"+balance;
 	}
     
     public ATM() {
 		
 	}

}
