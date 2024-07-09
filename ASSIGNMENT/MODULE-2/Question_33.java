/*
	We have to calculate the area of a rectangle, a square and a circle. 
	Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea' taking two parameters, 
	'SquareArea' and 'CircleArea' taking one parameter each. 
	The parameters of 'RectangleArea' are its length and breadth, 
	that of 'SquareArea' is its side and that of 'CircleArea' is its radius. 
	Now create another class 'Area' containing
	all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the area of rectangle, square and circle respectively.
	Create an object of class 'Area' and call all the three methods.
*/

package assignment_module_2;

abstract class Shape
{
	abstract double RectangleArea(double length, double breadth);
	abstract double SquareArea(double side);
	abstract double CircleArea(double radius);
}

class Area
{
	double RectangleArea(double length, double breadth) {
		return length*breadth;
	}
	
	double SquareArea(double side)
	{
		return side*side;
	}
	
	double CircleArea(double radius)
	{
		return 3.14F * radius * radius;
	}
}

public class Question_33 {
	
	public static void main(String[] args) {
		
		Area area = new Area();
		System.out.println("Area of Rectangle : " + area.RectangleArea(4.0, 8.0));
		System.out.println("Area of Square : " + area.SquareArea(4.0));
		System.out.println("Area of Circle : " + area.CircleArea(3.5));
		
	}

}