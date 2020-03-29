package edu.htu.lesson3;

public class DataTypes5 {
	public static void main(String[] args) {
		//1- Byte
		byte b=10;
//		int i=20;
		//4- Bytes
		int i=b;//implicit casting: safe casting
		System.out.println(b);
		System.out.println(i);
		
		
		System.out.println("============");
		
		//int : 4 bytes
		int i1=100;
		
		//byte : 1 byte
		byte b1=(byte)i1;//explicit casting: risky casting
		
		System.out.println(b1);
		
		System.out.println("===========");
		int i2=200; //00000000 00000000 00000000  11001000  
		byte b2=(byte) i2;
		
		System.out.println(b2);
	}
}
