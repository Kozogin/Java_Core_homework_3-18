package ua.lviv.lgs.t2;

public class Change_dash {
	
	public static void main(String[] args) {
		
		StringBuffer text = new StringBuffer("Створити програму, яка буде перевіряти, чи є слово з п'яти букв, введене користувачем,\r\n" + 
				"\r\n" + 
				"паліндромом (приклади: «пилип», «ротор»). Якщо введено слово не з 5 букв, то\r\n" + 
				"\r\n" + 
				"повідомляти про помилку. Програма повинна нормально обробляти слово, навіть якщо в\r\n" + 
				"\r\n" + 
				"ньому використані символи різного регістру. Наприклад, слова «Комок» або «РОТОР» слід\r\n" + 
				"\r\n" + 
				"також вважати паліндромами.");
		
		for(int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			
			switch (letter) {
				case 'а':
				case 'и':
				case 'і':
				case 'е':
				case 'у':
				case 'о':
				case 'А':
				case 'І':
				case 'Е':
				case 'У':
				case 'О':
					
					text.replace(i, i+1, "-");
					
					break;
				default:
					break;
			}
		}
		
		System.out.println(text);
	}
	
	
}
