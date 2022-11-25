package com.demo.beans;

public class SalariedEmp extends Employee {
	
	private double sal;
	private double bonus;
	
	public SalariedEmp(){
		this.sal=0;
		this.bonus=0;
	}
	
	public SalariedEmp(int id,String nm,String em,String dept,String desg,int sal,int bonus) {
		super(id,nm,em,dept,desg);
		this.sal=sal;
		this.bonus=0.10*this.sal;
	}
	
	public double calculateSal() {
		return  sal+0.10*sal+0.15*sal-0.08*sal+this.bonus;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public String toString() {
		return super.toString()+"sal=" + sal + ", bonus=" + bonus;
	}
	

}
