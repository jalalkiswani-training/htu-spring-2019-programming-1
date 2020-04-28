package edu.htu.programming.review2;

public class Conditionals1 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c=30;

		/*
		 * if (condition) { condition should result in a true or false the statement
		 * that will be exetied if the condition result is true } else { else is
		 * optional the satetemtn that will be executed if the condition is false }
		 */
		if (a > b) {
			System.out.println("Hi");
		} else if (b > 5) {
			System.out.println("Bye");
		} else {
			System.out.println("I dont know what to answer");
		}

		/*
		 * The operators that you could use for conditionals > < >= <= != == : equality
		 */
		if(a>b && b>3) {//if a>b and b>c
			System.out.println("Great");
		}
		
		if(a>b || b<10) {//a more than b OR b less than 10
			System.out.println("Non bad");
		}

	}
}
