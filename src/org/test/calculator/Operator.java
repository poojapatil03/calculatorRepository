package org.test.calculator;

// This class will hold implementations for all operations
public class Operator implements IOperator {

	// function for add operation
	@Override
	public double add(double numOne, double numTwo) {
		return numOne + numTwo;
	}

	// function for subtract operation
	@Override
	public double subtract(double numOne, double numTwo) {
		return numOne - numTwo;
	}

	// function for multiply operation
	@Override
	public double multiply(double numOne, double numTwo) {
		return numOne * numTwo;
	}

	// function for divide operation
	@Override
	public double divide(double numOne, double numTwo) {
		return numOne / numTwo;
	}

}
