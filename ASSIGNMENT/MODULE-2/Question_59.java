/*
	Write a Java program to iterate through all elements in a hash list.
*/

package assignment_module_2;

import java.util.HashSet;
import java.util.Iterator;

public class Question_59 {
	
	public static void main(String[] args) {
			
			HashSet<String> hash = new HashSet<String>();
			
			hash.add("Miral");
			hash.add("Nikul");
			hash.add("Riya");
			hash.add("Ashu");
			hash.add("Disha");
			
			Iterator<String> i = hash.iterator();
			
			while(i.hasNext())
			{
				System.out.println(i.next());
			}

	}
		
}