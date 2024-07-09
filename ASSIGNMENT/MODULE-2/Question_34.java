/*
	Write a program which will ask the user to enter his/her marks (out of 100). 
	Define a method that will display grades according to the marks entered as below:
	Marks Grade
	91-100 A
	81-90 B
	71-80 B
	61-70 C
	51-60 D
	41-50 DD
	40 Fail
*/

package assignment_module_2;

import java.util.Scanner;

public class Question_34 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your marks : ");
		int marks = sc.nextInt();
		
		if(marks >= 91 && marks <= 100)
		   {
			   System.out.println("A GRADE");
		   }
		   else if(marks >= 81 && marks <= 90)
		   {
			   System.out.println("B GRADE");
		   }
		   else if(marks >= 71 && marks <= 80)
		   {
			   System.out.println("B GRADE");
		   }
		   else if(marks >= 61 && marks <= 70)
		   {
			   System.out.println("C GRADE");
		   }
		   else if(marks >= 51 && marks <= 60)
		   {
			   System.out.println("D GRADE");
		   }
		   else if(marks >= 41 && marks <= 50)
		   {
			   System.out.println("DD GRADE");
		   }
		   else
		   {
			   System.out.println("FAIL");
		   }
		
		sc.close();
		
	}

}