package com.techlabs.account.unittest;

import org.junit.Assert;
import org.junit.Test;

import com.techlabs.account.Account;

public class AccountUnitTest {
	
	Account account;
	
	@Test
	public void shouldNotWithdrawIfBalanceIsLessThanEqualToFiveHundred(){
		account = new Account(140,"Roger",2000);
		account.withdraw(4800);
		int expectedAmount = 2000;
		int actualAmount = (int)account.getBalance();
		//System.out.println(actualAmount);
		Assert.assertEquals(expectedAmount, actualAmount);
	}
}
