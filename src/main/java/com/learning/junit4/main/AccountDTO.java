package com.learning.junit4.main;

public class AccountDTO {

	private Double balance;
	private Character typeCode;

	
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
			this.balance = 0.0;
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
