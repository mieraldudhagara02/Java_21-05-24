/*
	Write a Java program to extract a portion of an array list.
*/

package assignment_module_2;

import java.util.ArrayList;
import java.util.List;

public class Question_64 {

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("Apple");
		arr.add("Ball");
		arr.add("Cat");
		arr.add("Dog");
		arr.add("Elephant");
		
		System.out.println("Original ArrayList : " + arr);
		
		List<String> sublist = arr.subList(0, 3);
		
		System.out.println("Portion of first 3 elements : " + sublist);
		
	}
	
}