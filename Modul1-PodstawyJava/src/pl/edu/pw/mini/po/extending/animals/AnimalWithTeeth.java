package pl.edu.pw.mini.po.extending.animals;

import java.util.Random;

public abstract class AnimalWithTeeth extends Animal {
	protected int currentToothObject;

	protected int drawNextInt(int value) {
		Random random = new Random();
		return random.nextInt(value);
	}

}
