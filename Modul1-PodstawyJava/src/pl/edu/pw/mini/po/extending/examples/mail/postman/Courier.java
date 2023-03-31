package pl.edu.pw.mini.po.extending.examples.mail.postman;

import pl.edu.pw.mini.po.extending.examples.mail.mailbox.Mailbox;

public class Courier extends GradedPostman {
	
	public Courier(Mailbox[] mailboxes) {
		super(mailboxes);
		postManType = PostManType.COURIER;//Tak nie robimy!!!
	}

}
