package com.demo.beans;

public class Customer extends Person {
	
	private String type;
	private String daddress;
	
	public Customer() {
		this.type=null;
		this.daddress=null;
	}
	
	public Customer(int id,String nm,String em,String type,String dadd) {
		super(id,nm,em);
		this.type=type;
		this.daddress=dadd;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDaddress() {
		return daddress;
	}

	public void setDaddress(String daddress) {
		this.daddress = daddress;
	}

	public String toString() {
		return super.toString()+"type=" + type + ", daddress=" + daddress;
	}
	
	
	

}
