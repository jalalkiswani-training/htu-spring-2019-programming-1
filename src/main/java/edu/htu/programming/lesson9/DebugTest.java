package edu.htu.programming.lesson9;

public class DebugTest {
	public static void main(String[] args) {
		int i = 10;
		i = 50 + i;
		i *= 15;
		i=domsomthing(i);
		int s = (i + 2) * 30;

		System.out.println(s);
	}

	private static int domsomthing(int i) {
		i=i-10;
		i*=2;
		return i;
	}
}
