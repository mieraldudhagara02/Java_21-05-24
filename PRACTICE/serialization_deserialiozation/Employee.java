package serialization_deserialization;

import java.io.Serializable;

public class Employee implements Serializable {

	String name;
	int id;
	
	public Employee(int id, String name)
	{
		this.name = name;
		this.id= id;
	}

}