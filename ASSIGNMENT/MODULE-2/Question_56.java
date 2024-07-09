/*
	Write a Java program to copy one array list into another.
*/

package assignment_module_2;

import java.util.*;

public class Question_56 {
	
	public static void main(String[] args) {
		
		ArrayList<String> arrlistOne = new ArrayList<String>();
		
		arrlistOne.add("A");
		arrlistOne.add("B");
		arrlistOne.add("C");
		arrlistOne.add("D");
		
		System.out.println("ArrayList One : " + arrlistOne);
		
		ArrayList<String> arrlistTwo = new ArrayList<String>();
		
		arrlistTwo.add("E");
		arrlistTwo.add("F");
		arrlistTwo.add("G");
		arrlistTwo.add("H");
		
		System.out.println("ArrayList Two : " + arrlistTwo);
		
		Collections.copy(arrlistOne, arrlistTwo);
		System.out.println("ArrayList One : " + arrlistOne);
		System.out.println("ArrayList Two : " + arrlistTwo);		
		
	}

}