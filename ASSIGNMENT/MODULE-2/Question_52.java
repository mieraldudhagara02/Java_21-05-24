/*
	Write a Java program to update specific array element by given element.
*/

package assignment_module_2;

import java.util.ArrayList;

public class Question_52 {
	
	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("Miral");
		arr.add("Nikul");
		arr.add("Disha");
		
		System.out.println("ArrayList : " + arr);
		
		arr.set(0, "Miru");
		
		System.out.println("Updated ArrayList : " + arr);
		
	}

}