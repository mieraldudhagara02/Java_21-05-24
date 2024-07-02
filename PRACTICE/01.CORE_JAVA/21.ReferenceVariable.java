package practice;

class student
{
	String name;
	int id;
}

public class ReferenceVariable {
	
	public static void main(String[] args) {
		
		student Student;
		
		Student = new student();
		
		Student.id = 101;
		System.out.println("My ID : "+Student.id);
		
		Student.name = "Miral";
		System.out.println("My Name : "+Student.name);		
		
	}

}