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
		assertEquals("Savings", AccountUtils.getAccountType('s'));
		System.out.println("Tested typeCodeTestCase");
	}

	@Test(timeout = 1000)
	public void typeCodeTestCaseUsingMock() {
		System.out.println("Testing typeCodeTestCaseUsingMock");
		Mockito.when(account.getTypeCode()).thenReturn('c');
		assertEquals("Current", AccountUtils.getAccountType(account));
		Mockito.verify(account).getTypeCode();
		System.out.println("Tested typeCodeTestCaseUsingMock");
	}
}


