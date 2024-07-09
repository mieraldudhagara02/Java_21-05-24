/*
	Write a Java program to search an element in an array list.
*/

package assignment_module_2;

import java.util.ArrayList;

public class Question_54 {
	
	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("Black");
		arr.add("White");
		arr.add("Blue");
		arr.add("Red");
		
		System.out.println("ArrayList : " + arr);
		
		if(arr.contains("Red"))
		{
			System.out.println("Found the element.");
		}
		else 
		{
			System.out.println("There is no such a Element.");
		}
		
	}

}