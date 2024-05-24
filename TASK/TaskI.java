/*
	Write a Program to check the given year is leap year or not.
*/

package task2305;

public class TaskI {
	
	public static void main(String[] args) {
		int year = 2002;
		
		if(year % 4 == 0)
		{
			System.out.println("Year is a Leap Year.");
		}
		
		else
		{			
			System.out.println("Year is not a Leap Year.");
			
		}		
	}

}