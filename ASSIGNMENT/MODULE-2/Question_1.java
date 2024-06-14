/*
	Write a Java program to Take three numbers from the user and print the greatest number.
*/

package assignment_module_2;

import java.util.Scanner;

public class Question_1 {
	
	public static void main(String[] args) {
		
		Scanner max = new Scanner(System.in);
		
		System.out.println("\nEnter Three Numbers for getting Greatest Numbers in between..\n");
		
		System.out.println("Enter First Number : ");
		int numOne = max.nextInt();
		
		System.out.println("Enter Second Number : ");
		int numTwo = max.nextInt();
		
		System.out.println("Enter Third Number : ");
		int numThree = max.nextInt();
		
		if(numOne > numTwo)
		{
			if(numOne > numThree)
			{
				System.out.println("\nNumber One is Greater : "+numOne);
			}
		}
		
		if(numTwo > numOne)
		{
			if(numTwo > numThree)
			{
				System.out.println("\nNumber Two is Greater : "+numTwo);
			}
		}
		
		if(numThree > numOne)
		{
			if(numThree > numTwo)
			{
				System.out.println("\nNumber Three is Greater : "+numThree);
			}
		}

		max.close();
		
	}

}