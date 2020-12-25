package ua.lviv.lgs.t2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MenuApplication {
	public static void main(String[] args) {
		
		MethodCommodity methodCommodity = new MethodCommodity();		
		List<Commodity> listCommodity = new ArrayList<>();
		
		listCommodity.add(new Commodity("Корабель", 20, 8, 260));
		listCommodity.add(new Commodity("Літак", 20, 8, 250));
		listCommodity.add(new Commodity("Літак", 21, 8, 360));
		listCommodity.add(new Commodity("Корабель", 20, 9, 1250));
		listCommodity.add(new Commodity("Автомобіль", 20, 8, 150));
		listCommodity.add(new Commodity("Автомобіль", 21, 9, 300));
		listCommodity.add(new Commodity("Корабель", 20, 7, 350));
		listCommodity.add(new Commodity("Мотоцикл", 21, 10, 250));
		listCommodity.add(new Commodity("Вантажівка", 20, 8, 250));
		listCommodity.add(new Commodity("Корабель", 21, 6, 210));
		listCommodity.add(new Commodity("Корабель", 21, 8, 350));		
		
		while(true) {
			menu();
			Scanner sc = new Scanner(System.in);
			switch (sc.next()) {
			case "1":
				methodCommodity.addCommodity(listCommodity);
				print(listCommodity);
				break;
			case "2":
				methodCommodity.removeCommodity(listCommodity);
				print(listCommodity);
				break;
			case "3":
				methodCommodity.replaceCommodity(listCommodity);
				print(listCommodity);
				break;
			case "4":
				print(listCommodity);
				Collections.sort(listCommodity, new CommodityNameComparator());
				print(listCommodity);
				break;
			case "5":
				print(listCommodity);
				Collections.sort(listCommodity, new CommodityLengthComparator());
				print(listCommodity);
				break;
			case "6":
				print(listCommodity);
				Collections.sort(listCommodity, new CommodityWidthComparator());
				print(listCommodity);
				break;
			case "7":
				print(listCommodity);
				Collections.sort(listCommodity, new CommodityWeightComparator());
				print(listCommodity);
				break;
			case "8":
				methodCommodity.showNElementCommodity(listCommodity);
				break;
			case "9":
				System.exit(0);
				break;
			default:
				break;
			}			
		}		
	}
	
	public static void menu() {
		System.out.println("   Додати товар,                    введіть 1");
		System.out.println("   Видалити товар,                  введіть 2");
		System.out.println("   Замінити товар,                  введіть 3");
		System.out.println("   Сортувати за назвою,             введіть 4");
		System.out.println("   Сортувати за довжиною,           введіть 5");
		System.out.println("   Сортувати за шириною,            введіть 6");
		System.out.println("   Сортувати за вагою,              введіть 7");
		System.out.println("   Виводимо і-тий елемент колекції, введіть 8");
		System.out.println("   Вийти з програми,                введіть 9");
		
	}
	
	public static void print(List<Commodity> listCommodity) {
		for (Commodity commodity : listCommodity) {
			System.out.println(commodity);
		}
		System.out.println();
	}

}
