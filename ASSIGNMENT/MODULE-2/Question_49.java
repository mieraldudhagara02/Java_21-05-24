/*
	Write a Java program to iterate through all elements in an array list.
*/

package assignment_module_2;

import java.util.ArrayList;
import java.util.Iterator;

public class Question_49 {
	
	public static void main(String[] args) {
		
		ArrayList arr = new ArrayList();
		
		
		arr.add("Miral");
		arr.add("Nikul");
		arr.add(11);
		
		Iterator i = arr.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}