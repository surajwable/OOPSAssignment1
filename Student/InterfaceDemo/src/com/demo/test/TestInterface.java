package com.demo.test;

import com.demo.beans.Interface1;
import com.demo.beans.interface2;

public class TestInterface implements Interface1,interface2
{

	
	public void m11()
	{
		
	}
	public static void main(String[] args) {
		TestInterface ob=new TestInterface();
		ob.m12();
		Interface1.m13();
		interface2.m13();
	}
	@Override
	public void a21() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void m12() {
		// TODO Auto-generated method stub
		Interface1.super.m12();
		interface2.super.m12();
	}

}
