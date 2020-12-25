package ua.lviv.ua;

import java.util.Scanner;

public class AppPet {

	public static void main(String[] args) {
		
		ZooClub zoo = new ZooClub();
		
		Scanner sc = new Scanner(System.in);
			while(true) {
				menu();
				switch (sc.next()) {
				case "1":
					zoo.addPerson();
					break;
				case "2":
					zoo.addPetForPerson();
					break;
				case "3":
					zoo.removePetForPerson();
					break;
				case "4":
					zoo.removePerson();
					break;
				case "5":
					zoo.removeWhichPetAllPerson();
					break;
				case "6":
					zoo.printAllZooClub();
					break;
				case "7":
					System.exit(0);
					break;
				default:
					break;
				}
			}
	}
	
	public static void menu() {
		System.out.println();
		System.out.println("	Додати учасника клубу,                         Введіть 1");
		System.out.println("	Додати тваринку до учасника клубу,             Введіть 2");
		System.out.println("	Видалити тваринку з учасника клубу,            Введіть 3");
		System.out.println("	Видалити учасника з клубу,                     Введіть 4");
		System.out.println("	Видалити конкретну тваринку зі всіх власників, Введіть 5");
		System.out.println("	Вивести на екран зооклуб,                      Введіть 6");
		System.out.println("	Вийти з програми,                              Введіть 7");
	}

}
