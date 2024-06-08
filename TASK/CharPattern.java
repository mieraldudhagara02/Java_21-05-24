package task;

public class CharPattern {
	
	public static void main(String[] args) {
		
		int row;
		int column;
		//int character = 65;
		char character = 65; 
		
		for(row=1; row<=5; row++)
		{
			for(column=1; column<=row; column++)
			{
				System.out.print(character + " ");
			}
			System.out.println();
			character++;
		}
	}

}