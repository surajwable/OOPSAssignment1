package com.demo.beans;

public class ContractEmp extends Employee {
	private int hrs;
	private double charges;

	public ContractEmp() {
		super();
		this.hrs=0;
		this.charges=0;
	}
	
	public ContractEmp(int id,String nm,String em,String dept,String desg,int hrs,double charges) {
		super(id,nm,em,dept,desg);
		this.hrs=hrs;
		this.charges=charges;
	}
	
	public double calculateSal() {
    	return hrs*charges;
    }

	public int getHrs() {
		return hrs;
	}

	public void setHrs(int hrs) {
		this.hrs = hrs;
	}

	public double getCharges() {
		return charges;
	}

	public void setCharges(double charges) {
		this.charges = charges;
	}

	public String toString() {
		return super.toString()+"Hours=" + hrs + ", charges=" + charges;
	}
	
	
}
