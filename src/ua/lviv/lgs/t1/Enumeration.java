package ua.lviv.lgs.t1;

import java.util.Scanner;

public class Enumeration {
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
	
	
	public static void main(String[] args) {
		Month [] arrMonth = Month.values();		
		Scanner sc = new Scanner(System.in);
		
			
		
		while(true) {
			
			menu();
			boolean flag;
			boolean flagM;
			String month;
			int day = 0;			
			int ordinal;
			String parametr = sc.next();
			
			try {
				if(!(Integer.parseInt(parametr) > -1 && Integer.parseInt(parametr) < 12 &&
						Integer.parseInt(parametr) % 1 == 0)) {				
					throw new WrongInputConsoleParametersException("������� ���. ������ ����� �� 0 �� 11, �� ����� - " + parametr);
				}				
			} catch(NumberFormatException e) {
				e.printStackTrace();
			} catch(WrongInputConsoleParametersException e) {
				e.printStackTrace();
			}
						
			switch (parametr) {
			case "0":
				System.out.println("������ �����");
				sc = new Scanner(System.in);
				month = sc.next().toUpperCase();
					checkInputMonthSeason(month);
				flag = isMonthPresent(arrMonth, month);
				if(!flag) {
					System.out.println("������ ����� �� ����");
				}
				break;
				
			case "1":
				System.out.println("������ �����");
				sc = new Scanner(System.in);
				month = sc.next().toUpperCase();
					checkInputMonthSeason(month);
				flag = isMonthPresent(arrMonth, month);
				if(flag) {
					Month monthS = Month.valueOf(month);
					ordinal = monthS.getSeason().ordinal();	
					
					for(Month m : arrMonth) {
						if(ordinal == m.getSeason().ordinal() && !(m.name().equals(month))) {								
							System.out.println(m.name());							
						}						
					}					
				}						
				if(!flag) {
					System.out.println("������ ����� �� ����");
				}			
				break;
				
				
			case "2":
				System.out.println("������ �����");
				sc = new Scanner(System.in);
				month = sc.next().toUpperCase();
					checkInputMonthSeason(month);
				flag = isMonthPresent(arrMonth, month);	
				flagM=false;
					if(flag) {
						for(Month m : arrMonth) {
							if(m.name().equals(month)) {
								day = m.getDay();
							}							 
						}					
						for(Month m : arrMonth) {
							if(m.getDay() == day && !(m.name().equals(month))) {								
								System.out.println(m.name());
								flagM = true;
							}						
						}
					}					
				if(!flag) {
					System.out.println("������ ����� �� ����");
				}
				if(!flagM) {
					System.out.println("���� ����� � ����� � �-��� ���");
				}
				break;	
				
			case "3":
				System.out.println("������ �����");
				sc = new Scanner(System.in);
				month = sc.next().toUpperCase();
					checkInputMonthSeason(month);
				flag = isMonthPresent(arrMonth, month);	
				flagM=false;
					if(flag) {
						for(Month m : arrMonth) {
							if(m.name().equals(month)) {
								day = m.getDay();
							}							 
						}					
						for(Month m : arrMonth) {
							if(m.getDay() < day && !(m.name().equals(month))) {								
								System.out.println(m.name());
								flagM = true;
							}						
						}
					}					
				if(!flag) {
					System.out.println("������ ����� �� ����");
				}
				if(!flagM) {
					System.out.println("���� ����� � ������ �-��� ���");
				}
				break;	
				
			case "4":
				System.out.println("������ �����");
				sc = new Scanner(System.in);
				month = sc.next().toUpperCase();
					checkInputMonthSeason(month);
				flag = isMonthPresent(arrMonth, month);	
				flagM=false;
					if(flag) {
						for(Month m : arrMonth) {
							if(m.name().equals(month)) {
								day = m.getDay();
							}							 
						}					
						for(Month m : arrMonth) {
							if(m.getDay() > day && !(m.name().equals(month))) {								
								System.out.println(m.name());
								flagM = true;
							}						
						}
					}					
				if(!flag) {
					System.out.println("������ ����� �� ����");
				}
				if(!flagM) {
					System.out.println("���� ����� � ������ �-��� ���");
				}
				break;
				
			case "5":
				System.out.println("������ �����");
				sc = new Scanner(System.in);
				month = sc.next().toUpperCase();
					checkInputMonthSeason(month);
				flag = isMonthPresent(arrMonth, month);
				if(flag) {
					Month monthS = Month.valueOf(month);
					ordinal = monthS.ordinal() + 3;				
						if(ordinal > 11) {
							ordinal -= 12;						
						}					
					System.out.println(arrMonth[ordinal].getSeason());					
				}	
				if(!flag) {
					System.out.println("������ ����� �� ����");
				}			
				break;
				
			case "6":
				System.out.println("������ �����");
				sc = new Scanner(System.in);
				month = sc.next().toUpperCase();
					checkInputMonthSeason(month);
				flag = isMonthPresent(arrMonth, month);
				if(flag) {
					Month monthS = Month.valueOf(month);
					ordinal = monthS.ordinal() - 3;				
						if(ordinal < 0) {
							ordinal += 12;						
						}
					System.out.println(arrMonth[ordinal].getSeason());
				}	
				if(!flag) {
					System.out.println("������ ����� �� ����");
				}								
				break;
				
			case "7":
				for(Month m : arrMonth) {
					if( m.getDay() % 2 == 0) {
						System.out.println(m);
					}	
				}
				break;
				
			case "8":
				for(Month m : arrMonth) {
					if( m.getDay() % 2 == 1) {
						System.out.println(m);
					}	
				}
				break;	
				
			case "9":
				System.out.println("������ �����");
				sc = new Scanner(System.in);
				month = sc.next().toUpperCase();
					checkInputMonthSeason(month);
				flag = isMonthPresent(arrMonth, month);				
				Month monthS = Month.valueOf(month);
				
					if( monthS.getDay() % 2 == 0) {
						System.out.println("̳���� " + month + " �� ����� ������� ���");
					}else {
						System.out.println("̳���� " + month + " �� ������� ������� ���");
					}				
				break;
				
			case "10":
				System.out.println("������ ���� ����");
				sc = new Scanner(System.in);				
				String seas = sc.next().toUpperCase();	
					checkInputMonthSeason(seas);
				ordinal = 0;
				flag = false;
				
				for(Month s : arrMonth) {
					if(s.getSeason().name().equals(seas)) {
						ordinal = s.getSeason().ordinal();
						flag = true;
					}
				}
				if(flag) {
					ordinal += 1;
					if(ordinal > 3) {
						ordinal -= 4;
					}
					for(Month s : arrMonth) {
					 if(ordinal == s.getSeason().ordinal()) {
						 System.out.println(s.getSeason().name());
						 break;
					 }
					}						
				}					
				if(!flag) {
					System.out.println("������ ������ �� ����");
				}				
				break;
				
			case "11":
				System.out.println("������ ���� ����");
				sc = new Scanner(System.in);				
				seas = sc.next().toUpperCase();	
					checkInputMonthSeason(seas);
				ordinal = 0;
				flag = false;
				
				for(Month s : arrMonth) {
					if(s.getSeason().name().equals(seas)) {
						ordinal = s.getSeason().ordinal();
						flag = true;
					}
				}
				if(flag) {
					ordinal -= 1;
					if(ordinal < 0) {
						ordinal += 4;
					}
					for(Month s : arrMonth) {
					 if(ordinal == s.getSeason().ordinal()) {
						 System.out.println(s.getSeason().name());
						 break;
					 }
					}						
				}					
				if(!flag) {
					System.out.println("������ ������ �� ����");
				}				
				break;
				
				
			}
		}
	}

	private static boolean isMonthPresent(Month[] arrMonth, String month) {
		boolean flag = false;
		for(Month m : arrMonth) {
			if(m.name().equals(month)) {
				System.out.println("����� ����� ����");
				flag = true;
			}
		}
		return flag;
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
		System.out.println("     �������� 10, ���� ���� ������� �������� ���� ����");
		System.out.println("     �������� 11, ���� ���� ������� ��������� ���� ����");
	}
	
	static void checkInputMonthSeason(String monthSeasons) {
		
		try {
			boolean noWrong = false;
			int msLength = monthSeasons.length();
			char[] wordArray = monthSeasons.toCharArray();
			
			for(int i = 0; i < msLength; i++) {
				if(!((int)wordArray[i] > 64 && (int)wordArray[i] < 91 &&
						(int)wordArray[i] > 96 && (int)wordArray[i] < 123)) {
					noWrong = true;
					break;
				}
			}			
			if(noWrong && !(msLength > 2 && msLength < 15)) {
				throw new WrongInputConsoleParametersException("������� ���. ������ �����, �� ����� " + monthSeasons);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch(WrongInputConsoleParametersException e) {
			e.printStackTrace();
		}
		
	}
}

