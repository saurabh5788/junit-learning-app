package com.learning.junit4.test;

import java.lang.reflect.InvocationTargetException;

import org.mockito.junit.MockitoJUnitRunner;

public class AccountJunitRunner extends MockitoJUnitRunner{
	public AccountJunitRunner(Class<?> klass) throws InvocationTargetException {
		super(klass);
	}	
}
