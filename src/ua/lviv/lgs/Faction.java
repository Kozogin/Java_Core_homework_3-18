package ua.lviv.lgs;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Faction {

	public void addDeputy(List<Deputy> deputyList) {
		System.out.println();
		Deputy deputy = new Deputy();

		System.out.println("Додати депутата, введіть вагу:");
		Scanner sc = new Scanner(System.in);
		int parametrDeputy = sc.nextInt();
		deputy.setWeight(parametrDeputy);

		System.out.println("               , введіть ріст:");
		parametrDeputy = sc.nextInt();
		deputy.setGrowth(parametrDeputy);

		System.out.println("               , введіть Ім'я:");
		String nameDeputy = sc.next();
		deputy.setFirstName(nameDeputy);

		System.out.println("               , введіть Прізвище:");
		nameDeputy = sc.next();
		deputy.setLastName(nameDeputy);

		System.out.println("               , введіть вік:");
		parametrDeputy = sc.nextInt();
		deputy.setAge(parametrDeputy);

		System.out.println("     , введіть 'Y' якщо хабарник, інше якщо не бере хабарі:");
		nameDeputy = sc.next();
		switch (nameDeputy.toUpperCase()) {
		case "Y":
			deputy.setGrafter(true);
			break;
		default:
			deputy.setGrafter(false);
			break;
		}

		deputyList.add(deputy);
	}

	public void removeDeputy(List<Deputy> deputyList) {
		System.out.println();
		Iterator<Deputy> iterator = deputyList.iterator();
		while (iterator.hasNext()) {
			System.out.println("Видалити даного депутата Y - так, інше ні");
			System.out.println(iterator.next());
			Scanner sc = new Scanner(System.in);
			switch (sc.next().toUpperCase()) {
			case "Y":
				iterator.remove();
				break;
			default:
				break;

			}
		}
	}

	public void allGrafter(List<Deputy> deputyList) {
		System.out.println();
		System.out.println("Список депутатів хабарників: ");
		Iterator<Deputy> iterator = deputyList.iterator();
		while (iterator.hasNext()) {
			Deputy isGrafter = iterator.next();
			if (isGrafter.isGrafter()) {
				System.out.println(isGrafter);
			}
		}
	}

	public void biggerGrafter(List<Deputy> deputyList) {
		System.out.println();
		System.out.println("Найбільший хабарник: ");
		Deputy bigGrafter = deputyList.get(0);
		int maxGrafter = bigGrafter.getBribe();
		Deputy biggerGrafter = bigGrafter;

		Iterator<Deputy> iterator = deputyList.iterator();
		while (iterator.hasNext()) {
			bigGrafter = iterator.next();
			if (maxGrafter < bigGrafter.getBribe()) {
				maxGrafter = bigGrafter.getBribe();
				biggerGrafter = bigGrafter;
			}
		}
		System.out.println(biggerGrafter);
	}

	public void allFraction(List<Deputy> deputyList) {
		System.out.println();
		System.out.println("Список депутатів фракції: ");
		Iterator<Deputy> iterator = deputyList.iterator();
		while (iterator.hasNext()) {
			Deputy isGrafter = iterator.next();
			System.out.println(isGrafter);
		}
	}

}
