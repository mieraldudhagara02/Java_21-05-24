/*
	write a program you have to print the table of given number.
	
	5 * 1 = 5
	5 * 2 = 10
	5 * 3 = 15
	5 * 4 = 20
	5 * 5 = 25
*/

package task2505;

public class TaskF {
	
	public static void main(String[] args) {
		int n = 5;
		int i;
		int multiplication;
		
		for(i = 1; i<=10; i++)
		{
			multiplication = n * i;
			System.out.println(n + " * " + i + " " + " = " + multiplication);
			//System.out.printf("%d * %d = %d \n", n, i, n * i);
		}
		
	}
	
}