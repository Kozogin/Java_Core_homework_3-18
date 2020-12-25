package ua.lviv.lgs.t4;

public class Find_word {

	//public static int countEni = 0;
	
public static void main(String[] args) {
		
		String text;
		
		text = "�����, -������ ����� (������: ����. (���������: ����� ����� ������ ���� ������, ������). ���� ���� ������� ����� ���� �� � 5 ����,";
		
//		text = "�������� ��������, ��� �����, ���� ���������, �� � ����� � �'��� ����, ������� ������������, "+
//				"���������� (�:��������: ������, ������). ���� ������� ����� �� � 5 ����, ������������ ��� "+
//				"�������. �������� ������� �����, ��������� ��������� �����, ����� ���� ������ ���������� "+
//				"������� ������ �������. ���������, ����� ������ ��� �����л ��� ����� ������� �����������.";
				
		String[] arr = text.split(" ");		
		Enique [] wordUnique = new Enique [arr.length/2];
		
		int countWordUnique = 0;
		
		for(int i = 0; i < arr.length; i++){
			
				if(arr[i].length() > 2) {
					StringBuffer word = new StringBuffer(arr[i]);
					word = cLeanWord(word);
						for(int j = 0; j < arr.length; j++) {
							if(arr[j].length() > 2) {
								StringBuffer wordAll = new StringBuffer(arr[j]);
								wordAll = cLeanWord(wordAll);							
								
								if(word.toString().equalsIgnoreCase(wordAll.toString()) && i!=j) {
										countWordUnique = findUnique(wordUnique, countWordUnique, word);
										
								}
							}
						}
				}
		}
		
		CountUnique[] countUniWord = new CountUnique[countWordUnique + 1];
		countUnique(wordUnique, arr, countUniWord);
		int max = countUniWord[0].getCount();
		int index = 0;
		for(int i = 0; i < countUniWord.length - 1; i++) {
			if(max < countUniWord[i].getCount()) {
				max = countUniWord[i].getCount();
				index = i;
			}
		}
		
		System.out.println("��������� ������������ ����� << " + countUniWord[index].getUniqueWord() + 
				" >> " + countUniWord[index].getCount() + " ����");
	}

private static void countUnique(Enique [] wordUnique, String[] arr, CountUnique[] countUniWord) {
	int countWord = 0;	
	for(int j = 0; j < countUniWord.length - 1; j++) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].length() > 2) {
				StringBuffer word = new StringBuffer(arr[i]);
				word = cLeanWord(word);								
					if(word.toString().equalsIgnoreCase(wordUnique[j].getUniqueWord().toString())) {
						countWord++;
					}					
				}				
			}
			countUniWord [j] = new CountUnique(wordUnique[j].getUniqueWord(), countWord);		
			System.out.println(wordUnique[j].getUniqueWord() + " - " + countWord);
			countWord = 0;		
	}
}

	private static int findUnique(Enique [] wordUnique, int countWordUnique, StringBuffer word) {
		/*����� ������������ ��������� ���*/
		
		try {
		boolean flag = false;		
		if(countWordUnique == 0) {
			wordUnique[countWordUnique]= new Enique(countWordUnique, word);
			countWordUnique++;
		} else {			
			for(int i = 0; i < countWordUnique; i++) {
				if(wordUnique[i].getUniqueWord().toString().
						equalsIgnoreCase(word.toString())) {
					flag = true;
				}	
			}			
			if(!flag) {
				wordUnique[countWordUnique]= new Enique(countWordUnique, word);
				countWordUnique++;
			}
		}
		} catch (NullPointerException e) {
			e.printStackTrace();		
		}	
		return countWordUnique;
	}
	
	private static StringBuffer cLeanWord(StringBuffer wordClean) {	
		/*������� ����� � ���� ����� �� �������*/
		
		boolean again;
		do {
		again = false;		
		char letter =wordClean.charAt(0);			
		if(symbol(letter)) {
			wordClean.delete(0, 1);
			again = true;
		}
		int endWord = wordClean.length()-1;
		letter =wordClean.charAt(endWord);
		if(symbol(letter)) {
			wordClean.delete(endWord, endWord + 1);
			again = true;
		}
		}while(again);
			return wordClean;
	}
	
	private static boolean symbol(char letter) {		
		switch (letter) {
			case '�':
			case '�':
			case '(':
			case ')':
			case ',':
			case '.':
			case ':':
			case ';':
			case '-':	
				return true;	
			default:
				break;
		}
		return false;
	}
}


