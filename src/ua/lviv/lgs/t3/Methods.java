/*
 * LOGOS IT Academy
 * Java Core course lesson 9
 * Enum
 */

package ua.lviv.lgs.t3;

import java.util.Scanner;

import ua.lviv.lgs.t3.Enumeration.Month;

/**
 * @author Vasily
 * @since 1.8
 * @version 1.1 * 
 * */

public class Methods {
	
	/**
	 * @author Vasily
	 * @see Metua.lviv.lgs.t3.Enumeration
	 * */

	static void case0() {
	
		/*see Metua.lviv.lgs.t3.Enumeration static void menu()*/
		Month[] arrMonth = Month.values();
		Scanner sc = new Scanner(System.in);
		boolean flag;
		String month;

		System.out.println("������ �����");
		sc = new Scanner(System.in);
		month = sc.next().toUpperCase();
		flag = isMonthPresent(arrMonth, month);
		if (!flag) {
			System.out.println("������ ����� �� ����");
		}
	}

	static void case1() {

		Month[] arrMonth = Month.values();
		Scanner sc = new Scanner(System.in);
		boolean flag;
		String month;
		int ordinal;

		System.out.println("������ �����");
		sc = new Scanner(System.in);
		month = sc.next().toUpperCase();
		flag = isMonthPresent(arrMonth, month);
		
		if (flag) {
			Month monthS = Month.valueOf(month);
			ordinal = monthS.getSeason().ordinal();

			for (Month m : arrMonth) {
				if (ordinal == m.getSeason().ordinal() && !(m.name().equals(month))) {
					System.out.println(m.name());
				}
			}
		}
		if (!flag) {
			System.out.println("������ ����� �� ����");
		}
	}

	static void case2() {

		Month[] arrMonth = Month.values();
		Scanner sc = new Scanner(System.in);
		boolean flag;
		String month;
		int day = 0;
		boolean flagM = false;

		System.out.println("������ �����");
		sc = new Scanner(System.in);
		month = sc.next().toUpperCase();
		flag = isMonthPresent(arrMonth, month);

		if (flag) {
			for (Month m : arrMonth) {
				if (m.name().equals(month)) {
					day = m.getDay();
				}
			}
			for (Month m : arrMonth) {
				if (m.getDay() == day && !(m.name().equals(month))) {
					System.out.println(m.name());
					flagM = true;
				}
			}
		}
		if (!flag) {
			System.out.println("������ ����� �� ����");
		}
		if (!flagM) {
			System.out.println("���� ����� � ����� � �-��� ���");
		}
	}

	static void case3() {

		Month[] arrMonth = Month.values();
		Scanner sc = new Scanner(System.in);
		boolean flag;
		String month;
		int day = 0;
		boolean flagM = false;

		System.out.println("������ �����");
		sc = new Scanner(System.in);
		month = sc.next().toUpperCase();
		flag = isMonthPresent(arrMonth, month);
		flagM = false;
		
		if (flag) {
			for (Month m : arrMonth) {
				if (m.name().equals(month)) {
					day = m.getDay();
				}
			}
			for (Month m : arrMonth) {
				if (m.getDay() < day && !(m.name().equals(month))) {
					System.out.println(m.name());
					flagM = true;
				}
			}
		}
		if (!flag) {
			System.out.println("������ ����� �� ����");
		}
		if (!flagM) {
			System.out.println("���� ����� � ������ �-��� ���");
		}

	}

	static void case4() {

		Month[] arrMonth = Month.values();
		Scanner sc = new Scanner(System.in);
		boolean flag;
		String month;
		int day = 0;
		boolean flagM = false;

		System.out.println("������ �����");
		sc = new Scanner(System.in);
		month = sc.next().toUpperCase();
		flag = isMonthPresent(arrMonth, month);
		flagM = false;

		if (flag) {
			for (Month m : arrMonth) {
				if (m.name().equals(month)) {
					day = m.getDay();
				}
			}
			for (Month m : arrMonth) {
				if (m.getDay() > day && !(m.name().equals(month))) {
					System.out.println(m.name());
					flagM = true;
				}
			}
		}
		if (!flag) {
			System.out.println("������ ����� �� ����");
		}
		if (!flagM) {
			System.out.println("���� ����� � ������ �-��� ���");
		}
	}

	static void case5() {

		Month[] arrMonth = Month.values();
		Scanner sc = new Scanner(System.in);
		boolean flag;
		String seas;
		int ordinal = 0;
		boolean flagM = false;

		System.out.println("������ ���� ����");
		sc = new Scanner(System.in);
		seas = sc.next().toUpperCase();
		flag = isMonthPresent(arrMonth, seas);

		for (Month s : arrMonth) {
			if (s.getSeason().name().equals(seas)) {
				ordinal = s.getSeason().ordinal();
				flag = true;
			}
		}
		if (flag) {
			ordinal += 1;
			if (ordinal > 3) {
				ordinal -= 4;
			}
			for (Month s : arrMonth) {
				if (ordinal == s.getSeason().ordinal()) {
					System.out.println(s.getSeason().name());
					break;
				}
			}
		}
		if (!flag) {
			System.out.println("������ ������ �� ����");
		}
	}

	static void case6() {

		Month[] arrMonth = Month.values();
		Scanner sc = new Scanner(System.in);
		boolean flag;
		String seas;
		int ordinal = 0;

		System.out.println("������ ���� ����");
		sc = new Scanner(System.in);
		seas = sc.next().toUpperCase();
		flag = isMonthPresent(arrMonth, seas);

		for (Month s : arrMonth) {
			if (s.getSeason().name().equals(seas)) {
				ordinal = s.getSeason().ordinal();
				flag = true;
			}
		}
		if (flag) {
			ordinal -= 1;
			if (ordinal < 0) {
				ordinal += 4;
			}
			for (Month s : arrMonth) {
				if (ordinal == s.getSeason().ordinal()) {
					System.out.println(s.getSeason().name());
					break;
				}
			}
		}
		if (!flag) {
			System.out.println("������ ������ �� ����");
		}
	}

	static void case7() {

		Month[] arrMonth = Month.values();

		for (Month m : arrMonth) {
			if (m.getDay() % 2 == 0) {
				System.out.println(m);
			}
		}
	}

	static void case8() {

		Month[] arrMonth = Month.values();

		for (Month m : arrMonth) {
			if (m.getDay() % 2 == 1) {
				System.out.println(m);
			}
		}
	}

	static void case9() {

		Month[] arrMonth = Month.values();
		Scanner sc = new Scanner(System.in);
		boolean flag;
		String month;

		System.out.println("������ �����");
		sc = new Scanner(System.in);
		month = sc.next().toUpperCase();
		flag = isMonthPresent(arrMonth, month);
		Month monthS = Month.valueOf(month);

		if (monthS.getDay() % 2 == 0) {
			System.out.println("̳���� " + month + " �� ����� ������� ���");
		} else {
			System.out.println("̳���� " + month + " �� ������� ������� ���");
		}
	}

	private static boolean isMonthPresent(Month[] arrMonth, String month) {
		boolean flag = false;
		for (Month m : arrMonth) {
			if (m.name().equals(month)) {
				System.out.println("����� ����� ����");
				flag = true;
			}
		}
		return flag;
	}
}
