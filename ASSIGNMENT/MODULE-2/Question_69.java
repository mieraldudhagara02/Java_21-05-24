/*
	Write a Java program to convert a hash set to a List/Array List.
*/

package assignment_module_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Question_69 {
	
	public static void main(String[] args) {
		
		 HashSet<String> h_set = new HashSet<String>();
		          h_set.add("Red");
		          h_set.add("Green");
		          h_set.add("Black");
		          h_set.add("White");
		          h_set.add("Pink");
		          h_set.add("Yellow");
		      System.out.println("Original Hash Set: " + h_set);
		    
		     List<String> list = new ArrayList<String>(h_set);
		 
		     System.out.println("ArrayList contains: "+ list);
		
	}

}