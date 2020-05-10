package edu.htu.programming.lesson9;

/**
 * Naming convension and coding standards
 * 
 * @author Jalal Kiswani
 *
 *         Naming convension in Java: 
 *         1-All naming should follow full-names
 *         style without abbreviating 
 *         2- Classes are camel-case based (capitlize
 *         first letter from every word) 
 *         3- Variable names are nouns camel case
 *         with small for the fist word 
 *         4- method names are verbs camel case
 *         with small first
 */
public class EmployeeCalculator {
	public static void main(String[] args) {
		int finalSalary = calculateSalary();
		System.out.println("Result = " + finalSalary);
	}

	private static int calculateSalary() {
		int b=10;
		int s2=20;
		int i2=50;
		double d=20;
		
		int basicSalary = 1000;
		int deductions = 20;
		int allownces = 50;

		int finalSalary = basicSalary + deductions - allownces;
		return finalSalary;
	}
}
