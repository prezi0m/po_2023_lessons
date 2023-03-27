package pl.edu.pw.mini.po.other.interfaces.atm;

public class Skarbonka implements CashSet, CashGet{

	@Override
	public int getBalance() {
		return 0;
	}

	@Override
	public String caution() {
		return null;
	}

	@Override
	public void withdrawCash(int cashToGet) {
		
	}

	@Override
	public void refillCash(int cash) {
		
	}
	
}
