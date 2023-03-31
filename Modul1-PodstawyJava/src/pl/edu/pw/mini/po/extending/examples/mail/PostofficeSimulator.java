package pl.edu.pw.mini.po.extending.examples.mail;

import pl.edu.pw.mini.po.extending.examples.mail.letter.Address;
import pl.edu.pw.mini.po.extending.examples.mail.letter.AnonymousLetter;
import pl.edu.pw.mini.po.extending.examples.mail.letter.Letter;
import pl.edu.pw.mini.po.extending.examples.mail.letter.LoveLetter;
import pl.edu.pw.mini.po.extending.examples.mail.letter.NormalLetter;
import pl.edu.pw.mini.po.extending.examples.mail.letter.Postcard;
import pl.edu.pw.mini.po.extending.examples.mail.mailbox.BigMailBox;
import pl.edu.pw.mini.po.extending.examples.mail.mailbox.Mailbox;
import pl.edu.pw.mini.po.extending.examples.mail.mailbox.SmallMailBox;
import pl.edu.pw.mini.po.extending.examples.mail.postman.Courier;
import pl.edu.pw.mini.po.extending.examples.mail.postman.ErrandBoy;
import pl.edu.pw.mini.po.extending.examples.mail.postman.NormalPostman;
import pl.edu.pw.mini.po.extending.examples.mail.postman.Postman;

public class PostofficeSimulator {
	
	public static final int MAILBOX_SIZE = 4;
	
	public static void main(String[] args) {
		simulate();
	}

	public void method() {
		
	}
	
	private static void simulate() {
		
		Postman[] postmans = createPostmans();
		
		postmans[0].addLetter(new NormalLetter("This is letter", new Address(0)));
		postmans[0].addLetter(new NormalLetter("This is normal letter", new Address(1)));
		postmans[1].addLetter(new Postcard("Greetings frm Warsaw", new Address(2)));
		postmans[1].addLetter(new LoveLetter("I love u", new Address(0)));
		postmans[2].addLetter(new AnonymousLetter("I kill u!", new Address(3)));
		
		for(Postman postman : postmans) {
			postman.deliver();
		}
		
	}
	
	private static Postman[] createPostmans() {
		Postman[] result = new Postman[3];
		Mailbox[] mailboxes = createMailboxes();
		
		result[0] = new NormalPostman(mailboxes);
		result[1] = new ErrandBoy(mailboxes);
		result[2] = new Courier(mailboxes);
		
		return result;
	}
	
	private static Mailbox[] createMailboxes() {
		Mailbox[] result = new Mailbox[MAILBOX_SIZE]; 
		
		result[0] = new SmallMailBox();
		result[1] = new BigMailBox();
		result[2] = new SmallMailBox();
		result[3] = new BigMailBox();
		
		return result;
	}
	
}
