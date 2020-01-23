package com.learning.junit4.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.learning.junit4.main.AccountBusinessLogic;
import com.learning.junit4.main.AccountDTO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestAccountBusiness {
	private static AccountBusinessLogic abl;
	private static AccountDTO account;

	@BeforeClass
	public static void initTestAccountBusiness() {
		abl = new AccountBusinessLogic();
		account = new AccountDTO();
	}

	@Before
	public void beforeEachTest() {
		System.out.println("This is executed before each Test");
	}

	@After
	public void afterEachTest() {
		System.out.println("This is exceuted after each Test");
	}

	@Test
	public void typeCodeTestCase() {
		System.out.println("Testing typeCodeTestCase");
		account.setTypeCode('s');
		assertEquals("Savings", abl.getAccountType(account));
		System.out.println("Tested typeCodeTestCase");
	}

	@Test
	public void siTestCase() {
		System.out.println("Testing siTestCase");
		Double p = 1000D;
		Double r = 8D;
		Double t = 10D;

		Double si = AccountBusinessLogic.getSimpleInterest(p, r, t);
		assertEquals(si, new Double(800D));
		System.out.println("Tested siTestCase");
	}
}

