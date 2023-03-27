package pl.edu.pw.mini.po.lab05;

public class Uczen extends Czlowiek {
	
	public Uczen(String imie, String nazwisko) {
		super(imie, nazwisko);
	}

	@Override
	public String toString() {
		return "Uczen [imie=" + modyfikujeImie(imie) + "]";
	}

}
