package pl.edu.pw.mini.po.lab02.composite;

public class Ring {
	
	private Bike bike;
	
	public Ring(Bike bike) {
		this.bike = bike;
	}
	
	public void ring() {
		System.out.println(bike.getOwnerName() + "`s bike is ringing!");
	}
	
}
