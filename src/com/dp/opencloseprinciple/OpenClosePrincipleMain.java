package com.dp.opencloseprinciple;

public class OpenClosePrincipleMain {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.calculate(new Addition(1.0, 2.0));
		calc.calculate(new Division(4, 2));
	}

}
