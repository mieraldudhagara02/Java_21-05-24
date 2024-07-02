package oop;

import java.util.Scanner;

public class C_MainWithinClassScanner {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Name : ");
		String name = sc.next();
		
		
		System.out.println("Hellow " + name);
		
		sc.close();
		
	}

}