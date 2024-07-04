/*
	Create a class with a method that prints "This is a parent class" and its subclass with another method that prints "This is child class". 
	Now, create an object for each of the class and call
	1 - method of parent class by object of parent class 
	2 - method of child class by object of child class 
	3 - method of parent class by object of child class
*/

package assignment_module_2;

class parent
{
	void Parent()
	{
		System.out.println("This is a parent class.");
	}
}

class child extends parent
{
	void Child()
	{
		System.out.println("This is child class.");
	}
}

public class Question_24 {
	
	public static void main(String[] args) {
		
		parent p = new parent();
		child c = new child();
		
		p.Parent();
		c.Child();
		c.Parent();
		
	}

}