package pl.edu.pw.mini.po.lab05.animals;

public class Dog extends AnimalWithTeeth{

	public Dog() {
		currentToothObject = 40 + drawNextInt(3);
	}

}
