package com.demo.beans;

public class SavingsAccount extends Account {

	//interest rates and minimum balance should be visible to costumer
	public static float interestRate;
	public static int minBalance;  
	private String cbno;  //checkbook no is kept private

	//static block to use these values anywhere
	static {
		interestRate=0.4f;
		minBalance=10000;
	}

	//default constructor
	public SavingsAccount() {
		super();
		this.cbno=null;
	}

	//parameterized constructor
	public SavingsAccount(int id,String nm,String mb,int pin,float bal,String cbno)
	{
		super(id,nm, mb, pin,bal);
		this.cbno = cbno;
	}

	//getter for interest rate
	public static float getInterestRate() {
		return interestRate;
	}

	//setter for interest rate
	public static void setInterestRate(float interestRate) {
		SavingsAccount.interestRate = interestRate;
	}

	//getter for minbalance
	public static int getMinBalance() {
		return minBalance;
	}

	//setter for minbalance
	public static void setMinBalance(int minBalance) {
		SavingsAccount.minBalance = minBalance;
	}

	//getter for Cheque book number
	public String getCbno() {
		return cbno;
	}

	//setter for cheque Book number
	public void setCbno(String cbno) {
		this.cbno = cbno;
	}

	//tostring
	@Override
	public String toString() {
		return super.toString() +"cbno=" + cbno;
	}

	//withdraw method for SavingsAccount
	//first checking min bal then withdrawing the amount
	@Override
	public void withdraw(float amount) {
		if((this.balance-amount)>minBalance) {
			this.balance=this.balance-amount;
		}
		else {
			System.out.println("Insufficient Balance...!");
		}

	}


}
