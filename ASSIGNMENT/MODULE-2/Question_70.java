/*
	Write a Java program to check whether a map contains key-value mappings (empty) or not.
*/

package assignment_module_2;

import java.util.HashMap;

public class Question_70 {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hash = new HashMap<Integer, String>();
		
		hash.put(1, "Apple");
		hash.put(2, "Ball");
		hash.put(3, "Cat");
		hash.put(4, "Dog");
		hash.put(5, "Elephant");
		
		if(hash.isEmpty())
		   {
			   System.out.println("Hash map is empty");
		   }
		   else
		   {
			   System.out.println("Hash map is not empty"); 
			  
		   }
		
	}
}