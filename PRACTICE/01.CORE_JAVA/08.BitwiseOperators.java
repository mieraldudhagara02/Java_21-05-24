package operators_practice;

public class BitwiseOperators {
	
	public static void main(String[] args) {
		
		int a = 5;
		int b = 4;
		
		//Bitwise OR
		System.out.println("Bitwise OR : "+(a|b));
		/*
			a = 5
			
			1 2 4
			1 0 1 
			1 0 1 = 5
			
			b = 4
			
			1 2 4
			0 0 1
			1 0 0 = 4
			
			1 0 1
			1 0 0
			-----
			1 0 1 = 5
		*/
		
		//Bitwise AND
		System.out.println("Bitwise AND : "+(a&b));
		/*
			a = 5
			
			1 2 4
			1 0 1 
			1 0 1 = 5
			
			b = 4
			
			1 2 4
			0 0 1
			1 0 0 = 4
			
			1 0 1
			1 0 0
			-----
			1 0 0 = 4
		*/
		
		//Bitwise XOR
		System.out.println("Bitwise XOR : "+(a^b));
		/*
			a = 5
		
			1 2 4
			1 0 1 
			1 0 1 = 5
		
			b = 4
		
			1 2 4
			0 0 1
			1 0 0 = 4
		
			1 0 1
			1 0 0
			-----
			0 0 1 = 1
		 */
		
		//Bitwise Complement
		System.out.println("Bitwise Complement : "+(~b));
		/*
			b = 4
			
			1 2 4
			0 0 1
			
			1 0 0 = 4
			0 1 1 = -5			
		*/
		
	}

}