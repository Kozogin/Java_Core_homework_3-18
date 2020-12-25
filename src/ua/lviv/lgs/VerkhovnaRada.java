package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class VerkhovnaRada {
	
	private static VerkhovnaRada verkhovnaRada;
	
	
	private VerkhovnaRada() {}
		
		public static synchronized VerkhovnaRada getInstance() {
			if (verkhovnaRada == null) {
				verkhovnaRada = new VerkhovnaRada();
			}
			return verkhovnaRada;
		}
		
		public void addFraction(List<String> fractionDeputy, List<List> deputyList2D) {
			System.out.println();
			System.out.println("Додати фракцію, введіть назву фракції:");		
			Scanner sc = new Scanner(System.in);
			String factionName = sc.next();
			Iterator<String> iterator = fractionDeputy.iterator();
			boolean exist = false;
			while(iterator.hasNext()) {
				if(iterator.next().equalsIgnoreCase(factionName)) {
					System.out.println("Така фракція вже існує");
					exist = true;
				}
			}
			if(!exist) {
				fractionDeputy.add(factionName);
				deputyList2D.add(new ArrayList<Deputy>());
			}
		}
		
		public void removeFraction(List<String> fractionDeputy, List<List> deputyList2D) {
			System.out.println();
			System.out.println("Видалити фракцію, введіть назву фракції:");		
			Scanner sc = new Scanner(System.in);
			String factionName = sc.next();
			Iterator<String> iterator = fractionDeputy.iterator();
			int indexFaction = 0;
			while(iterator.hasNext()) {
				if(iterator.next().equalsIgnoreCase(factionName)) {
					iterator.remove();
					System.out.println(indexFaction);
					deputyList2D.remove(indexFaction);
				}
				
				indexFaction++;
			}
		}
		
		public void allPrintFraction(List<String> fractionDeputy) {
			System.out.println();
			System.out.println("Всі фракції:");			
			for (String string : fractionDeputy) {
				System.out.println(string);
			}			
		}
		
		public void whichPrintFractionDeputy(List<String> fractionDeputy, List<List> deputyList2D, 
											Faction faction) {
			System.out.println();
			allPrintFraction(fractionDeputy);
			
			System.out.println("Яку фракцію вивести, введіть назву фракції:");		
			Scanner sc = new Scanner(System.in);
			String factionName = sc.next();
			
			Iterator<String> iterator = fractionDeputy.iterator();
			int indexFaction = 0;
			while(iterator.hasNext()) {
				if(iterator.next().equalsIgnoreCase(factionName)) {
					faction.allFraction(deputyList2D.get(indexFaction));
				}				
				indexFaction++;
			}
			
		}
		
		public void addwhichFractionDeputy(List<String> fractionDeputy, List<List> deputyList2D, 
											Faction faction, Deputy deputy) {
			System.out.println();
			allPrintFraction(fractionDeputy);
			
			System.out.println("В яку фракцію додати депутата, введіть назву фракції:");		
			Scanner sc = new Scanner(System.in);
			String factionName = sc.next();
			
			Iterator<String> iterator = fractionDeputy.iterator();
			int indexFaction = 0;
			while(iterator.hasNext()) {
				if(iterator.next().equalsIgnoreCase(factionName)) {
					faction.addDeputy(deputyList2D.get(indexFaction));
					int indexLastDeputy = deputyList2D.get(indexFaction).size() - 1;
					//Deputy deputyWishBribe;
					deputy = ((Deputy) deputyList2D.get(indexFaction).get(indexLastDeputy));					
					deputy.takeBribe();
					System.out.println(deputy);
					deputyList2D.get(indexFaction).remove(indexLastDeputy);
					deputyList2D.get(indexFaction).add(deputy);
				}				
				indexFaction++;
			}			
		}
		
	public void remoteWhichFractionDeputy(List<String> fractionDeputy, List<List> deputyList2D, 
									Faction faction) {
		System.out.println();
		allPrintFraction(fractionDeputy);

		System.out.println("З якої фракціЇ видалити депутата, введіть назву фракції:");
		Scanner sc = new Scanner(System.in);
		String factionName = sc.next();

		Iterator<String> iterator = fractionDeputy.iterator();
		int indexFaction = 0;
		while (iterator.hasNext()) {
			if (iterator.next().equalsIgnoreCase(factionName)) {
				faction.removeDeputy(deputyList2D.get(indexFaction));
			}
			indexFaction++;
		}
	}
	
	public void clearWhichFractionDeputy(List<String> fractionDeputy, List<List> deputyList2D, Faction faction) {
		System.out.println();
		allPrintFraction(fractionDeputy);

		System.out.println("З якої фракціЇ видалити депутата, введіть назву фракції:");
		Scanner sc = new Scanner(System.in);
		String factionName = sc.next();

		Iterator<String> iterator = fractionDeputy.iterator();
		int indexFaction = 0;
		while (iterator.hasNext()) {
			if (iterator.next().equalsIgnoreCase(factionName)) {
					deputyList2D.get(indexFaction).clear();
			}
			indexFaction++;
		}
	}
	
	public void allGrafterWhichFractionDeputy(List<String> fractionDeputy, List<List> deputyList2D, 
									Faction faction) {
		System.out.println();
		allPrintFraction(fractionDeputy);

		System.out.println("З якої фракціЇ вивести хабарників депутатів, введіть назву фракції:");
		Scanner sc = new Scanner(System.in);
		String factionName = sc.next();

		Iterator<String> iterator = fractionDeputy.iterator();
		int indexFaction = 0;
		while (iterator.hasNext()) {
			if (iterator.next().equalsIgnoreCase(factionName)) {
				faction.allGrafter(deputyList2D.get(indexFaction));
			}
			indexFaction++;
		}
	}
	
	public void biggerGrafterWhichFractionDeputy(List<String> fractionDeputy, List<List> deputyList2D,
									Faction faction) {
		System.out.println();
		allPrintFraction(fractionDeputy);

		System.out.println("З якої фракціЇ вивести найбільшого хабарника депутата, введіть назву фракції:");
		Scanner sc = new Scanner(System.in);
		String factionName = sc.next();

		Iterator<String> iterator = fractionDeputy.iterator();
		int indexFaction = 0;
		while (iterator.hasNext()) {
			if (iterator.next().equalsIgnoreCase(factionName)) {
				faction.biggerGrafter(deputyList2D.get(indexFaction));
			}
			indexFaction++;
		}
	}
		
		


}
