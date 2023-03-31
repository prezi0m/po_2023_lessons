package pl.edu.pw.mini.po.check.task1.konsument;

import java.util.Random;

import pl.edu.pw.mini.po.check.task1.grzyb.Grzyb;
import pl.edu.pw.mini.po.check.task1.las.DostawcaGrzybow;

public class KonsumentGrzybow {

	private DostawcaGrzybow dostawcaGrzybow;

	public KonsumentGrzybow(DostawcaGrzybow dostawcaGrzybow) {
		this.dostawcaGrzybow = dostawcaGrzybow;
	}

	public void konsumujGrzyby() {
		int n = 50 + new Random().nextInt(51);
		for (int i = 0; i < n; i++) {
			Grzyb zebranyGrzyb = dostawcaGrzybow.zbierzGrzyba();
			if (zebranyGrzyb != null) {
				System.out.println("Zebrany grzyb: " + zebranyGrzyb);
				zebranyGrzyb.ugotuj();
				if (zjedz(zebranyGrzyb)) {
					break;
				}
			}
		}
	}

	private boolean zjedz(Grzyb grzyb) {
		boolean jestTrujacy = grzyb.isTrujacy();
		if (jestTrujacy) {
			System.out.println("Uuuups!");
		}
		return jestTrujacy;
	}

}
