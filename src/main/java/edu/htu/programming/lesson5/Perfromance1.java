package edu.htu.programming.lesson5;

public class Perfromance1 {
	public static void main(String[] args) throws InterruptedException {
		long start= System.currentTimeMillis();//current time on computer in mills
		process();
		long end = System.currentTimeMillis();
		long duration=end-start;
		double durationInSecons=(double)duration/1000;
		System.out.println(duration+" in millis");
		System.out.println(durationInSecons+" in seconds");
	}

	public static void process() throws InterruptedException {
		//simulation: imitate an actual situation with a logical 
		System.out.println("Operation 1");//20 second
		Thread.sleep(3_000);//in milliseconds  1 s = 1000 ms
		
		System.out.println("Operation 2");//30 second
		Thread.sleep(5_000);
		
		System.out.println("Operation 3");//10 second
		Thread.sleep(2_000);
	}
}
