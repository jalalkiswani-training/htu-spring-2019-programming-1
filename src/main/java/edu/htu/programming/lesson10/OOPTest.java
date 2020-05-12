package edu.htu.programming.lesson10;

public class OOPTest {
	public static void main(String[] args) {
		int i=10;
		//Student: data type
		//s: variable name (reference)
		//Student(): constructor , special method called with the 'new'operator
		Student s=new Student("12212121","Ata",100,90,80);
		s.name="Kamal";
//		s.id="1025658";
//		s.name="Ata";
//		s.course1=60;
//		s.course2=70;
//		s.course3=80;

		s.talk();
		
		System.out.println(s.calculateAverage());
		
		Student s2=new Student();
		s2.id="741259";
		s2.name="Essa";
		
		System.out.println(s.name);
		System.out.println(s2.name);
		
		Teacher t=new Teacher();
		t.id=10;
		t.name="Kamal";
		t.degree="IT";
		t.talk();
	}
}
