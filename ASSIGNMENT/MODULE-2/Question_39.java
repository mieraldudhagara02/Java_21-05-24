/*
	W.A.J. P to demonstrate try catch block, 
	take two numbers from the user by Command line argument and perform the division operation and 
	handle ArithmeticO/PException in thread main java. Lang. Arithmetic Exception:/ by zero
*/

package assignment_module_2;

import java.util.Scanner;

public class Question_39 {
	
	public static void main(String[] args) {
		
		Scanner division = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter first number : ");
			int num1 = division.nextInt();
			
			System.out.println("Enter second number : ");
			int num2 = division.nextInt();
			
			double result = num1 / num2;
			System.out.println("Division of num1 and num2 is : " + result);
			
		}
		catch (ArithmeticException e) {
	        System.out.println("Exception in thread main java.lang.ArithmeticException:/ by zero");
		
		division.close();
		}
		
	}

}