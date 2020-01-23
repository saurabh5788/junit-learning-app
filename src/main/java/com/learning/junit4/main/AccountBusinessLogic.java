package com.learning.junit4.main;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Saurabh.Singh
 * 
 */
public class AccountBusinessLogic {
	private static Map<Character, String> accountTypeMap;
	static {
		accountTypeMap = new HashMap<Character, String>();
		accountTypeMap.put('s', "Savings");
		accountTypeMap.put('c', "Current");
		accountTypeMap.put('l', "Loan");
	}

	public String getAccountType(AccountDTO account) {
		return accountTypeMap.get(account.getTypeCode());
	}

	public static Double getSimpleInterest(Double p, Double r, Double t) {
		Double s = (p * r * t) / 100;
		return s;
	}
}
