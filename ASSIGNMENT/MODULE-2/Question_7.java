/*
	Write a program in Java to make such a pattern like right angle triangle with number increased by 1 The pattern like:
		1
		2 3
		4 5 6
		7 8 9 10
*/

package assignment_module_2;

public class Question_7 {
	
	public static void main(String[] args) {
		
		int n=1;
		
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(n++ +" ");
			}
			System.out.println();
		}
		
	}

}