package operators_practice;

public class UnaryOperators {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		//post-increment
		//int post_incre = a++;
		//System.out.println("Post-Increment of a is : "+post_incre);
		//System.out.println("Now, the value of a is : "+a);
		
		//pre-increment
		int pre_incre = ++a;		
		System.out.println("Pre-Increment of a is : "+pre_incre);
		System.out.println("Now, the value of a is : "+a);
		
		
		//post-decrement
		//int post_decre = b--;
		//System.out.println("Post-Decrement of b is : "+post_decre);
		//System.out.println("Now, the value of b is : "+b);
		
		//pre-increment
		int pre_decre = --b;		
		System.out.println("Pre-Decrement of b is : "+pre_decre);
		System.out.println("Now, the value of b is : "+b);
		
	}

}