/*
	 Write a program to print the number in reverse order.
	 input = 12345
	 output = 54321
*/

package task2505;

import java.util.Scanner;

public class TaskG {
	
	public static void main(String[] args) {
		
		int lastNum = 0;
		int reverseNum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Any Number : ");
		int num = sc.nextInt();
		
		while(num>=1)
		{
			if(num<10)
			{
				lastNum = num;
			}
			else
			{
				lastNum = num%10;
			}

			reverseNum = (reverseNum * 10) + lastNum;
			num = num / 10;			
		}
		
		System.out.println("Reverse Number is : "+reverseNum);
		
	}

}