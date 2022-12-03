package com.demo.beans;

public class DematAccount extends Account{

	public static float interestRate;
	private float commission;

	//making interestRate static using Static block
	static {
		interestRate=0.8f;
	}

	public DematAccount() {
		super();
		this.commission=0;
	}

	public DematAccount(int id,String nm,String mb,int pin,float bal,float comm) {
		//super --> lists all members declared in parent class
		super(id,nm,mb,pin,bal);
		this.commission=comm;	
	}

	public static float getInterestRate() {
		return interestRate;
	}

	public static void setInterestRate(float interestRate) {
		DematAccount.interestRate = interestRate;
	}

	public float getCommission() {
		return commission;
	}

	public void setCommission(float commission) {
		this.commission = commission;
	}

	@Override
	public String toString() {
		return super.toString() +"commission=" + commission;
	}

	//withdraw function 
	//setting withdraw limit to 5000 for demat account
	@Override
	public void withdraw(float amount) {
		if(amount<5000) {
			this.balance=this.balance-amount;
		}
		else {
			System.out.println("Exeeding withdraw limit");
		}

	}	
}
