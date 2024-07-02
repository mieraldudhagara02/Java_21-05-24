/*
	1 2 3 4 5 
	1 2 3 4 5 
	1 2 3 4 5 
	1 2 3 4 5 
	1 2 3 4 5 
*/

package loop_practice;

public class LoopE {
	
	public static void main(String[] args) {
		
		for(int i = 1; i<=5; i++) //Row
		{
			for(int j = 1; j<=5; j++) //Column
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
		
	}

}