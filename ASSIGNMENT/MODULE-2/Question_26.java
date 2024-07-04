/*
	Create a class named 'Rectangle' with two data members 'length' and 'breadth' and 
	two methods to print the area and perimeter of the rectangle respectively. 
	Its constructor having parameters for length and breadth is used to initialize the length and breadth of the rectangle.
	 
	Let class 'Square' inherit the 'Rectangle' class with its constructor having a parameter for its side (suppose s) calling the constructor of its
    parent class as 'super (s, s)'. 
    Print the area and parameter of a rectangle and a square.
*/

package assignment_module_2;

class Rectangle
{
	double length;
	double breadth;
	
	public Rectangle(double length, double breadth)
	{
		// TODO Auto-generated constructor stub
		this.length = length;
		this.breadth = breadth;
	}
	
	double area()
	{
		return length * breadth;
	}
	
	double perimeter()
	{
		return 2 * (length + breadth);
	}
	
}

class Square extends Rectangle
{

	public Square(double Side) {
		// TODO Auto-generated constructor stub
		super(Side, Side);
	}
	
}

public class Question_26 {
	
	public static void main(String[] args) {
		
		Rectangle areaRect = new Rectangle(4.0, 8.0);
		
		System.out.println("Area of Rectangle : " + areaRect.area());
		System.out.println("Perimeter of Rectangle : " + areaRect.perimeter());
		
		Square areaSqu = new Square(4.0);
		
		System.out.println("Area of Square : " + areaSqu.area());
		System.out.println("Perimeter of Square : " + areaSqu.perimeter());
		
	}

}
