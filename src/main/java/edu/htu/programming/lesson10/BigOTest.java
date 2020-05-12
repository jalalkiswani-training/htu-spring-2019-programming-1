package edu.htu.programming.lesson10;

import java.util.Scanner;

public class BigOTest {
	public static void main(String[] args) {
//		long before = System.currentTimeMillis();
		int y = 20;// 1
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();// 1
		for (int i = 0; i < n; i++) { // n
			for (int j = 0; j < n; j++) {
				for (int j2 = 0; j2 < n; j2++) {
					y += 10;
				}
			}
		}

//		long after = System.currentTimeMillis();
//		long duration=after-before;

		// # of operations= if n = 1,000,000 ==> # of operations = 1M , n=2M , # 2M ,
		// Number of operation of this program depends on the value of n == O(n)
		// What is the time compleixity of this applicatyion? O(n^2)

	}
}
