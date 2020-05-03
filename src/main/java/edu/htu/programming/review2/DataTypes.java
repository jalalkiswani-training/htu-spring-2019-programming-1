package edu.htu.programming.review2;

import java.util.Scanner;

public class DataTypes {
	public static void main(String[] args) {
		//primitives
		//{DataType}{variableName} [=initial value]
		byte b=10;
		short s=20;
		char c='a';
		int i=100;
		float f=10.6f;
		
		long l=1000;
		double d=22.3098;
		boolean b1=true;//false
		
		/*
		 * Recommnaded data types
		 * decimal numbers: always use integer unless needed
		 * for real numbers: always use double 
		 */
		
		
		/*classes
		To use the classes, we should make a constrcution through the "new" keyword
		Scanner: ClassName
		s: variable name/reference
		new Scanner(System.in): construction through calling the Scanner constructor that accepts InputStream paramter 
		*/
		Scanner scanner=new Scanner(System.in);
		
	}
}
