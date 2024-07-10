/*
	Write a Java program to join two array lists.
*/

package assignment_module_2;

import java.util.ArrayList;

public class Question_67 {
	
	public static void main(String[] args) {
		
		ArrayList<String> arr1 = new ArrayList<String>();
		
		arr1.add("Black");
		arr1.add("White");
		
		ArrayList<String> arr2 = new ArrayList<String>();
		arr2.add("Blue");
		arr2.add("Pink");
		
		System.out.println("ArrayList One : " + arr1);
		System.out.println("ArrayList Two : " + arr2);
		
		arr1.addAll(arr2);
		
		System.out.println("ArrayList after join : " + arr1);
		
	}

}