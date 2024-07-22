/*
	Calculate the average marks from an array containing marks of all students in physics using for-each loop.
*/

package array;

public class Question_3 {
	
	public static void main(String[] args) {
		
		int [] marksOfPhysics = {45, 40, 35, 30, 42};
		int sum = 0;
		
		for(int avg : marksOfPhysics)
		{
			sum+=avg;
		}
		
		System.out.println("Average marks : " + sum/marksOfPhysics.length);
		
	}

}