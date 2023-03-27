package pl.edu.pw.mini.po.lab05.basic.additional;

import pl.edu.pw.mini.po.lab05.basic.First;

public class Second extends First {
	
	public Second(String name) {
		super(name);
	}

	public void internal() {
		name = "aa";
	}

	//Overriding przeslanianie nadpisywanie przykrywanie
	public void saySomething() {
		System.out.println("Second");
	}
	
}
