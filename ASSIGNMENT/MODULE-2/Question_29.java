/*
	Create an abstract class 'Parent' with a method 'message'.
	It has two subclasses each having a method with the same name 'message' that prints "This is first subclass" 
	and "This is second subclass" respectively. 
	Call the methods 'message' by creating an object for each subclass.
*/

package assignment_module_2;

abstract class Parent1
{
	abstract void message();	
}

class firstSubclass extends Parent1
{
	void message()
	{
		System.out.println("This is first subclass.");
	}
}

class secondSubclass extends Parent1
{
	void message()
	{
		System.out.println("This is second subclass.");
	}
}

public class Question_29 {
	
	public static void main(String[] args) {
		
		firstSubclass first =  new firstSubclass();
		first.message();
		
		secondSubclass second = new secondSubclass();
		second.message();
		
	}

}
