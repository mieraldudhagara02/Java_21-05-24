/*
	Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units 
	by creating a class named 'Triangle' without any parameter in its constructor.
*/

package assignment_module_2;

class Triangle
{
	int Side1;
	int Side2;
	int Side3;

public Triangle()
{
	this.Side1 = 3;
	this.Side2 = 4;
	this.Side3 = 5;
}

public int areaOfTriangle()
{
	return (int) (0.5 * (Side1 * Side2));
}

public int perimeterOfTriangle()
{
	return (int) Side1 + Side2 + Side3;
}

}

public class Question_27 {
	
	public static void main(String[] args) {
		
		Triangle triangle = new Triangle();
		System.out.println("Area of Triangle : " + triangle.areaOfTriangle());
		System.out.println("Perimeter of Triangle : " + triangle.perimeterOfTriangle());
		
	}

}