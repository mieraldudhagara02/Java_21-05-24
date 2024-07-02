package oop;

class Student
{
	String name;
	int id;
}

public class D_MainOutsideClass {
	
	public static void main(String[] args) {
		
		Student student1 = new Student();
		
		student1.name = "miral";
		
		System.out.println(student1.name);
		
	}

}