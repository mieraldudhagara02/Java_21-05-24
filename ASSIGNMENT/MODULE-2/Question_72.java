/*
	Write a Java program to replace the second element of an Array List with the specified element.
*/

package assignment_module_2;

import java.util.ArrayList;

public class Question_72 {
	
	public static void main(String[] args) {
		
		ArrayList<String> array = new ArrayList<String>();
		
		array.add("Java");
		array.add("Php");
		array.add("Android");
		array.add("Flutter");
		
		System.out.println("Original array list: " + array);
		
		array.set(1, "Python");
		
		int num = array.size();
		System.out.println("Replace third element with 'Python'.");
		for(int i=0 ; i<num ; i++)
		{
			System.out.println(array.get(i));
		}
		
	}

}