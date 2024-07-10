/*
	Write a Java program to associate the specified value with the specified key in a Hash Map.
*/

package assignment_module_2;

import java.util.HashMap;

public class Question_61 {
	
	public static void main(String[] args) {
	
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		
		hashmap.put(1, "Miral");
		hashmap.put(2, "Nikul");
		hashmap.put(3, "Riya");
		hashmap.put(4, "Ashu");
		
		System.out.println(hashmap);
		
	}

}