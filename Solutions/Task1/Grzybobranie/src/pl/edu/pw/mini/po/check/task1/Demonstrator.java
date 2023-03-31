package pl.edu.pw.mini.po.check.task1;

import pl.edu.pw.mini.po.check.task1.konsument.KonsumentGrzybow;
import pl.edu.pw.mini.po.check.task1.las.DostawcaGrzybow;
import pl.edu.pw.mini.po.check.task1.las.Las;

public class Demonstrator {

	public static void main(String[] args) {
		DostawcaGrzybow dostawcaGrzybow = new Las(50, 50);
		KonsumentGrzybow konsumentGrzybow = new KonsumentGrzybow(dostawcaGrzybow);
		konsumentGrzybow.konsumujGrzyby();
	}

}
