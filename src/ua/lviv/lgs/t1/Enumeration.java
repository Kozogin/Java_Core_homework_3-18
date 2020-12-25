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
					throw new WrongInputConsoleParametersException("Ќев≥рний вв≥д. ¬вед≥ть число в≥д 0 до 11, ви ввели - " + parametr);
				}				
			} catch(NumberFormatException e) {
				e.printStackTrace();
			} catch(WrongInputConsoleParametersException e) {
				e.printStackTrace();
			}
						
			switch (parametr) {
			case "0":
				System.out.println("¬вед≥ть м≥с€ць");
				sc = new Scanner(System.in);
				month = sc.next().toUpperCase();
					checkInputMonthSeason(month);
				flag = isMonthPresent(arrMonth, month);
				if(!flag) {
					System.out.println("“акого м≥с€ц€ не ≥снуЇ");
				}
				break;
				
			case "1":
				System.out.println("¬вед≥ть м≥с€ць");
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
					System.out.println("“акого м≥с€ц€ не ≥снуЇ");
				}			
				break;
				
				
			case "2":
				System.out.println("¬вед≥ть м≥с€ць");
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
					System.out.println("“акого м≥с€ц€ не ≥снуЇ");
				}
				if(!flagM) {
					System.out.println("ЌемаЇ м≥с€ц€ з такою ж к-стю дн≥в");
				}
				break;	
				
			case "3":
				System.out.println("¬вед≥ть м≥с€ць");
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
					System.out.println("“акого м≥с€ц€ не ≥снуЇ");
				}
				if(!flagM) {
					System.out.println("ЌемаЇ м≥с€ц€ з меншою к-стю дн≥в");
				}
				break;	
				
			case "4":
				System.out.println("¬вед≥ть м≥с€ць");
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
					System.out.println("“акого м≥с€ц€ не ≥снуЇ");
				}
				if(!flagM) {
					System.out.println("ЌемаЇ м≥с€ц€ з б≥льшою к-стю дн≥в");
				}
				break;
				
			case "5":
				System.out.println("¬вед≥ть м≥с€ць");
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
					System.out.println("“акого м≥с€ц€ не ≥снуЇ");
				}			
				break;
				
			case "6":
				System.out.println("¬вед≥ть м≥с€ць");
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
					System.out.println("“акого м≥с€ц€ не ≥снуЇ");
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
				System.out.println("¬вед≥ть м≥с€ць");
				sc = new Scanner(System.in);
				month = sc.next().toUpperCase();
					checkInputMonthSeason(month);
				flag = isMonthPresent(arrMonth, month);				
				Month monthS = Month.valueOf(month);
				
					if( monthS.getDay() % 2 == 0) {
						System.out.println("ћ≥с€ць " + month + " маЇ парну к≥льк≥сть дн≥в");
					}else {
						System.out.println("ћ≥с€ць " + month + " маЇ непарну к≥льк≥сть дн≥в");
					}				
				break;
				
			case "10":
				System.out.println("¬вед≥ть пору року");
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
					System.out.println("“акого сезону не ≥снуЇ");
				}				
				break;
				
			case "11":
				System.out.println("¬вед≥ть пору року");
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
					System.out.println("“акого сезону не ≥снуЇ");
				}				
				break;
				
				
			}
		}
	}

	private static boolean isMonthPresent(Month[] arrMonth, String month) {
		boolean flag = false;
		for(Month m : arrMonth) {
			if(m.name().equals(month)) {
				System.out.println("“акий м≥с€ць ≥снуЇ");
				flag = true;
			}
		}
		return flag;
	}
	
	static void menu() {
		System.out.println("     Ќатисн≥ть 0, щоб пров≥рити, чи Ї такий м≥с€ць");
		System.out.println("     Ќатисн≥ть 1, вивести м≥с€ц≥ ц≥Їњ ж пори");
		System.out.println("     Ќатисн≥ть 2, вивести вс≥ м≥с€ц≥ з такою к≥льк≥стю дн≥в");
		System.out.println("     Ќатисн≥ть 3, вивести вс≥ м≥с€ц≥ з меншою к≥льк≥стю дн≥в");
		System.out.println("     Ќатисн≥ть 4, вивести вс≥ м≥с€ц≥ з б≥льшою к≥льк≥стю дн≥в");
		System.out.println("     Ќатисн≥ть 5, вивести наступну пору року");
		System.out.println("     Ќатисн≥ть 6, вивести попередню пору року");
		System.out.println("     Ќатисн≥ть 7, вивести м≥с€ц≥ з парною к≥льк≥стю дн≥в");
		System.out.println("     Ќатисн≥ть 8, вивести м≥с€ц≥ з непарною к≥льк≥стю дн≥в");
		System.out.println("     Ќатисн≥ть 9, вивести, чи Ї м≥с€ць з парною к≥льк≥стю дн≥в");
		System.out.println("     Ќатисн≥ть 10, ѕќ–ј –ќ ” вивести наступну пору року");
		System.out.println("     Ќатисн≥ть 11, ѕќ–ј –ќ ” вивести попередню пору року");
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
				throw new WrongInputConsoleParametersException("Ќев≥рний вв≥д. ¬вед≥ть слово, ви ввели " + monthSeasons);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch(WrongInputConsoleParametersException e) {
			e.printStackTrace();
		}
		
	}
}

