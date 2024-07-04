/*
	Write a Java program to count the letters, spaces, numbers and other characters of an input string.
*/

package assignment_module_2;

import java.util.Scanner;

public class Question_9 {
	
	public static void main(String[] args) {
		
		Scanner count = new Scanner(System.in);
		
		String test;
		System.out.println("Enter String : ");
		test = count.nextLine();
		
		char ch[] = test.toCharArray();
		int letter = 0, space = 0, number = 0, other = 0;
		
		for(int i=0; i<test.length(); i++)
		{
			if(Character.isLetter(ch[i]))
			{
				letter++;
			}
			else if(Character.isSpaceChar(ch[i]))
			{
				space++;
			}
			else if(Character.isDigit(ch[i]))
			{
				number++;
			}
			else
			{
				other++;
			}
		}
		
		System.out.println("letter : " + letter);
		System.out.println("space : " + space);
		System.out.println("number" + number);
		System.out.println("other" + other);
		
		count.close();
		
	}

}