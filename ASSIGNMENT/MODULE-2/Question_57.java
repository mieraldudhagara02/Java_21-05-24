/*
	Write a Java program to shuffle elements in an array list.
*/

package assignment_module_2;

import java.util.ArrayList;
import java.util.Collections;

public class Question_57 {
	
	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("Miral");
		arr.add("Nikul");
		arr.add("Disha");
		arr.add("Ashu");
		
		System.out.println("ArrayList before Shuffle : " + arr);
		
		Collections.shuffle(arr);
		
		System.out.println("ArrayList after Shuffle : " + arr);
	}

}