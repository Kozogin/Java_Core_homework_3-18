package ua.lviv.lgs.task1;

public class Application {
	
	static void calc_print(Salary s) {
		double money;
		money = s.salary();
		s.print(money);
	}
	
	public static void main(String[] args) {
		
		Salary employee_H0 = new Hourly();
		calc_print(employee_H0);
		
		Salary employee_H = new Hourly(11);
		calc_print(employee_H);
		
		Salary employee_M = new Monthly(22);
		calc_print(employee_M);
	}
}
