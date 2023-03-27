package pl.edu.pw.mini.po.other.interfaces.atm;

public interface CashGet extends BalanceGet, Actionable {
	void withdrawCash(int cashToGet);
}
