package ua.lviv.lgs.t4;

public class CountUnique {

	private StringBuffer uniqueWord;
	private int count;
	
	public CountUnique(StringBuffer uniqueWord, int count) {
		this.uniqueWord = uniqueWord;
		this.count = count;
	}	
	
	public StringBuffer getUniqueWord() {
		return uniqueWord;
	}

	public int getCount() {
		return count;
	}
	
}
