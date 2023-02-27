package pl.edu.pw.mini.po.lab02.composite;

public class Tyre {

	private double pressure;

	public Tyre(double pressure) {
		this.pressure = pressure;
	}

	@Override
	public String toString() {
		return "Tyre [pressure=" + pressure + "]";
	}

}
