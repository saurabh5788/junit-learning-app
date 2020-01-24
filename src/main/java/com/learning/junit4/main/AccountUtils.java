package com.learning.junit4.main;

import java.util.HashMap;
import java.util.Map;

public class AccountUtils {
	private AccountUtils() {
	}

	private static Map<Character, String> accountTypeMap;
	static {
		accountTypeMap = new HashMap<Character, String>();
		accountTypeMap.put('s', "Savings");
		accountTypeMap.put('c', "Current");
		accountTypeMap.put('l', "Loan");
	}

	private static Map<Character, Double> interestMap;
	static {
		interestMap = new HashMap<Character, Double>();
		interestMap.put('s', 4.0);	
		interestMap.put('c', 1.0);	
		interestMap.put('l', -10.0);	
	}

	public static Double getSimpleInterest(Double p, Double r, Double t) {
		Double s = (p * r * t) / 100;
		return s;
	}

	public static String getAccountType(AccountDTO account) {
		return getAccountType(account.getTypeCode());
	}

	public static String getAccountType(Character accountTypeCode) {
		return accountTypeMap.get(accountTypeCode);
	}
	
	public static Double getInterestRateType(Character accountTypeCode) {
		return interestMap.get(accountTypeCode);
	}
	
	public static Double getSimpleInterest(AccountDTO accountDto, Double t) {
		Double p = accountDto.getBalance();
		Double r = getInterestRateType(accountDto.getTypeCode());
		return getSimpleInterest(p,r,t);
	}
}
