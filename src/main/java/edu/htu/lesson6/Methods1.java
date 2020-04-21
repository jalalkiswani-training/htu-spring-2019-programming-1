package edu.htu.lesson6;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 * Duplicate is bad sign in cad "Bad Smell in Code":
 * 1- Bug: I shall fix the big in many places
 * 2- New feature: shall add the new feature in many places
 */
public class Methods1 {
	public static void main(String[] args) {
//		Scanner scanners = new Scanner(System.in);
//		System.out.print("Please enter number 1 : ");
//		int n1 = scanners.nextInt();
//
//		int n1=readNumber("Please enter number 1: ");
//		int n1=readNumber2(1);
		int n1=readNumber(1);
		
//		System.out.print("Please enter number 2 : ");
//		int n2 = scanners.nextInt();
//		int n2=readNumber("Please enter number 2: ");
		//int n2=readNumber2(2);
		int n2=readNumber(2);
		
//		System.out.print("Please enter number 3 : ");
//		int n3 = scanners.nextInt();
//		int n3=readNumber("Please enter number 3: ");
//		int n3=readNumber2(3);
		int n3=readNumber(3);
		
		int sum = n1 + n2 + n3;
		System.out.println("Sum = "+sum);
	}
	
	/*
	 * Function is a new command:
	 * public: it could be accessed from this and any other class (private: it could be called only from within class)
	 * static: it is called by the class name directly (calling from outside the class : Methods1.readNumber("XYZ"), readNumber());
	 * 
	 * int: this function should return the value of int
	 * readNumber: function name
	 * String msg: paramter 
	 */
	public static int readNumber(String msg) {//method signiture
		//Scanner scanners = new Scanner(System.in);
//		System.out.print(msg);
		//int value = scanners.nextInt();
		String result=JOptionPane.showInputDialog(msg);
		int value=Integer.parseInt(result);
		return value;
	}
	
	/*
	 * Multiple function with the same name but differ in paramters : method OVERLOADING
	 */
	public static int readNumber(int index) {//method signature
		//Scanner scanners = new Scanner(System.in);
//		System.out.print(msg);
		//int value = scanners.nextInt();
//		String result=JOptionPane.showInputDialog("Please enter Number ("+index+") :");
//		int value=Integer.parseInt(result);
//		return value;
//		int value=readNumber("Please enter Number ("+index+") :");
//		return value;
		return readNumber("Please enter Number ("+index+") :");
	}
	
	
}
