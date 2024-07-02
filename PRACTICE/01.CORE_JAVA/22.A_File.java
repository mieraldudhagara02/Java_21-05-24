package javaInputOutput;

import java.io.*;

public class A_File {
	
	public static void main(String[] args) throws IOException {		

		File firstFile = new File("D:\\M's_First_Java_File.txt");
		
		if(firstFile.createNewFile())
		{
			System.out.println("File Successfully Create!");
		}
		else
		{
			System.out.println("File Already Exist..");
		}
		
	}
	
}