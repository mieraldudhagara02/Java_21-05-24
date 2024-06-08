/*
	Write a program to find out the max from given number
	(E.g. No:1562 Max number is 6 )
*/

package task2505;

import java.util.Scanner;

public class TaskH {
	
	public static void main(String[] args) {
		
		int tempNum;
		int maxNum = 0;
		
		Scanner maximum = new Scanner(System.in);
		
		System.out.println("Enter Any Number : ");
		int num = maximum.nextInt();
		
		
		while(num > 0)
		{
			tempNum = num%10;
			
			if(tempNum > maxNum)
			{
				maxNum = tempNum;
			}
			
			num = num / 10;
			
		}
		
		System.out.println("Max Number is : "+ maxNum);
	}

}