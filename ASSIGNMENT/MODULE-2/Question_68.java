/*
	Write a Java program to convert a hash set to an array.
*/

package assignment_module_2;

import java.util.HashSet;

public class Question_68 {
	
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("Php");
		set.add("Android");
		set.add("Flutter");
		set.add("Python");
				
		System.out.println("Hash set: " + set);				
				
		String[] new_array = new String[set.size()];
				 
		set.toArray(new_array);
				
		System.out.println("Array: ");
		
		for(String list : new_array)
		{
			System.out.println(list);
		}
				  
	}

}