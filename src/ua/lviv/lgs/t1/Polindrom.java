package ua.lviv.lgs.t1;

import java.util.Scanner;

public class Polindrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word5;
		
		while(true) {
			System.out.println("   Введіть слово з 5 букв");
			sc = new Scanner(System.in);
			word5 = sc.next();
				checkInputWord(word5);
		}
	}	
		
static void checkInputWord(String word5) {
		
		try {
			if(word5.length() != 5) {
				throw new WrongInputConsoleParametersException("Невірний ввід. Введіть слово, 5 букв " + word5);
			}		
		} catch(WrongInputConsoleParametersException e) {
			e.printStackTrace();
		}
		
		StringBuffer poli = new StringBuffer(word5);		
		poli.reverse();
		String wordRevers = new String(poli);
		
		if(word5.equalsIgnoreCase(wordRevers)) {
			System.out.println("Слово " + word5 +" є поліндромом");
		}else {
			System.out.println("Слово " + word5 +" не є поліндромом");
		}		
	}
}

class WrongInputConsoleParametersException extends Exception{
	
	private String parametr;

	public WrongInputConsoleParametersException(String parametr) {
		super(parametr);
		this.parametr = parametr;
	}

	public String getParametr() {
		return parametr;
	}
}
