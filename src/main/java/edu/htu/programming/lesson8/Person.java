package edu.htu.programming.lesson8;

public class Person {
	//instance variables: they are called "Attributes" in the object oriented 
	String name;
	int age;
	
	//default constructor: if I have no constructor at all
	//the compiler will write one for me 
	public Person() {		
	}
	
	//having more than one constructor is okay, but 
	//they have to have be different in the parameters
	//this is called: Constructor Overloading
	public Person(String name,int age) {
		//the "name" and "a" parameters are local variables
		//the case of having local variable with the same name
		//of instance variable is called "Shadowing"
		this.name=name;
		this.age=age;
	}
	
	//methods : they are called "Actions" in the object oriented
	public void talk() {
		System.out.println("Hi my name is "+name+", and my age is : "+age);
	}
}
