package edu.htu.programming.review3;

public class DebuggingTest {
	public static void main(String[] args) {
		int x=10;
		int y=50;
		y=y+60*x;
		x=x+10;		
		
		System.out.println(x+" , "+y);//50
	}
}
