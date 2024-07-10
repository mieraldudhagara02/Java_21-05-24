/*
	Write a Java program to count the number of key-value (size) mappings in a map.
*/

package assignment_module_2;

import java.util.HashMap;

public class Question_62 {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		
		hashmap.put(1, "Miral");
		hashmap.put(2, "Nikul");
		hashmap.put(3, "Riya");
		hashmap.put(4, "Ashu");
		
		System.out.println("Size of HashMap : " + hashmap.size());
		
	}

}