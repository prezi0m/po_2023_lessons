package pl.edu.pw.mini.po.extending.basic.task1;

import java.util.Random;

public abstract class ZwierzeZebate extends Zwierze {

	protected int biezacaLiczbaZebow;
	
	protected static int generate() {
		return new Random().nextInt(3);
	}
}
