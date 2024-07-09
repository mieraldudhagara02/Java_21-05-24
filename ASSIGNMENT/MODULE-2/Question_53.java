/*
	 Write a Java program to remove the third element from an array list.
*/

package assignment_module_2;

import java.util.ArrayList;

public class Question_53 {
	
	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("Miral");
		arr.add("Nikul");
		arr.add("Disha");
		arr.add("Riya");
		
		System.out.println("ArrayList : " + arr);
		
		arr.remove(3);
		
		System.out.println("ArrayList after remove a 3rd element : " + arr);
		
	}

}