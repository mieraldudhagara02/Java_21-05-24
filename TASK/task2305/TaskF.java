/*
	Write a program to find the simple Interest.
*/

package task2305;

public class TaskF {
	
	public static void main(String[] args) {
		
		//price
		int p = 10000;
		
		//rate of interest
		int r = 15;
		
		//year
		int t = 5;
		
		int SI = (p*t*r)/100;
		
		System.out.println("Simple Interest : "+ SI);
	}
	
}