package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class app {

	public static void main(String[] args) {
				
		VerkhovnaRada.getInstance();		
		
		Deputy deputy = new Deputy();
		Faction faction = new Faction();
		
		List<Deputy> deputyList = new ArrayList<Deputy>();		
		List<List> deputyList2D = new ArrayList<>();				
		List<String> fractionDeputy = new ArrayList<String>();		
		
		VerkhovnaRada verkhovnaRada = VerkhovnaRada.getInstance();
		
		while(true) {
			menu();
			Scanner sc = new Scanner(System.in);
			switch (sc.next()) {
			case "1":
				verkhovnaRada.addFraction(fractionDeputy, deputyList2D);
				break;
			case "2":
				verkhovnaRada.removeFraction(fractionDeputy, deputyList2D);
				break;
			case "3":
				verkhovnaRada.allPrintFraction(fractionDeputy);
				break;
			case "4":
				verkhovnaRada.clearWhichFractionDeputy(fractionDeputy, deputyList2D, faction);
				break;
			case "5":
				verkhovnaRada.whichPrintFractionDeputy(fractionDeputy, deputyList2D, faction);
				break;
			case "6":
				verkhovnaRada.addwhichFractionDeputy(fractionDeputy, deputyList2D, faction, deputy);
				break;
			case "7":
				verkhovnaRada.remoteWhichFractionDeputy(fractionDeputy, deputyList2D, faction);
				break;
			case "8":
				verkhovnaRada.allGrafterWhichFractionDeputy(fractionDeputy, deputyList2D, faction);
				break;
			case "9":
				verkhovnaRada.biggerGrafterWhichFractionDeputy(fractionDeputy, deputyList2D, faction);				
				break;
			default:
				break;
			}			
		}
	}
	
	public static void menu() {
		System.out.println();
		System.out.println("     Введіть 1 щоб додати фракцію ");
		System.out.println("     Введіть 2 щоб видалити конкретну фракцію ");
		System.out.println("     Введіть 3 щоб вивести усі  фракції ");
		System.out.println("     Введіть 4 щоб очистити конкретну фракцію");
		System.out.println("     Введіть 5 щоб вивести конкретну фракцію");
		System.out.println("     Введіть 6 щоб додати депутата в фракцію");
		System.out.println("     Введіть 7 щоб видалити депутата з фракції");
		System.out.println("     Введіть 8 щоб вивести список хабарників");
		System.out.println("     Введіть 9 щоб вивести найбільшого хабарника");
		
	}
}
