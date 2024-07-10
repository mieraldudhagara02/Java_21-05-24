/*
	Write a Java program to get a collection view of the values contained in this map.
*/

package assignment_module_2;

import java.util.HashMap;

public class Question_75 {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> hashmap= new HashMap<Integer,String>();  
		hashmap.put(1,"Red");
		hashmap.put(2,"Green");
		hashmap.put(3,"Black");
		hashmap.put(4,"White");
		hashmap.put(5,"Blue");
		       
		System.out.println("Collection view is: "+ hashmap.values());
		
	}

}