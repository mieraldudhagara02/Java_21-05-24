package oop;

//main method within class
//class 
public class A_MainWithinClass {
	
	//variables OR data-members OR fields
	String Name;
	int Id;
	
	//main method
	public static void main(String[] args) {
		
		//objects
		A_MainWithinClass student1 = new A_MainWithinClass();
		A_MainWithinClass student2 = new A_MainWithinClass();
		
		student1.Name = "NIKUL";
		student1.Id = 101;
		
		student2.Name = "MIRAL";
		student2.Id = 102;
		
		System.out.println(student1.Name);
		System.out.println(student2.Id);
	}

}