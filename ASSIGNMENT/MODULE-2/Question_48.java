/*
	Write a Java program to create a new array list, add some colors (string) and print out the collection.
*/

package assignment_module_2;

import java.util.ArrayList;

public class Question_48 {
	
	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Black");
		arr.add("Blue");
		arr.add("White");
		
		System.out.println("Colors : "+arr);
	}

}