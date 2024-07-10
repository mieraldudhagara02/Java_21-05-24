/*
	Write a Java program to get the number of elements in a hash set.
*/

package assignment_module_2;

import java.util.HashSet;

public class Question_60 {
	
	public static void main(String[] args) {
		
		HashSet<String> hash = new HashSet<String>();
		
		hash.add("Miral");
		hash.add("Nikul");
		hash.add("Riya");
		hash.add("Ashu");
		hash.add("Disha");
		
		System.out.println("HashSet : " + hash);
		System.out.println("Size of HashSet : " + hash.size());
		
	}

}