/*
	Write a program to find out whether a given integer is present in an array or not.
*/

package array;

import java.util.Scanner;

public class Question_2 {
	
	public static void main(String[] args) {
		
		int [] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the integer : ");
		int number = input.nextInt();
		
		for(int equals : num)
		{
			if(number == equals)
			{
				System.out.println("Given integer is present in an array.");
				break;
			}
			else 
			{
				System.out.println("Given integer is not present in an array.");
				break;
			}
		}
		
		input.close();
		
	}

}