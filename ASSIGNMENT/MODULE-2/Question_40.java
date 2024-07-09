/*
	W.A.J.P to create the validate method that takes integer value as a parameter. 
	If the age is less than 18, then throw an Arithmetic Exception otherwise print a message welcome to vote.
	O/P- Enter your age: 16
	Exception in thread main java. Lang. Arithmetic Exception: not valid
*/

package assignment_module_2;

import java.util.Scanner;

public class Question_40 {
	
	static void Validate(int age) {
		
		if(age < 18)
			throw new ArithmeticException("Not eligible for vote.");
	}
	
	public static void main(String[] args) {
		 
		try 
		{
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter your age : ");
			int age = input.nextInt();
			
			Validate(age);
			System.out.println("Welcome to vote!");
			
			input.close();
			
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("Error: Not Eligible for vote.");
		}
	}

}