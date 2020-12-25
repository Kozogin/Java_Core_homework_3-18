package ua.lviv.lgs.t1;

/* https://habr.com/ru/company/sberbank/blog/416413/
 * Змінна типу (Т) не є reifiable, тобто інформація про цей тип доступна лише під
 * час компіляції. Із-за процесса затирання типів компілятором інформація цього типу
 * губиться. Type Erasure перетворює  List<Integer> в List. Тобто в непараметризований
 * тип.    
 */

import java.util.ArrayList;
import java.util.List;

public class StringToListInteger {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(0);
		list.add(25);
		list.add(50);
		list.add(75);
		list.add(100);
		
			System.out.println(list);
		addString(list);
			System.out.println(list);
		list.add(125);
			System.out.println(list);
		//list.add((T)"string ");	compile-time err
		
	}

		@SuppressWarnings("unchecked")//указывает компилятору игнорировать или подавлять указанное предупреждение компилятора в аннотированном элементе и все элементы
		public static <T> void addString(List<T> list) { 
			
			list.add((T)"Text add to list");
			list.add((T)"string ");
			list.add((T)"add ");
			list.add((T)"to");
			list.add((T)"List<Integer>");		
			   
		}	

}
