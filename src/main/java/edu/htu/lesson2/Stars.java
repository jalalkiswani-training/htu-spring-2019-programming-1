package edu.htu.lesson2;

import java.util.Scanner;

//User Experience 
public class Stars {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Please enter the number of stars: ");
		int stars = s.nextInt();

		System.out.println("Line: ");
		/*
		 * Single line of stars
		 */
		for (int i = 0; i < stars; i++) {
			System.out.print("*");
		}

		System.out.println("\n\nRectanagle:");

		/*
		 * Rectangle of stars
		 */
		for (int i = 0; i < stars; i++) {
			for (int j = 0; j < stars; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		/*
		 * Triangle
		 */
		System.out.println("\n Triangle: ");
		for (int i = 0; i < stars; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
