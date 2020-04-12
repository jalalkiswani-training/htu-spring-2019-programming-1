package edu.htu.lesson5;

import java.util.Scanner;

public class Perfromance2 {
	public static void main(String[] args) throws InterruptedException {
		int x=10;//1 operation
		int y=20;//1 operations
		int sum=x+y;//1 operation
		
		System.out.println(sum);//operation
		Scanner s=new Scanner(System.in);
		
		//total steps == 34 ----> 1 step
		// Time complexity -->  Big O notation => order of n   => O(n+4) = O(n) = ----->
		// Assumption: n is very large value
		int n=s.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println(i);
			Thread.sleep(10);
		}
		
	}

}
