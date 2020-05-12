package edu.htu.programming.lesson10;

public class Student extends Person {
	//instance variables
	String id;
//	String name;
//	int age;
//	String address;
//	String mobile;
	int course1;
	int course2;
	int course3;
	
	//constructor overloading...
	public Student() {
	}
	
	//if the local variable has the same name of the instance variable
	//this case is called "shadowing"
	public Student(String id,String name, int course1, int course2, int course3) {
		this.id=id;
		this.name=name;
		this.course1 = course1;
		this.course2 = course2;
		this.course3 = course3;		
	}
	
	
	
	public int calculateAverage() {
		int sum=course1+course2+course3;
		return sum/3;
	}
}
