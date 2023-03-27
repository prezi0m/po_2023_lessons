package pl.edu.pw.mini.po.other.interfaces;

import java.util.Random;

import pl.edu.pw.mini.po.other.interfaces.atm.ATM;
import pl.edu.pw.mini.po.other.interfaces.atm.CashGet;
import pl.edu.pw.mini.po.other.interfaces.atm.CashSet;
import pl.edu.pw.mini.po.other.interfaces.people.Parent;
import pl.edu.pw.mini.po.other.interfaces.people.Student;

public class ATMDemonstrator {

	public static void main(String[] args) {
		ATM atm = new ATM();

		CashGet cashGetable = atm;
		CashSet cashSetable = atm;

		Student student = new Student(cashGetable);
		Parent parent = new Parent(cashSetable);

		for (int i = 0; i < 1000; i++) {
			student.getCash(500 + new Random().nextInt(500));
			parent.refillCash(400 + new Random().nextInt(500));
		}

	}

}
