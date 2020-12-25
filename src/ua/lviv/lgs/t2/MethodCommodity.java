package ua.lviv.lgs.t2;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class MethodCommodity {
	Commodity commodity = new Commodity("",0,0,0);
	
	public void addCommodity(List<Commodity> listCommodity) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("¬вед≥ть найменуванн€ товару: ");
		String name = sc.next();
		
		Scanner scInt = new Scanner(System.in);
		System.out.println("¬вед≥ть довжину товару: ");
		int length = scInt.nextInt();
		
		System.out.println("¬вед≥ть ширину товару: ");
		int width = scInt.nextInt();
		
		System.out.println("¬вед≥ть вагу товару: ");
		int weight = scInt.nextInt();
		
		listCommodity.add(new Commodity(name, length, width, weight));
	}
	
	public void removeCommodity(List<Commodity> listCommodity) {
		
		Iterator<Commodity> iterator = listCommodity.iterator();
		while(iterator.hasNext()) {
			commodity = iterator.next();
			System.out.println(commodity);
			System.out.println("¬идалити дану позиц≥ю - введеть Y, н≥ - N (або ≥нше)");
			Scanner sc = new Scanner(System.in);
				if(sc.next().equalsIgnoreCase("Y")) {
					iterator.remove();
					System.out.println("¬идалено");
				}			
		}		
	}
	
	public void replaceCommodity(List<Commodity> listCommodity) {
		
		ListIterator<Commodity> listIterator = listCommodity.listIterator();		
		while(listIterator.hasNext()) {
			commodity = listIterator.next();
			System.out.println(commodity);
			System.out.println("«ам≥нити дану позиц≥ю - введеть Y, н≥ - N (або ≥нше)");
			Scanner sc = new Scanner(System.in);
				if(sc.next().equalsIgnoreCase("Y")) {
					listIterator.remove();
					
					System.out.println("¬вед≥ть найменуванн€ товару: ");
					String name = sc.next();
					
					Scanner scInt = new Scanner(System.in);
					System.out.println("¬вед≥ть довжину товару: ");
					int length = scInt.nextInt();
					
					System.out.println("¬вед≥ть ширину товару: ");
					int width = scInt.nextInt();
					
					System.out.println("¬вед≥ть вагу товару: ");
					int weight = scInt.nextInt();
					
					listIterator.add(new Commodity(name, length, width, weight));					
				}			
		}		
	}
	
	public void showNElementCommodity(List<Commodity> listCommodity) {
		System.out.println("¬вед≥ть є елемента дл€ виводу");
		Scanner scInt = new Scanner(System.in);
		int elementN = scInt.nextInt();
		int indexList = 0;

		Iterator<Commodity> iterator = listCommodity.iterator();
		while (iterator.hasNext()) {
			commodity = iterator.next();
			if(indexList == elementN) {
				System.out.println(commodity);
				System.out.println();
			}			
			indexList++;
		}
	}
	
	
	
}

