package pl.edu.pw.mini.po.lab05;

public class Pracownik extends Czlowiek {
	
	public Pracownik(String imie, String nazwisko) {
		super(imie, nazwisko);
	}

	@Override
	public String toString() {
		String nazwiskoUpper = nazwisko.toUpperCase();
		return "Pracownik [imie=" + modyfikujeImie(imie) + ", nazwisko=" + nazwiskoUpper + "]";
	}

}
