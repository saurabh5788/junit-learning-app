package com.learning.junit4.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;

import com.learning.junit4.main.AccountDTO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestAccountDTO {
	private static AccountDTO account;
	
	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	@BeforeClass
	public static void initTestAccount() {
		System.out.println("Init TestAccount.");
		account = new AccountDTO();
	}

	public static void endTestAccount() {
		System.out.println("End TestAccount.");
	}

	@Before
	public void beforeEachTest() {
		System.out.println("TestAccount : Before Test");
	}

	@After
	public void afterEachTest() {
		System.out.println("TestAccount : After Test");
	}

	@Test(expected = NullPointerException.class)
	public void typeCodeWithNullTestCase() {
		System.out.println("Testing typeCodeTestCaseWithNull");
		account.setTypeCode(null);
		System.out.println("Tested typeCodeTestCaseWithNull");
	}

	@Test
	public void typeCodeWithValidValueTestCase() {
		System.out.println("Testing typeCodeTestCaseWithValidValue");
		account.setTypeCode('s');
		assertEquals(new Character('s'), account.getTypeCode());
		System.out.println("Tested typeCodeTestCaseWithValidValue");
	}

	@Test
	@Ignore
	public void balanceWithNullTestCase() {
		System.out.println("Testing balanceTestCase");
		account.setBalance(null);
		assertEquals(new Double(0D), account.getBalance());
		System.out.println("Tested balanceTestCase");
	}
}
