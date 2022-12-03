package com.demo.beans;

import java.text.SimpleDateFormat;

public class Product {

	private int proid;
	private String proname;
	private String expdate;
	
	public Product() {
		super();
	}
	
	public Product(int proid,String proname,String expdate) {
		this.proid=proid;
		this.proname=proname;
		this.expdate=expdate;
	}

	public int getProid() {
		return proid;
	}

	public void setProid(int proid) {
		this.proid = proid;
	}

	public String getProname() {
		return proname;
	}
-
	public void setProname(String proname) {
		this.proname = proname;
	}

	public String getExpdate() {
		return expdate;
	}

	public void setExpdate(String expdate) {
		this.expdate = expdate;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
		String dt=sdf.format(expdate);
		return "Product [proid=" + proid + ", proname=" + proname + ", expdate=" + expdate + "]";
	}
	
}
