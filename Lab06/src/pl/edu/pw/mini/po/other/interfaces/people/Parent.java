package pl.edu.pw.mini.po.other.interfaces.people;

import pl.edu.pw.mini.po.other.interfaces.atm.CashSet;

public class Parent {

	private CashSet atm;
	
	public void refillCash(int cash) {
		atm.refillCash(cash);
	}
	
	public Parent(CashSet atm) {
		this.atm = atm;
	}
}
