package com.demo.beans;

abstract public class Employee extends Person {

	private String dept;
	private String desg;

	public Employee() {
		System.out.println("in Employe default constructor");
		this.dept=null;
		this.desg=null;
	}
	
	public Employee(int id,String nm,String em,String dept,String desg) {
		super(id,nm,em);
		System.out.println("in Employe parametrized constructor");
		this.dept=dept;
		this.desg=desg;
	}

	public String toString() {
		return super.toString()+"Employee [dept=" + dept + ", desg=" + desg;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}
}
