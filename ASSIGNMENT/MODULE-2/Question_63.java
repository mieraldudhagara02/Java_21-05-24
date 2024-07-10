/*
	Write a Java program to reverse elements in an array list.
*/

package assignment_module_2;

import java.util.ArrayList;
import java.util.Collections;

public class Question_63 {
	
	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("Apple");
		arr.add("Ball");
		arr.add("Cat");
		arr.add("Dog");
		arr.add("Elephant");
		
		System.out.println("ArrayList before reverse : " + arr);
		
		Collections.reverse(arr);
		
		System.out.println("ArrayList after reverse : " + arr);
		
	}

}