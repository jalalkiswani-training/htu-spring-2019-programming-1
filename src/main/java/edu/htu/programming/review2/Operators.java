package edu.htu.programming.review2;

public class Operators {
	public static void main(String[] args) {
		int n1=10;
		int n2=20;
		
		int s=n1+n2;//sum
		s=n1-n2;//sub
		s=n1*n2;//mult
		s=n1/n2;//div
		s=n1%n2;//modulois: remaining of division
		n1++;//post increment 
		++n1;//pre increment: Note: if the pre increment and post increment are alone in the same line, they will have the same effect
		
		n1--;//post decr
		--n1;//pre dec
		
		s=(n1+n2)*(n1-n2)*n1;//Multiplication and division takes priority over summation or subt, otherwise it will be left to write
		//to force priortities, you can use parenthesis 
	}
}
