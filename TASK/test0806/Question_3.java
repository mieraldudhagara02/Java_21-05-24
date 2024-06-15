/*
	Write a Java program to create a class called Shape with a method called getArea(). 
	Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.
*/

package test0806;

abstract class Shape
{
	abstract double getArea();
}

class Rectangle extends Shape
{
	int l;
	int w;
	
	Rectangle(double length, double width)
	{
		length = l;
		width = w; 
		
	}
	
	double getArea()
	{
		return l*w;
	}
}

public class Question_3 {
	
	public static void main(String[] args) {
		
		
		
		}

}