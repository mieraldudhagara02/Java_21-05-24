/*
	The continue statement breaks one iteration (in the loop), 
	if a specified condition occurs, and continues with the next iteration in the loop.
*/

package keywords;

public class Continue {
	
	public static void main(String[] args) {
		
		int i;
		
		for(i=0; i<=5; i++)
		{
			if(i==3)
			{
				continue;
			}
		System.out.println(i);
		
		}
	}	
}