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
		System.out.println("	������ �������� �����,                         ������ 1");
		System.out.println("	������ �������� �� �������� �����,             ������ 2");
		System.out.println("	�������� �������� � �������� �����,            ������ 3");
		System.out.println("	�������� �������� � �����,                     ������ 4");
		System.out.println("	�������� ��������� �������� � ��� ��������, ������ 5");
		System.out.println("	������� �� ����� �������,                      ������ 6");
		System.out.println("	����� � ��������,                              ������ 7");
	}

}
