package com.AtmTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.math.BigDecimal;

import org.junit.Test;

import com.atm.ATM;

public class ATMTest {

	BigDecimal withDrawAmnt1 = new BigDecimal(2000);
	BigDecimal withDrawAmnt2 = new BigDecimal(8000);
	ATM atmObj = new ATM();

	// Checking if user has a balance greater than 0
	@Test
	public void checkBalance() {
		assertFalse("No balance available", atmObj.checkBalance().compareTo(BigDecimal.ZERO) != 1);
	}

	// Checking withdrawal happened successfully
	@Test
	public void withDrawCheckSufficientBlnce() {
		
			BigDecimal actualResult = atmObj.balance.subtract(withDrawAmnt1);
			assertFalse("Withdrawal failure", atmObj.withDraw(withDrawAmnt1).compareTo(actualResult) != 0);
		

	}
	// Checking withdrawal for insufficient balance
	@Test
	public void withDrawCheckInSufficientBlnce() {
		assertFalse("Withdrawal failure", atmObj.withDraw(withDrawAmnt2).compareTo(atmObj.balance) != 0);

	}

	// Checking for print receipt
	@Test
	public void receiptCheck() {
		BigDecimal withDrwalAmt = new BigDecimal(500);
		BigDecimal updatedBln = atmObj.balance.subtract(withDrwalAmt);
		String actualMsg = "Updated Balance amount is:" + updatedBln;
		System.out.println(actualMsg);
		atmObj.withDraw(withDrwalAmt);

		String updateMsg = atmObj.printBalance();
		System.out.println(updateMsg);
		assertEquals(actualMsg, updateMsg);

	}

}
