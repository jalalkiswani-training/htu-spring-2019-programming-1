package edu.htu.programming.lesson10;

//Child class ==> Subclass
public class Teacher extends Person{
	//instance  variables
	int id;
//	String name;
//	String age;
//	String address;
//	String mobile;
	String degree;
	String major;
	int basic;
	int deductions;
	int allownces;

	public int calculateEmployeeSalary(){
		return basic+allownces-deductions;
	}
}
