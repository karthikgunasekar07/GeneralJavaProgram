package com.Abstract;

public class Bank_Details1 extends Bank_Details{

	@Override
	public void Password() {
System.out.println("Jack$125$%^^");		
	}

	@Override
	public void AccountNumber() {
System.out.println("54003456786457");		
	}

	@Override
	public void pinNumber() {
System.out.println("4546");		
	}
	
	public static void main(String[] args) {
		
		Bank_Details1 d1 = new Bank_Details1();
		
		d1.userName();
		d1.Password();
		d1.AccountNumber();
		d1.pinNumber();
	}

}
