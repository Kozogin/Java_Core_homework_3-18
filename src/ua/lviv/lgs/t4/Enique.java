package ua.lviv.lgs.t4;

public class Enique {
	
	private int number;
	private StringBuffer uniqueWord;	
	
	public Enique(int number, StringBuffer word) {
		this.number = number;
		this.uniqueWord = word;
	}
		
	public StringBuffer getUniqueWord() {
		return uniqueWord;
	}
}
