/*
	Write a program you have to make a summation of first and last Digit.
	(E.g. 1234 answer:5)
*/

package task2505;

import java.util.Scanner;

public class TaskJ {
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		Scanner Sum = new Scanner(System.in);
		
		System.out.println("Enter Any Number : ");
		int num = Sum.nextInt();
		
		int lastDigit = 0;
		lastDigit = (num%10);
		sum = (sum*10)+lastDigit;

		while (num > 0)
		{
			if (num > 9)
				num = num/10;
			else
			{
				lastDigit=num;
				sum=sum+lastDigit;
				num=num/10;
			}
		}
		
		System.out.println("Sum of First and Last Digit : "+ sum);
		
	}

}