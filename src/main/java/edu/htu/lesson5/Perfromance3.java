package edu.htu.lesson5;

import java.util.Scanner;

public class Perfromance3 {
	public static void main(String[] args) throws InterruptedException {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for (int i = 0; i < n; i++) {
			int s2=10;
			int y=s2+20;
		}
		//O(1 + 1 + (n * 2)) == O(2n) == O(n)
		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < args.length; j++) {
				System.out.println("Hello");
			}
		}
		//O(n*n)
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.println("Op");
			}
		}
		// O(n log n)
		
	}

}
