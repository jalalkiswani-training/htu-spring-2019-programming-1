package edu.htu.lesson4;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class LinearSearch {
	public static void main(String[] args) {
		for (int i = 1_000_000; i < 10_000_000; i+=1_000_0000) {
			System.out.println("===========================================");
			System.out.println("Working on N= "+i);
//			int n = 700000000;
			int arr[] = new int[i];// construction of array

			long start = System.currentTimeMillis();
			fillArrayWithRandomValues(arr);
			long end = System.currentTimeMillis();

			System.out.println("Random numbers generation took:" + (end - start));
			printArrayValues(arr);
			findIndex(arr, 5);
			findIndex(arr, 50);
			findIndex(arr, 200);
		}
	}

	/////////////////////////////////////////////////////////////////
	private static void printArrayValues(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
//			System.out.println("Array value at index "+i+" = "+arr[i]);
		}
	}

	/////////////////////////////////////////////////////////////////
	private static void fillArrayWithRandomValues(int[] arr) {
		// Build array using random numbers generator
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100) + 1;
		}
	}

	///////////////////////////////////////////////////////////////////////
	// function name
	// paramaters
	// return value
	public static long findIndex(int arr[], int value) {
		long start = System.currentTimeMillis();
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
//				System.out.println("Index of value "+value+" found at location : "+i);
				index = i;
				break;
			}
		}
//		if(index==-1) {
////			System.out.println("Value "+value+" not found");
//		}
		long end = System.currentTimeMillis();
//		long duration = Duration.between(start, end).getSeconds();
		long duration = end - start;
		System.out.println("Value " + value + " Index " + index + " Duration : " + duration);
		return index;
	}
}
