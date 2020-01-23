package com.learning.junit4.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/*@RunWith(Parameterized.class)
 interface ParameterizedRunner {
 }*/

@RunWith(Suite.class)
@SuiteClasses({ TestAccountBusiness.class, TestAccount.class })
public class TestSuite {
}
