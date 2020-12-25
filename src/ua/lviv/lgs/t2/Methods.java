package ua.lviv.lgs.t2;

public class Methods {
	
	static double add(double a, double b) {
		noWrong(a,b);
		return a + b;
	}
	
	static double subtract(double a, double b) {
		noWrong(a,b);
		return a - b;
	}
	
	static double multiply(double a, double b) {
		noWrong(a,b);
		return a * b;
	}
	
	static double divide(double a, double b) {
		noWrong(a,b);
		return a / b;
	}
	
	static void noWrong(double a, double b) {
		try {
			if(a < 0 && b < 0) {
				throw new IllegalArgumentException("a<0 and b<0");
			}
			if((a == 0 && b != 0) || (a != 0 && b == 0)){
				throw new ArithmeticException("a=0 and b!=0 or a!=0 and b=0");
			}			
			if(a == 0 && b == 0) {
				throw new IllegalArgumentException("a=0 and b=0");
			}
			if(a > 0 && b > 0) {
				throw new MyException("a>0 and b>0");
			}
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (MyException e) {
			e.printStackTrace();
		}
	}

}
