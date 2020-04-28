package edu.htu.programming.review2;

import java.util.Scanner;

public class Conditionals2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter your choice");
		int choice=scanner.nextInt();
		
		/*
		 * switch(integer number)
		 */
		switch (choice) {
		case 1://handle every case separatly 
			System.out.println("Hi");
			break;
		case 2:
			System.out.println("Bye");
			break;
		case 3:
		case 5: 
		case 10:
			System.out.println("Good");
			break;
		default:
			System.out.println("Your input is far away");
			break;
		}
		
	}
}
