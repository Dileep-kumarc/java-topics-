package com.Try_Catch;

import java.util.Scanner;

class InvalidPinExcetion extends Exception{
	
}
class ATM {
	int password = 2003;
	int enteredPin;
	void input()  {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the PIN");
		enteredPin=scan.nextInt();
		scan.close();
	}

	void verfiy() throws InvalidPinExcetion {
		if (password==enteredPin) {
			System.out.println("You can take the money");
		} else {
			System.out.println("Invalid pin");
			InvalidPinExcetion ipe=new InvalidPinExcetion();
			 throw ipe;  //it is ducking excption becuse escaping an excption if i handle here retrowing
		}
	}
}

class Bank {

	void inti() {
		ATM atm = new ATM();
		try {
			
			atm.input();
			atm.verfiy();
		}
		catch(Exception e1) {
			try {
				atm.input();
			atm.verfiy();
			}
			catch(Exception e2){
				try {
					atm.input();
					atm.verfiy();
				}
				catch(Exception e3) {
					System.out.println("Your card has been blocked!");
				}
			}
		}
		
	}
}

public class RBI {
	public static void main(String[] args) {
			Bank bank = new Bank();
			bank.inti();
	}
}
