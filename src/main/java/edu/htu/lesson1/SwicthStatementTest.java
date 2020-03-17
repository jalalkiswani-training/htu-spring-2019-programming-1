package edu.htu.lesson1;

import java.util.Scanner;

public class SwicthStatementTest {
	public static void main(String[] args) {
		System.out.println("1- Say Hello");
		System.out.println("2- Say Hi");
		System.out.println("3- Say Bye");
		System.out.println("===================================");
		System.out.println("Please enter your choice: ");
		// to read value from the user
		Scanner s = new Scanner(System.in);
		
		int ch = s.nextInt();
		
		//not clean code
		/*
		if (ch == 1) {
			System.out.println("Hello");
		} else if (ch == 2) {
			System.out.println("Hi");
		} else if (ch == 3) {
			System.out.println("Bye");
		}
		*/
		
		//using switch
		switch(ch) {
			case 1: System.out.println("Hello");break;
			case 2: System.out.println("Hi");break;
			case 3: System.out.println("Bye");break;
			default: System.out.println("Invalid Input");
		}
		
		//during the testing, I tested all the cases (test scenarios)
	}
}
