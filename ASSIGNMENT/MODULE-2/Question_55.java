/*
	Write a Java program to sort a given array list
*/

package assignment_module_2;

import java.util.*;

public class Question_55 {
	
	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("Apple");
		arr.add("Cat");
		arr.add("Elephant");
		arr.add("Ball");
		arr.add("Dog");
		
		System.out.println("ArrayList before sort : " + arr);
		
		Collections.sort(arr);
		
		System.out.println("ArrayList after sort : " + arr);
		
	}

}