package pl.edu.pw.mini.po.check.task1.grzyb;

import java.util.Random;

public abstract class Grzyb {

	private static Random random = new Random();

	protected Twardosc twardosc;
	protected int masaOwocnika;

	public Grzyb() {
		ustawTwardosc();
	}
	
	protected void ustawMaseOwocnika(int min, int max) {
		masaOwocnika = min + random.nextInt(max-min+1);
	}

	public void ugotuj() {
		twardosc = Twardosc.MIEKKI;
	}

	public boolean isTrujacy() {
		return false;
	}

	protected void ustawTwardosc() {
		Twardosc opcjeTwardosci[] = Twardosc.values();
		twardosc = opcjeTwardosci[random.nextInt(opcjeTwardosci.length)];
	}

	protected String getInfo() {
		return " twardosc: " + twardosc + " masa owocnika: " + masaOwocnika;
	}

}
 