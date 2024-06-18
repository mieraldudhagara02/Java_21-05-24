/*
	W.A.J.P to check whether a given string ends with the contents of another string.
	"Java Exercises" ends with "se"? False 
	"Java Exercise" ends with "se"? True
*/

package assignment_module_2;

public class Question_17 {
	
	public static void main(String[] args) {
		
		String one = "Java Exercises";
		String two = "se";
		String three = "Java Exercise";
		String four = "se";
		
		System.out.println("String one is ends with the content of String two : "+one.endsWith(two));
		
		System.out.println("String three is ends with the content of String four : "+three.endsWith(four));
		
	}

}