package com.dp.opencloseprinciple;

public class Division implements CalculatorOperation {

	private double left;
	private double right;
	private double result;

	public Division(double left, double right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public void perform() {
		if (right != 0) {
			result = left / right;
			System.out.printf("Dividing %f by %f the result: %f", left, right, result);
		}
	}

}
