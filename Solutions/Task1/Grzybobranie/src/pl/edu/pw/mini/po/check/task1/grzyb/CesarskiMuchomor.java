package pl.edu.pw.mini.po.check.task1.grzyb;

public class CesarskiMuchomor extends Grzyb {

	public CesarskiMuchomor() {
		ustawMaseOwocnika(50, 75);
	}

	@Override
	protected void ustawTwardosc() {
		twardosc = Twardosc.TWARDY;
	}

	@Override
	public String toString() {
		return "CesarskiMuchomor [" + getInfo() + "]";
	}

}
