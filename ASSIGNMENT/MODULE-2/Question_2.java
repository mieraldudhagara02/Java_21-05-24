/*
	Write a Java program that takes the user to provide a single character from the alphabet.
 	Print Vowel or Consonant, depending on the user input. 
 	If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
*/

package assignment_module_2;

import java.util.Scanner;

public class Question_2 {
	
	public static void main(String[] args) {
		
		Scanner vowelConsonant = new Scanner(System.in);
		
		System.out.println("Enter an Alphabet : ");
		String input = vowelConsonant.next();
		
		boolean upperCase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
		boolean lowerCase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
		boolean vowels = input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o") || input.equals("u") || input.equals("A") 
						 || input.equals("E") || input.equals("I") || input.equals("O") || input.equals("U");
		
		if (input.length() > 1)
        {
            System.out.println("Error. Not a single character.");
        }
        else if (!(upperCase || lowerCase))
        {
            System.out.println("Error. Not a letter. Enter uppercase or lowercase letter.");
        }
        else if (vowels)
        {
            System.out.println("Input letter is Vowel");
        }
        else
        {
            System.out.println("Input letter is Consonant");
        }
		
		vowelConsonant.close();
		
	}
	
} 