/*
	Write a Java program to insert an element into the array list at the first position.
*/

package assignment_module_2;

import java.util.ArrayList;

public class Question_50 {
	
	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("Rose");
		arr.add("Daisy");
		arr.add("Lotus");
		
		System.out.println("Original Array List : " + arr);
		
		arr.add(0, "Sunflower");
		
		System.out.println("New Array List : " + arr);
	}

}