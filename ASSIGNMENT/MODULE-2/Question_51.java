/*
	Write a Java program to retrieve an element (at a specified index) from a given array list.
*/
package assignment_module_2;

import java.util.ArrayList;

public class Question_51 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		
		System.out.println("ArrayList : " + arr);
		
		System.out.println("The Element at index 2 is : " + arr.get(3));
		
	}

}