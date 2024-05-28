/*
	write a program you have to find the factorial of given number.
	5!=5*4*3*2*1
*/

package task2505;

public class TaskD {
	
	public static void main(String[] args) {
		
		int row;
		int factorial = 1;
		
		for(row=5; row>1; row--)
		{
			System.out.println(factorial *= row);
			//factorial = factorial * row
			//1 = 1 * 5
			//5 = 5 * 4
			//20 = 20 * 3
			//60 = 60 * 2
			//120
		}
		
		System.out.println("Factorial of 5 is : " + factorial);
		
	}

}