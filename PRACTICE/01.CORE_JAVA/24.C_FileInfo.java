package javaInputOutput;

import java.io.*;

public class C_FileInfo {
	
	public static void main(String[] args) {
		
		File fileinfo = new File("D:\\M's_First_Java_File.txt");
		
		if(fileinfo.exists())
		{
			System.out.println("File Name : "+fileinfo.getName());
			System.out.println("File Size : "+fileinfo.length());
			System.out.println("File Path : "+fileinfo.getAbsolutePath());
			System.out.println("File Writable : "+fileinfo.canWrite());
			System.out.println("File Readable : "+fileinfo.canRead());
			System.out.println("File Remove : "+fileinfo.delete());
		}
		else
		{
			System.out.println("File does not exist.");
		}
		
	}

}