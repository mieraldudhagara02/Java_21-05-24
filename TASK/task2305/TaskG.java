/*
	Write a program to calculate sum of 5 subjects & find the percentage. Subject marks entered by user.
*/

package task2305;

public class TaskG {
	
	public static void main(String[] args) {
		
		//marks of five subjects out of 100
		int maths = 65;
		int english = 70;
		int gujarati = 65;
		int social = 75;
		int environment = 80;
		
		//total of marks
		int sum = maths + english + gujarati + social + environment;
		
		//percentage of marks
	    float Percentage = (sum * 100) / 500;
		
		System.out.println("Total of Marks of five subjects : "+ sum);
		
		System.out.println("Percentage : "+ Percentage + "%");
	}

}