/*
	We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A 
	and in four subjects (each out of 100) by student B. 
	Create an abstract class 'Marks' with an abstract method 'getPercentage'. 
	It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students. 
	The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. 
	Create an object for each of the two classes and print the percentage of marks for both the students.
*/

package assignment_module_2;

abstract class Marks
{
	abstract int getPercentage();
}

class A extends Marks
{
	int sub1;
	int sub2;
	int sub3;
	
	A (int sub1, int sub2, int sub3)
	{
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	
	int getPercentage()
	{
		return (sub1 + sub2 + sub3) / 3;
	}
}

class B extends Marks
{	
	int sub1;
	int sub2;
	int sub3;
	int sub4; 
	
	B (int sub1, int sub2, int sub3, int sub4)
	{
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.sub4 = sub4;
	}
	
	int getPercentage()
	{
		return (sub1 + sub2 + sub3 + sub4) / 4;
	}
}

public class Question_31 {
	
	public static void main(String[] args) {
		
		A student1 = new A(80, 75, 60);
		System.out.println("Percentange of Student A : " + student1.getPercentage() + "%");
		
		B student2 = new B(80, 75, 60, 85);
		System.out.println("Percentange of Student B : " + student2.getPercentage() + "%");
		
	}

}