package pl.edu.pw.mini.po.extending.examples.mail.postman;

import pl.edu.pw.mini.po.extending.examples.mail.mailbox.Mailbox;

public abstract class GradedPostman extends Postman {
	
	protected int grade;

	public GradedPostman(Mailbox[] mailboxes) {
		super(mailboxes);
	}
	
}
