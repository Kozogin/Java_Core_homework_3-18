package ua.lviv.lgs.t3;

public class Count_letter {
	
	public static void main(String[] args) {
		
		String text;
		
		text = "Порахувати кількість слів у реченні. (Речення довільне)";
		
		System.out.println(text);
		
		String[] arr = text.split(" ");
		int count = 0;
		for(int i = 0; i < arr.length; i++){
			
				if(arr[i].length() > 2) {
					System.out.print(arr[i] + "    ");
					count++;
				}
		}
		System.out.println();
		System.out.println("Кількість слів у реченні: " + count);
	}
}
