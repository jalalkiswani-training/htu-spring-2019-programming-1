package edu.htu.lesson3;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class DataTypes3 {
	public static void main(String[] args) {
		byte b=10;
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println("============================");
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println("============================");
		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);
		System.out.println("============================");
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println("============================");
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println("============================");
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println("============================");
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println("============================");
		
		//How to format number
		DecimalFormat format=new DecimalFormat("###,###,###,###");
		String number=format.format(Long.MAX_VALUE);
		System.out.println(number);
		
	}
}

