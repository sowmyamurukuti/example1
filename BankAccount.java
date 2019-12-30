package bank.entity;

import java.util.*;

public class BankAccount {

	private int ID;
	private String name;
	private double balance;

	public BankAccount(int ID, String name, double balance) {

		this.ID = ID;
		this.name = name;
		this.balance = balance;

	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void addBalance(BankAccount e1) {
		this.balance = this.balance + e1;
	}

	public void transferAmount(BankAccount a1, double amount) {
		this.balance = this.balance - amount;

		a1.balance = a1.balance + amount;

	}

	public boolean equals(Object obj)

	{
		// col.BankAccount e1=new col.BankAccount(10);
		// col.BankAccount e2=e1;
		// boolean result=e1.equals(e2)
		//
		if (obj == this) {
			return true;
		}
		// col.BankAccount e1=new col.BankAccount(10);
		// col.BankAccount e2=null;
		// boolean result=e1.equals(e2);
		//
		// col.BankAccount e1=new col.BankAccount(10);
		// String e2="10";
		// boolean result=e1.equals(e2);
		if (obj == null || !(obj instanceof BankAccount)) {
			return false;
		}
		// col.BankAccount e1=new col.BankAccount(10);
		// col.BankAccount e2=new col.BankAccount(10);
		// boolean result=e1.equals(e2);

		BankAccount e = (BankAccount) obj;
		return e.ID == this.ID;
	}
}
