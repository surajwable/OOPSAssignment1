package com.demo.beans;

public class MscStudent extends Student {
	
	private int m1,m2,m3;

	public MscStudent() {
		this.m1=0;
		this.m2=0;
		this.m3=0;
	}
	
	public MscStudent(int id,String nm,String adr,int m1,int m2,int m3) {
		super(id,nm,adr);
		this.m1=m1;
		this.m1=m2;
		this.m1=m3;
	}
	
	public double calculatePer() {
		return (getM1()+getM2()+getM3())/3;
	}

	public int getM1() {
		return m1;
	}

	public void setM1(int m1) {
		this.m1 = m1;
	}

	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}

	public int getM3() {
		return m3;
	}

	public void setM3(int m3) {
		this.m3 = m3;
	}

	public String toString() {
		return super.toString()+ "m1=" + m1 + ", m2=" + m2 + ", m3=" + m3;
	}
	
	
}
