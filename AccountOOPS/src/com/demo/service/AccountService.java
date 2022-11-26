//creating a local database to use by using static block
package com.demo.service;

import com.demo.beans.Account;
import com.demo.beans.DematAccount;
import com.demo.beans.SavingsAccount;

public class AccountService {

	//declaring an array acarr of Account type with size 10
	private static Account[]acarr=new Account[10];
	//count to count number of objects added to an array of abjects.
	private static int count=0;
	//static block
	//local database
	static {
		acarr[0]=new DematAccount(1,"suraj","91000",1111,12000,0.1f);
		acarr[1]=new DematAccount(2,"pranav","92000",2111,13000,0.2f);
		acarr[2]=new DematAccount(3,"shiva","93000",3111,14000,0.3f);

		acarr[3]=new SavingsAccount(4,"veer","94000",1111,12000,"A0011");
		acarr[4]=new SavingsAccount(5,"sonu","95000",1111,12000,"B0022");
		acarr[5]=new SavingsAccount(6,"nilam","96000",1111,12000,"C0033");
		count=6;
	}

	//this will withdraw amount if pin matched else return false
	public static boolean withdrawAmt(int accno,int pin,float amt) {
		Account ac=SearchAcc(accno);
		if(acarr!=null) {
			if(ac.getPin()==pin) {
				ac.withdraw(amt);
				return true;
			}
		}
		return false;
	}

	/*if accno given during withdraw matches with id given in account class then 
	return index of account stored into the database in static block*/
	public static Account SearchAcc(int accno) {
		for(int i=0;i<count;i++) {
			if(accno==acarr[i].getId()) {
				return acarr[i];
			}
		}
		return null;
	}

	public static boolean ChangePin(int accno,int pin,int newpin) {
		Account ac=SearchAcc(accno);
		if(ac!=null && ac.getPin()==pin) {
			ac.setPin(newpin);
		}
		return false;
	}
}
