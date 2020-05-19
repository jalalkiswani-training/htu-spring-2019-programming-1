package edu.htu.programming.review3;

import java.util.Random;

public class Debugging2 {
	public static void main(String[] args) {
		Random r=new Random();
		for (int i = 0; i < 100; i++) {
			int value=r.nextInt()%50;
			System.out.println(value);
		}
	}
}
