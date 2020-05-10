package edu.htu.programming.lesson8;

import javax.swing.JTextField;

public class Test {
	public static void main(String[] args) {
		//Person: Datatype/class
		//p: reference (any variable of type class)
		//new: keyword for constructing
		//Person(): constructor (is a special method with the same
		//class name, but has no return value)
		//new Person(): this operation is called construction
		Person p1=new Person("Ata",20);
//		p1.name="Ata";
//		p1.age=20;
		p1.talk();//Hi my name is Ata, and my age is : 20
		
		Person p2=new Person();
		p2.name="Jamal";
		p2.age=15;
		p2.talk();//Hi my name is Jamal, and my age is : 15
		
		p1.talk();//Hi my name is Jamal, and my age is : 15 
		//because in object oriented each reference will have different values
		//and they dont affect each other
		
		Car c1=new Car();
		c1.brand="BMW";
		c1.year=2014;
		c1.move();
		c1.stop();
	}
}
