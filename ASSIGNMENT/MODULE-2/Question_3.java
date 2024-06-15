/*
	Write a Java program that takes a year from user and print whether that year is a leap year or not.
*/

package assignment_module_2;

import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
		
		Scanner leapYear = new Scanner(System.in);
		
		System.out.println("Enter a Year : ");
		int year = leapYear.nextInt();
		
		if(year%4==0)
		{
			System.out.println(year+" is a Leap Year.");
		}
		else
		{
			System.out.println(year+" is not a Leap Year.");
		}
		
		leapYear.close();
		
	}
	
}