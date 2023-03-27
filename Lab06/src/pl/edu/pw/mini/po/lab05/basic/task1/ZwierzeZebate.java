package pl.edu.pw.mini.po.lab05.basic.task1;

import java.util.Random;

public abstract class ZwierzeZebate extends Zwierze {
	private static Random random = new Random();

	protected int biezacaLiczbaZebow;
	
	protected static int generate() {
		return new Random().nextInt(3);
	}
}
