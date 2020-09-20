package org.test.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyCalculator {
	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			double numOne = 0, numTwo = 0, result = 0;
			try {
				numOne = scanner.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Re-starting calculator.");
				main(args);
			}
			char operatorByUser;
			Operator opr = new Operator();
			while (true) {
				try {
					numTwo = scanner.nextDouble();
				} catch (InputMismatchException e) {
					System.out.println("Invalid input. Re-starting calculator.");
					main(args);
				}				
				operatorByUser = scanner.next().charAt(0);
				switch (operatorByUser) {
				case '+':
					result = opr.add(numOne, numTwo);
					break;
				case '-':
					result = opr.subtract(numOne, numTwo);
					break;
				case '*':
					result = opr.multiply(numOne, numTwo);
					break;
				case '/':
					result = opr.divide(numOne, numTwo);
					break;
				case 'q':
					System.out.println("Exiting..");
					break;
				default:
					System.out.println("Invalid input. Please try again.");
					break;
				}
				numOne = result;
				System.out.println("result: " + result);
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
 
}
