package operators_practice;

public class AssignmentOperators {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		
		//Simple Assignment Operator
		a = b;
		System.out.println("Simple Assignment Operator : "+a);
		
		
		//Addition Assignment 
		a+=b;
		/* 
			a = a + b 
			a = 20 + 20
			a = 40
		*/
		System.out.println("Addition Assignment : "+a);
		
		
		//Substraction Assignment
		b-=a;
		/* 
			b = b - a 
			b = 20 - 40
			b = -20
		*/
		System.out.println("Substraction Assignment : "+b);
		
		
		//Multiplication Assignment
		a*=b;
		/* 
			a = a * b 
			a = 40 * (-20)
			a = -800
		 */
		System.out.println("Multiplication Assignment : "+a);
		
		
		//Division Assignment
		a/=b;
		/*
			a = a / b
			a = -800 / -20
			a = 40
		 */
		System.out.println("Division Assignment : "+a);
		
		
		//Modulo Assignment
		b%=a;
		/*
			b = b % a
			b = -20 % 40
			b = -20
		*/
		System.out.println("Modulo Assignment : "+b);
		
	}

}