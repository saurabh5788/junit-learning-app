package com.learning.junit4.main;

import java.util.HashMap;
import java.util.Map;

public class AccountUtils {	
	private AccountUtils(){}
	private static Map<Character, String> accountTypeMap;
	static {
		accountTypeMap = new HashMap<Character, String>();
		accountTypeMap.put('s', "Savings");
		accountTypeMap.put('c', "Current");
		accountTypeMap.put('l', "Loan");
	}
	
	public static Double getSimpleInterest(Double p, Double r, Double t) {
		Double s = (p * r * t) / 100;
		return s;
	}

	public static String getAccountType(AccountDTO account) {
		return accountTypeMap.get(account.getTypeCode());
	}
	
	public static String getAccountType(Character accountTypeCode) {
		return accountTypeMap.get(accountTypeCode);
	}
}
