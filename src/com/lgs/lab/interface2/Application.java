package com.lgs.lab.interface2;

public class Application {
	public static void main(String[] args) {
		
		double calc;
		
		MyCalculator digit = new MyCalculator();
		calc = digit.plus(5.2, 2);
			System.out.println(calc);
		calc = digit.minus(13.5, 7.2);
			System.out.println(calc);
		calc = digit.multiply(4, 2.5);
			System.out.println(calc);
		calc = digit.devide(52, 21.4);
			System.out.println(calc);
		
	}
}
