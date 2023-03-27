package pl.edu.pw.mini.po.other.interfaces.people;

import pl.edu.pw.mini.po.other.interfaces.atm.CashGet;

public class Student {

	private CashGet atm;

	public void getCash(int cash) {
		atm.withdrawCash(cash);
	}

	public Student(CashGet atm) {
		this.atm = atm;
	}
}
