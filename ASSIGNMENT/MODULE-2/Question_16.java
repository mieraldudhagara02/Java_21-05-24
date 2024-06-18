/*
	W.A.J.P to compare a given string to the specified character sequence. 
	Comparing topsint.com and topsint.com: true 
	Comparing Topsint.com and topsint.com: false
*/

package assignment_module_2;

public class Question_16 {
	
	public static void main(String[] args) {
		
		String one = "tops.com";
		String two = "Tops.com";
		String three = "tops.com";
		
		System.out.println("Comparing String one and three : "+one.contentEquals(three));
		
		System.out.println("Comparing String one and two : "+ one.contentEquals(two));
		
	}

}