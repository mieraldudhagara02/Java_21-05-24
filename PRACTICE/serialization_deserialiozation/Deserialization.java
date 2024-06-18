package serialization_deserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException  {
		
		ObjectInputStream objin = new ObjectInputStream (new FileInputStream("D://SHIINCHAN___//M's_Serialized_File.txt"));

		Employee emTwo = (Employee) objin.readObject();
		
		System.out.println("Employee Id : "+emTwo.id);
		System.out.println("Employee Name : "+emTwo.name);
		
		objin.close();
		
	}
	
}