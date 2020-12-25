package com.lgs.lab.interface2;

public class MyCalculator implements com.lgs.lab.interface1.Numerable{

	@Override
	public double plus(double a, double b) {
		return a + b;
	}

	@Override
	public double minus(double a, double b) {
		return a - b;
	}

	@Override
	public double multiply(double a, double b) {
		return a * b;
	}

	@Override
	public double devide(double a, double b) {
		return a / b;
	}

	
}
