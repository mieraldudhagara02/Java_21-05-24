/*
	Write a program in Java to input 5 numbers from keyboard and find their sum and average using for loop.
*/
	
package assignment_module_2;

import java.util.Scanner;

public class Question_5 {
	
	public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter 5 numbers:");

        int sum = 0;
        int input = 5;
        double average;

        
        for (int i = 0; i < input; i++) {
            
            int num = scanner.nextInt();
            
            sum += num;
        }
        
        System.out.println("Sum: " + sum);
        
        average = sum / input;
        System.out.println("Average: " + average);

        scanner.close();
    }
}
