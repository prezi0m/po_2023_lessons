package pl.edu.pw.mini.po.check.task1.las;

import java.util.Random;

import pl.edu.pw.mini.po.check.task1.grzyb.CesarskiMuchomor;
import pl.edu.pw.mini.po.check.task1.grzyb.Grzyb;
import pl.edu.pw.mini.po.check.task1.grzyb.KolczastoglowyMuchomor;
import pl.edu.pw.mini.po.check.task1.muchomor.toksyczny.SromotnikowyMuchomor;
import pl.edu.pw.mini.po.check.task1.muchomor.toksyczny.SzarawyMuchomor;

public class Las implements DostawcaGrzybow {

	private static final int DOMYSLNA_DLUGOSC_TABLICY = 100;
	private static Random random = new Random();

	private Grzyb[][] poleGrzybow;

	public Las(int x, int y) {

		if(x < 1) {
			x = DOMYSLNA_DLUGOSC_TABLICY;
		}

		if(y < 1) {
			y = DOMYSLNA_DLUGOSC_TABLICY;
		}

		poleGrzybow = new Grzyb[x][y];
		inicjujPoleSmacznymiGrzybkami();
	}

	private void inicjujPoleSmacznymiGrzybkami() {
		int pustaKolumna = random.nextInt(poleGrzybow[0].length);
		for(int i=0;i<poleGrzybow.length;i++) {
			for(int j=0;j<poleGrzybow[0].length;j++) {
				if(j != pustaKolumna) {
					if(random.nextInt(5) == 0) {
						switch (random.nextInt(4)) {
							case 0:
								poleGrzybow[i][j] = new CesarskiMuchomor();
								break;
							case 1:
								poleGrzybow[i][j] = new KolczastoglowyMuchomor();
								break;
							case 2:
								poleGrzybow[i][j] = new SzarawyMuchomor();
								break;
							default:
								poleGrzybow[i][j] = new SromotnikowyMuchomor();
						}
					}
				}
			}
		}
	}

	public Grzyb zbierzGrzyba() {
		int i = random.nextInt(poleGrzybow.length);
		int j = random.nextInt(poleGrzybow[0].length);
		Grzyb zebranyGrzyb = poleGrzybow[i][j];
		if(zebranyGrzyb != null) {
			poleGrzybow[i][j] = null;
		}
		return zebranyGrzyb;
	}

}
