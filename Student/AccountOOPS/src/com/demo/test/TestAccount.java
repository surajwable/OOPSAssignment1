package com.demo.test;

import com.demo.beans.*;

public class TestAccount {

	public static void main(String[] args) {
		DematAccount da = new DematAccount (11, "suraj","91000", 1234, 15000, 0.2f);

		da.withdraw(5000);
		System.out.println(da);
		da.withdraw(8000);
		System.out.println(da);

		SavingsAccount sa = new SavingsAccount (11, "suraj","94000", 1234, 15000, "A0011");

		sa.withdraw(5000);
		System.out.println(sa);
		sa.withdraw(8000);
		System.out.println(sa);
	}

}
