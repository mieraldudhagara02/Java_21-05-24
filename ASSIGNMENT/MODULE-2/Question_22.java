/*
	Create a class to print an integer and a character with two methods having the same name but different sequence of the integer 
	and the character parameters. 
    For example, if the parameters of the first method are of the form (int n, char c), then that of the second method will be of the 
    form (char c, int n).
*/

package assignment_module_2;

public class Question_22 {
	
	public void intchar(int a, char b) 
	{
		System.out.println("Method-1 Integer is : " + a);
		System.out.println("Method-1 Character is : " + b);
	}
	
	public void intchar(char b, int a) 
	{
		System.out.println("Method-2 Character is : " + b);
		System.out.println("Method-2 Integer is : " + a);
	}
	
	public static void main(String[] args) {
		
		Question_22 ic = new Question_22();
		
		ic.intchar(11, 'M');
		ic.intchar('N', 01);
		
	}

}