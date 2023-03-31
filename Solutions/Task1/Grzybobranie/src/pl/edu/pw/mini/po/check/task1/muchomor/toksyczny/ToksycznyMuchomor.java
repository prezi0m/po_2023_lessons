package pl.edu.pw.mini.po.check.task1.muchomor.toksyczny;

import pl.edu.pw.mini.po.check.task1.grzyb.Grzyb;

public abstract class ToksycznyMuchomor extends Grzyb {

	protected Toksyny toksyny;

	@Override
	protected String getInfo() {
		return super.getInfo() + " toksyny: " + toksyny;
	}

}
