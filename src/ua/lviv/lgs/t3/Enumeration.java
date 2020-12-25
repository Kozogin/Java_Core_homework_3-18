/*
 * LOGOS IT Academy
 * Java Core course lesson 9
 * Enum
 */

package ua.lviv.lgs.t3;

import java.util.Scanner;
/**
 * @author Vasily
 * @since 1.8
 * @version 1.1 * 
 * */

public class Enumeration {
	/**
	 * @author Vasily
	 * @see Metua.lviv.lgs.t3.Methods
	 * */
		
		enum Season{
			WINTER,
			SPRING,
			SUMMER,
			AUTUMN;
		}
		
		enum Month{
			JANUARY(31,Season.WINTER),
			FEBRUARY(28,Season.WINTER),
			MARCH(31,Season.SPRING),
			APRIL(30,Season.SPRING),
			MAY(31,Season.SPRING),
			JUNE(30,Season.SUMMER),
			JULY(31,Season.SUMMER),
			AUGUST(31,Season.SUMMER),
			SEPTEMBER(30,Season.AUTUMN),
			OCTOBER(31,Season.AUTUMN),
			NOVEMBER(30,Season.AUTUMN),
			DESEMBER(31,Season.WINTER);		
			
			int Day;
			Season season;
			
			/*this is Constructor*/
			private Month(int day, Season season) {
				Day = day;
				this.season = season;
			}

			public int getDay() {
				return Day;
			}

			public Season getSeason() {
				return season;
			}
			
		}
		
		/*Console menu from 0 to 11*/
		public static void main(String[] args) {
			
			/*assign enum to array*/
			Month [] arrMonth = Month.values();		
			Scanner sc = new Scanner(System.in);
			
			while(true) {
				
				menu();				
				switch (sc.next()) {
				
				case "0":
					Methods.case0();					
					break;
					
				case "1":
					Methods.case1();		
					break;					
					
				case "2":
					Methods.case2();		
					break;
					
				case "3":
					Methods.case3();	
					break;	
					
				case "4":
					Methods.case4();
					break;
					
				case "5":
					Methods.case5();
					break;
					
				case "6":
					Methods.case6();
					break;
					
				case "7":
					Methods.case7();
					break;
					
				case "8":
					Methods.case8();
					break;	
					
				case "9":
					Methods.case9();			
					break;
				}
			}
		}
		
		static void menu() {
			System.out.println("     �������� 0, ��� ��������, �� � ����� �����");
			System.out.println("     �������� 1, ������� ����� ���� � ����");
			System.out.println("     �������� 2, ������� �� ����� � ����� ������� ���");
			System.out.println("     �������� 3, ������� �� ����� � ������ ������� ���");
			System.out.println("     �������� 4, ������� �� ����� � ������ ������� ���");
			System.out.println("     �������� 5, ������� �������� ���� ����");
			System.out.println("     �������� 6, ������� ��������� ���� ����");
			System.out.println("     �������� 7, ������� ����� � ������ ������� ���");
			System.out.println("     �������� 8, ������� ����� � �������� ������� ���");
			System.out.println("     �������� 9, �������, �� � ����� � ������ ������� ���");
			
		}
	

}
