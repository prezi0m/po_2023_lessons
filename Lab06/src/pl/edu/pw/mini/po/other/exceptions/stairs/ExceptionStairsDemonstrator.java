package pl.edu.pw.mini.po.other.exceptions.stairs;

import pl.edu.pw.mini.po.other.exceptions.nature.exceptions.FirstException;

public class ExceptionStairsDemonstrator {
	
	public static void main(String...strings) {
		//Tutaj wypada juz zlapac
	}
	
	private static void firstMethod() throws FirstException{
		secondMethod();
	}
	
	private static void secondMethod() throws FirstException{
		thirdMethod();
	}
	
	private static void thirdMethod() throws FirstException {
		fourthMethod();
	}

	private static void fourthMethod() throws FirstException{
		
	}
	
}
