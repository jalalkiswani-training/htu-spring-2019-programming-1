package edu.htu.programming.lesson1;

public class IfStatementTest {
	public static void main(String[] args) {
		int value=10;
		int value2=20;
		
		if(value>value2) // > < == != >= <=
			System.out.println("Ok");
		else 
			System.out.println("Not Ok");
		
		//the above is not clean code
		if(value>value2) {
			System.out.println("Ok");
		}
		else { 
			System.out.println("Not Ok");
		}
		
	}
}
