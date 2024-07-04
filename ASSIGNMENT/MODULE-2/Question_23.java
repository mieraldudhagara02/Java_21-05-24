/*
	Create a class to print the area of a square and a rectangle. 
	The class has two methods with the same name but different number of parameters. 
	The method for printing area of a rectangle has two parameters which are length and base respectively
	while the other method for printing area of square has one parameter which is side of square.
*/

package assignment_module_2;

public class Question_23 {

	public void rect(int length, int base)
	{
		int areaR = length * base;
		System.out.println("Area of Rectangle is : " + areaR);
	}
	
	public void square(int side)
	{
		int areaS = 2*side;
		System.out.println("Area of Square is : " + areaS);
	}
	
	public static void main(String[] args) {
		
		Question_23 areaRS = new Question_23();
		areaRS.rect(10, 20);
		areaRS.square(10);
		
	}
	
}