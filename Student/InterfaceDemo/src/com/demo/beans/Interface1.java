package com.demo.beans;

public interface Interface1 {

	void m11();
	default void m12() {
		System.out.println("HEllo Interface");
	}
	
	public static void m13() {
		System.out.println("Hello Static ");
	}
	
}
