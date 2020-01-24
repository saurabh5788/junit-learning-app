package com.learning.junit4.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.learning.junit4.main.AccountDTO;
import com.learning.junit4.main.AccountUtils;

public class TestAccountUtils {

	private static AccountDTO account;

	@BeforeClass
	public static void initTestAccountBusiness() {
		account = new AccountDTO();
	}

	@Test(timeout = 1)
	public void siTestCase() {
		System.out.println("Testing siTestCase");
		Double p = 1000D;
		Double r = 8D;
		Double t = 10D;

		Double si = AccountUtils.getSimpleInterest(p, r, t);
		assertEquals(si, new Double(800D));
		System.out.println("Tested siTestCase");
	}

	@Test(timeout = 1000)
	public void typeCodeTestCase() {
		System.out.println("Testing typeCodeTestCase");
		account.setTypeCode('s');
		assertEquals("Savings", AccountUtils.getAccountType(account));
		assertEquals("Savings", AccountUtils.getAccountType('s'));
		System.out.println("Tested typeCodeTestCase");
	}
}
