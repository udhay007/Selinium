package org.test;
public class Testt1 implements Testt2, Testt{

	@Override
	public void savings() {
		System.out.println("Savings 100%");
		
	}

	@Override
	public void deposit() {
		System.out.println("Deposit is 75%");
		
	}

	@Override
	public void currentaccount() {
		System.out.println("Current Account is null");
		
	}

	@Override
	public void fixed() {
		System.out.println("Fixed is 45%");
		
	}
	private void accountdetailes() {
		System.out.println("account detailes is udhay");

	}
	public static void main(String[] args) {
		Testt1 t1=new Testt1();
		t1.accountdetailes();
		t1.savings();
		t1.deposit();
		t1.currentaccount();
		t1.fixed();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
