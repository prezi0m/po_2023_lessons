package pl.edu.pw.mini.po.extending.examples.over2;

public class HonestConcreteStudentLetterWriter extends ConcreteStudentLetterWriter {

	@Override
	public String writeALetter() {
		return super.writeALetter() + " evenining.";
	}
	
}
