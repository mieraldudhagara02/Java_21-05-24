/*
	W.A.J.P to demonstrate multiple catch blocks, 
	(one is to handle divide by zero exception and another one is to handle ArrayIndexOutOfBoundException) 
	int a [] =new int [5]; a [5]=30/0;
*/

package assignment_module_2;

public class Question_37 {
	
	public static void main(String[] args) {
		
		try
		{
			int[] m = new int[5];
			m[5] = 30/0;
		} 
		catch (ArithmeticException e)
		 {
			System.out.println("Caught ArithmeticException: Cannot divide by zero.");
		} 
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Caught ArrayIndexBoundsException: Array index is out of bounds. ");
		} 
		
	}

}