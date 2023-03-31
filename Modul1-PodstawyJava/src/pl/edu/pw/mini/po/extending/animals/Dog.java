package pl.edu.pw.mini.po.extending.animals;

public class Dog extends AnimalWithTeeth{

	public Dog() {
		currentToothObject = 40 + drawNextInt(3);
	}

}
