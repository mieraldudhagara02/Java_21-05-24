package javaInputOutput;

import java.io.FileOutputStream;
import java.io.IOException;

public class E_File {
	
	public static void main(String[] args) throws IOException {
		
		String mbyte = "Welcome!!";
		
		FileOutputStream bytes = new FileOutputStream("D://SHIINCHAN___//JAVA//Java_Project//M's_bytes_File.txt");
		
		bytes.write(mbyte.getBytes());
		
		System.out.println("SuccessFull!!");
		
		bytes.close();
		
	}

}