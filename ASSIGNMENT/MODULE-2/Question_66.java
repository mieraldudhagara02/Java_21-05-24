/*
	Write a Java program of swap two elements in an array list.
*/

package assignment_module_2;

import java.util.ArrayList;
import java.util.Collections;

public class Question_66 {
	
	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("Black");
		arr.add("White");
		arr.add("Blue");
		arr.add("Pink");
		
		System.out.println("ArrayList before swapping : " + arr);
		
		Collections.swap(arr, 0, 2);
		
		System.out.println("ArrayList after swapping : " + arr);
		
	}

}