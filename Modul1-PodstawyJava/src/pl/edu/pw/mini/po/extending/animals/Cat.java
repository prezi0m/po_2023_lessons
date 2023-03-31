package pl.edu.pw.mini.po.extending.animals;

public class Cat extends AnimalWithTeeth{

	public Cat() {
		currentToothObject = 28 + drawNextInt(3);
	}

}
