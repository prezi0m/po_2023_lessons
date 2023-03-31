package pl.edu.pw.mini.po.extending.examples.over2;

public class StudentLetterWriterDemonstrator {

	public static void main(String[] args) {
		
		StudentLetterWriter studentLetterWriter = new PoliteHonestConcreteStudentLetterWriter();
		System.out.println(studentLetterWriter.writeALetter());
		
	}

}
