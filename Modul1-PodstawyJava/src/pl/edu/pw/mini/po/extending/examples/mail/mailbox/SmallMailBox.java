package pl.edu.pw.mini.po.extending.examples.mail.mailbox;

import pl.edu.pw.mini.po.extending.examples.mail.letter.Letter;

public class SmallMailBox extends Mailbox {

	@Override
	public void putMail(Letter letter) {
		System.out.println("Uwaga uwaga: ");
		letter.readMe();
	}
	
}
