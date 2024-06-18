/*
	W.A.J.P to check whether a given string starts with the contents of another string.
	Red is favorite color. Starts with Red? True
	Orange is also my favorite color. Starts with Red? False
*/

package assignment_module_2;

public class Question_18 {
	
	public static void main(String[] args) {
		
		String red = "Red is my favorite color.";
		String redOne = "Red";
		
		String orange = "Orange is also my favorite color.";
		String orangeOne = "Red";
		
		System.out.println("String red is starts with the contents of redOne : "+red.startsWith(redOne));
		System.out.println("String orange is starts with the contents of orangeOne : "+orange.startsWith(orangeOne));
		
	}

}