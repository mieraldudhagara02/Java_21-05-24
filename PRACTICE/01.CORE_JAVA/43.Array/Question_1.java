/*
	Create an array of 5 floats and calculate their sum.
*/
 
package array;

public class Question_1 {
	
	public static void main(String[] args) {
		
		float [] sum = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};	
		float summation = 0;
		
		//for(int i = 0; i<=sum.length; i++)
		//{
		//	summation += i;
		//}
		
		for(float addition : sum)
		{
			summation += addition;
		}
		
		System.out.println("Sum of array elements : " + summation);
		
	}

}