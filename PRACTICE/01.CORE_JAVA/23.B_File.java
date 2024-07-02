package javaInputOutput;

import java.io.*;

public class B_File {
	
	public static void main(String[] args) throws IOException {
		
		File secondFile = new File("D:\\M's_Second_Java_File.txt");
		
		if(secondFile.createNewFile())
		{
			System.out.println("File Successfully Create!!");
		}
		else
		{
			System.out.println("File Already Exist!!");
		}
		
	}

}