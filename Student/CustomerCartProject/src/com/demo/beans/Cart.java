package com.demo.beans;

public class Cart {
	private int iid;
	private String iname;
	private float iprice;
	
	public Cart() {
		super();
	}

	@Override
	public String toString() {
		return "Cart [iid=" + iid + ", iname=" + iname + ", iprice=" + iprice + "]";
	}

	public int getIid() {
		return iid;
	}

	public void setIid(int iid) {
		this.iid = iid;
	}

	public String getIname() {
		return iname;
	}

	public void setIname(String iname) {
		this.iname = iname;
	}

	public float getIprice() {
		return iprice;
	}

	public void setIprice(float iprice) {
		this.iprice = iprice;
	}

	public Cart(int iid, String iname, float iprice) {
		super();
		this.iid = iid;
		this.iname = iname;
		this.iprice = iprice;
	}

}
