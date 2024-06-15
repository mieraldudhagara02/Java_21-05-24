/*
	Write a Java program that takes the user to provide a single character from the alphabet.
 	Print Vowel or Consonant, depending on the user input. 
 	If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
*/

package assignment_module_2;

import java.util.Scanner;

public class Question_2 {
	
	public static void main(String[] args) {
		
		Scanner vc = new Scanner(System.in);
		
		System.out.print("Enter a single character: ");
		String input = vc.next();
		
		if(input.length() != 1)
		{
			System.out.println("Error : Please Enter a Single Letter");
		}
		
		if(!Character.isLetter(input.charAt(0)))
		{
			System.out.println("Error : Integer Data Type is Not Allowed");
		}
		
		vc.close();
		
	}
	
} 