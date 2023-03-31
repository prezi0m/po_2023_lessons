package pl.edu.pw.mini.po.extending.basic.additional;

import pl.edu.pw.mini.po.extending.basic.First;

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
