/*
	1 1 1 1 1 
	2 2 2 2 2 
	3 3 3 3 3 
	4 4 4 4 4 
	5 5 5 5 5 
*/

package loop_practice;

public class LoopF {
	
	public static void main(String[] args) {
		
		for(int i = 1; i<=5; i++) //Row
		{
			for(int j = 1; j<=5; j++) //Column
			{
				System.out.print(i + " ");
			}
			
			System.out.println();
		}
		
	}

}