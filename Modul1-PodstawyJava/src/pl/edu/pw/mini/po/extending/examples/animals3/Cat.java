package pl.edu.pw.mini.po.extending.examples.animals3;

public class Cat extends AnimalWithTeeth {

	public Cat() {
		currentToothNumber = random.nextInt(5) + 26;//26-30
	}

}
