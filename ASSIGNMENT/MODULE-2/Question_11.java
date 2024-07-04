/*
	Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn. 
	Input number: 5
    5 + 55 + 555
*/

package assignment_module_2;

import java.util.Scanner;

public class Question_11 {
	
	/*private static int concatenateDigits(int base, int count) 
	{
		
		int result = 0;
		int multiplier = 1;
		
		for(int i= 0; i<count; i++)
		{
			result += multiplier * base;
			multiplier *= 10;
		}
		
		return result;
		
	}*/
	
	public static void main(String[] args) {
		
		Scanner integer = new Scanner(System.in);
		
		System.out.println("Enter a Digit : ");
		int num = integer.nextInt();
		
		System.out.printf("%d + %d%d + %d%d%d \n" + num, num, num, num, num, num);
		
		integer.close();
		
		/*Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter any integer value:");
		int n = sc.nextInt();
		 
		sc.close();
		 
		int result = n + concatenateDigits(n,2) + concatenateDigits(n,3);
		System.out.println("Result: " + result);*/
	}

}