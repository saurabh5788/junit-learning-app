package com.learning.junit4.main;

public class AccountDTO {
	private String accountNumber;
	private String customerId;
	private Double balance;
	private Character typeCode;

	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber
	 *            the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * @return the customerId
	 */
	public String getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId
	 *            the customerId to set
	 */
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return the balance
	 */
	public Double getBalance() {
		return balance;
	}

	/**
	 * @param balance
	 *            the balance to set
	 */
	public void setBalance(Double balance) {
		if(balance != null){
			this.balance = balance;
		}
		else{
			this.balance = new Double(0D);
		}
	}

	/**
	 * @return the typeCode
	 */
	public Character getTypeCode() {
		return typeCode;
	}

	/**
	 * @param typeCode
	 *            the typeCode to set
	 */
	public void setTypeCode(Character typeCode) {
		if(typeCode == null)
			throw new NullPointerException("Passed Type Code can not be null!!!");
		this.typeCode = typeCode;
	}

}