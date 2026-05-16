package org.bank;

public class BankInfo extends AxisBank {
	private void savings() {
		System.out.println("Int 5% increased for CB ");

	}
	private void fixed() {
		System.out.println("discount 2 %increased for CB");

	}
	public static void main(String[] args) {
		BankInfo BI=new BankInfo();
		BI.savings();
		BI.fixed();
		BI.deposit();
	}

}
