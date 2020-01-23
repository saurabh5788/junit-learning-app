package com.learning.junit4.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.learning.junit4.main.AccountDTO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestAccount {
	private static AccountDTO account;

	@BeforeClass
	public static void initTestAccountBusiness() {
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
	public void balanceWithNullTestCase() {
		System.out.println("Testing balanceTestCase");
		account.setBalance(null);
		assertEquals(new Double(0D), account.getBalance());
		System.out.println("Tested balanceTestCase");
	}
}
