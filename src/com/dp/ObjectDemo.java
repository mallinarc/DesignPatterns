package com.dp;

public class ObjectDemo {
	public static void main(String[] args) {
		System.out.println();
		Calc calcRefObj = new Calc();
		calcRefObj.addNum1NNum2(2, 3);
	}
}

class Calc {
	public int num1;
	public int num2;
	public int num3;

	public void addNum1NNum2(final int num1, final int num2) {
		this.num1 = num1;
		this.num2 = num2;
		System.out.println(" num1 + num2: " + (num1 + num2));
	}
}