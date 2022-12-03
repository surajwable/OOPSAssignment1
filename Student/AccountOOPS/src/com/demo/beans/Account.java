package com.demo.beans;

//abstract parent class because it is containing abstract method in it.
abstract public class Account {

	private int id;
	private String name;
	private String mobile;
	private int pin;
	protected float balance;

	//default constructor
	public Account() {
		this.id=0;
		this.name=null;
		this.mobile=null;
		this.pin=0;
		this.balance=0;
	}

	//parameterised constructor
	public Account(int id,String nm,String mb,int pin,float bal)
	{
		this.id=id;
		this.name=nm;
		this.mobile=mb;
		this.pin=pin;
		this.balance=bal;
	}

	//adding abstract method withdraw
	//abstract method is needed when two classes have same method 
	//having same name and signature with different logic.
	//add abstract methods in the parent class
	abstract public void withdraw(float amount);

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", mobile=" + mobile + ", pin=" + pin + ", balance=" + balance
				+ "]";
	}

	public void Deposit(float amt) {
		
			this.balance=this.balance+amt;
			System.out.println("Your account has beed Credited with"+amt+ "\n" +"Total Balance :"+this.balance);
		}
}





