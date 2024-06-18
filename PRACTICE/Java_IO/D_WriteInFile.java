package javaInputOutput;

import java.io.*;

public class D_WriteInFile {
	
	public static void main(String[] args) throws Exception {
		
		FileWriter thirdFile = new FileWriter("D:\\SHIINCHAN___\\JAVA\\M's_Third_Java_File.txt");
		
		thirdFile.write("Hellow!! Welcome to the World of Miral__");
		thirdFile.close();
		
		System.out.println("Successfully wrote data in the file..");
		
	}

}