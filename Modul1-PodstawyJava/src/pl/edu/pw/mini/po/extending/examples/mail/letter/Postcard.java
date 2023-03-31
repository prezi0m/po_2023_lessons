package pl.edu.pw.mini.po.extending.examples.mail.letter;

public class Postcard  extends Letter {

	public Postcard(String text, Address address) {
		super(text, address);
	}

	@Override
	public String getAuthor() {
		return "Holiday friend";
	}

}
