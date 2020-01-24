package com.learning.junit4.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.learning.junit4.main.AccountDTO;
import com.learning.junit4.main.AccountUtils;

@RunWith(MockitoJUnitRunner.class)
public class TestAccountUtils {

	@Mock
	private AccountDTO account;

	@BeforeClass
	public static void initTestAccountUtils() {
		System.out.println("Init TestAccountUtils.");
	}

	@Test(timeout = 10)
	public void siWithValuesTestCase() {
		System.out.println("Testing siWithValuesTestCase");
		Double p = 1000D;
		Double r = 8D;
		Double t = 10D;

		Double si = AccountUtils.getSimpleInterest(p, r, t);
		assertEquals(new Double(800), si);
		System.out.println("Tested siWithValuesTestCase");
	}

	@Test(timeout = 1000)
	public void typeCodeTestCase() {
		System.out.println("Testing typeCodeTestCase");
		assertEquals("Savings", AccountUtils.getAccountType('s'));
		System.out.println("Tested typeCodeTestCase");
	}

	@Test(timeout = 1000)
	public void typeCodeUsingMockTestCase() {
		System.out.println("Testing typeCodeUsingMockTestCase");
		Mockito.when(account.getTypeCode()).thenReturn('c');
		assertEquals("Current", AccountUtils.getAccountType(account));
		Mockito.verify(account).getTypeCode();
		System.out.println("Tested typeCodeUsingMockTestCase");
	}

	@Test
	public void siWithAccountTestCase() {
		System.out.println("Testing siWithAccountTestCase");
		Mockito.when(account.getTypeCode()).thenReturn('l');
		Mockito.when(account.getBalance()).thenReturn(1000.0);
		Double t = 10D;
		Double si = AccountUtils.getSimpleInterest(account, t);
		assertEquals(new Double(-1000), si);
		System.out.println("Tested siWithAccountTestCase");
	}
}
