package pl.edu.pw.mini.po.extending.examples.animals3;

public class Dog extends AnimalWithTeeth {

	public Dog() {
		currentToothNumber = random.nextInt(4) + 39;//39-42
	}

}
