package edu.htu.programming.lesson10;

public class ArrayTest {
	public static void main(String[] args) {		
		int n=5;
		int arr[][]= new int[n][n];
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i==j) {
					sum+=arr[i][j];
				}
			}
		}
		//O(n^2)  , if n=1M ===> 
		sum=0;
		for (int i = 0; i < n; i++) {
			sum+=arr[i][i];
		}
		System.out.println(sum);
		//O(n) if n= 1M ==> 1M
	}

}
