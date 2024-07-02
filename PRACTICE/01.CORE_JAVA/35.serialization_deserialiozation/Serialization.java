package serialization_deserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
	
	public static void main(String[] args) throws IOException {
		
		Employee emOne = new Employee(101, "miral");
		
		FileOutputStream serialize = new FileOutputStream("D://SHIINCHAN___//M's_Serialized_File.txt");
		
		ObjectOutputStream objout = new ObjectOutputStream(serialize);
		
		objout.writeObject(emOne);
		
		objout.close();
		
		System.out.println("Successfully Serialized...");
		
	}

}