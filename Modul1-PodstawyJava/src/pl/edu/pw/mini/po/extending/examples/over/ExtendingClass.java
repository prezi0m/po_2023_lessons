package pl.edu.pw.mini.po.extending.examples.over;

public class ExtendingClass extends BaseClass {

	@Override
	public void doSomething() {
		System.out.println("ExtendingClass: Tez cos robie ale inaczej niz w nadklasie - Overriding -> Nadpisywanie");
	}
	
}
