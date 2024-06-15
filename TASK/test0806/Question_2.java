/*
	Write a Java program to make such a pattern like a right angle triangle with the number increased by 1.

	The pattern like :

	1
	2 3
	4 5 6
	7 8 9 10 
*/

package test0806;

public class Question_2 {
	
	public static void main(String[] args) {
		
		int i;
		int j;
		int n = 1;
		
		for(i=1; i<=4; i++)
		{
			for(j=1; j<=i; j++)
			{
				System.out.print(n);
				n++;
			}
			System.out.println();
		}
		
	}

}