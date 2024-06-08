/*
	Write a program make a summation of given number
	(E.g. 1523 answer:11)
*/

package task2505;

import java.util.Scanner;

public class TaskI {
	
	public static void main(String[] args) {
		
		Scanner sum = new Scanner(System.in);
		
		System.out.println("Enter any number : ");
		int num = sum.nextInt();
		
		int lastDigit = 0;
		
		while(num>0)
		{
			lastDigit = lastDigit + num%10;
			num=num/10;
		}
		
		System.out.println(lastDigit);
		
	}

}