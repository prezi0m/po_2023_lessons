package pl.edu.pw.mini.po.check.task1.muchomor.toksyczny;

public class SromotnikowyMuchomor extends ToksycznyMuchomor {

	public SromotnikowyMuchomor() {
		ustawMaseOwocnika(25, 75);
		toksyny = masaOwocnika < 50 ? Toksyny.ZABOJCZE : Toksyny.WYJATKOWO_ZABOJCZE;
	}

	@Override
	public boolean isTrujacy() {
		return true;
	}

	@Override
	public String toString() {
		return "SromotnikowyMuchomor ["+getInfo()+"]";
	}

}
