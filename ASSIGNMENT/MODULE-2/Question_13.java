/*
	Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both.
*/

package assignment_module_2;

public class Question_13 {
	
	public static void main(String[] args) {
		
		int i;
		
		for(i=1; i<=100; i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println(i);
			}
		}
		
	}

}