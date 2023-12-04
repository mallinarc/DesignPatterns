package com.dp.opencloseprinciple;

import java.security.InvalidParameterException;

public class Calculator {
	public void calculate(CalculatorOperation calcOp) {
		if (calcOp == null) { throw new InvalidParameterException(); }

		calcOp.perform();
	}

}
