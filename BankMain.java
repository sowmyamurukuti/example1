package bank.ui;

import bank.entity.BankAccount;

public class BankMain {

	public static void main(String[] args) {
		BankAccount store[] = new BankAccount[3];
		store[0] = new BankAccount(1, "ram", 500.00);
		store[1] = new BankAccount(2, "sita", 400.00);
		store[2] = new BankAccount(3, "Lakshman", 300.00);
		BankMain a = new BankMain();
		a.print(store);
		System.out.println("After adding balance");
		store[0].addBalance(20);
		store[1].addBalance(30);
		a.print(store);
		System.out.println("After transfer");
		store[0].transferAmount(store[1], 200);

	}

	private void print(BankAccount[] emp) {
		for (int i = 0; i < 3; i++) {
			System.out.println("ID=" + emp[i].getID());
			System.out.println("NAME=" + emp[i].getname());
			System.out.println("BALANCE=" + emp[i].getBalance());
		}

	}
	
}
