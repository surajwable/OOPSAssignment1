package com.demo.beans;

abstract public class Student {
	private int id;
	private String name;
	private String address;

	public Student() {
		this.id=0;
		this.name=null;
		this.address=null;
	}
	
	public Student(int id,String nm,String adr) {
		this.id=id;
		this.name=nm;
		this.address=adr;
	}

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
