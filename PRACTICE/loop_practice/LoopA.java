/*
	Write a program to print the sum of natural numbers.
*/

package loop_practice;

public class LoopA {

	public static void main(String[] args) {
		
		int sum = 0;
		int n = 10;
		
		for(int i = 0; i<=n; i++)
		{
			sum = sum + i;
		}
		System.out.println("Sum of 10 Natural Numbers : " + sum);
		
	}
	
}