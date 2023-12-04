package com.dp.opencloseprinciple;

public class Addition implements CalculatorOperation {

	private double right;
	private double left;
	private double result;

	public Addition(double left, double right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public void perform() {
		result = left + right;
		System.out.println(String.format("Adding %f to %f the result: %f", left, right, result));

	}

}
