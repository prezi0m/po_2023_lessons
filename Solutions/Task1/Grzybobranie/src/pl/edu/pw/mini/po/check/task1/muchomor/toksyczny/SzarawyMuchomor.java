package pl.edu.pw.mini.po.check.task1.muchomor.toksyczny;

public class SzarawyMuchomor extends ToksycznyMuchomor {

	private static final int ROK_ODKRYCIA_GATUNKU = 1783;

	public SzarawyMuchomor() {
		ustawMaseOwocnika(25, 75);
		toksyny = Toksyny.TRUJACE;
	}

	@Override
	public void ugotuj() {
		super.ugotuj();
		toksyny = Toksyny.NIEOBECNE;
	}

	@Override
	public boolean isTrujacy() {
		return toksyny != Toksyny.NIEOBECNE;
	}

	@Override
	public String toString() {
		return "SzarawyMuchomor ["+ getInfo() + " rok odkrycia: " + ROK_ODKRYCIA_GATUNKU + "]";
	}

}
