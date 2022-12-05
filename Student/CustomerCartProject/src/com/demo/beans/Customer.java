package com.demo.beans;

public class Customer {
	private int cid;
	private String cname;
	public Customer() {
		super();
	}
	public Customer(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + "]";
	}
	
	
	
	

}
