/*
	Write a program you have to print the Fibonacci series up to user given number
*/

package task2505;

public class TaskE {
	
	public static void main(String[] args) {

		int i;
		int n = 10;
		int firstNum = 0;
		int secondNum = 1;
		int thirdNum;
		
		for(i=1; i<=n; i++)
		{
			System.out.println(firstNum);
			thirdNum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = thirdNum;
		}
		
	}

} 