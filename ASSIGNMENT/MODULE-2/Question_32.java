/*
	Write a program to print the factorial of a number by defining a method named 'Factorial'. 
	Factorial of any number n is represented by n! And is equal to 1*2*3*.
 	*(n-1) *n.
 	
 	E.g.-
	4! = 4*3*2*1 = 24
	3! = 3*2*1 = 6
	2! = 2*1 = 2
	Also, 1! = 1
	0! = 0
*/

package assignment_module_2;

import java.util.Scanner;

public class Question_32 {
	
	static int factorial(int number)
	{
		if(number == 0|| number == 1)
    	{
    		return 1;
    	}
    	else
    	{
    		return number * factorial(number - 1);
    	}
	}
	
	public static void main(String[] args) {
		
		Scanner fact = new Scanner(System.in);
		
		System.out.println("Enter a number to calculate factorial : ");
		int num = fact.nextInt();
		
		if(num<0)
		{
			System.out.println("Factorial is not defined for the negative numbers.");
		}
		else
		{
			System.out.println("Factorial of " + num + " is " + factorial(num));
		}
		
		fact.close();
		
	}

}