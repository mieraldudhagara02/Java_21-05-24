/*
	Create a class named 'Member' having the following members:
	1. Data members
	2. Name
	3. Age
	4. Phone number
	5. Address
	6. Salary
	It also has a method named 'printSalary' which prints the salary of the members.
*/

package assignment_module_2;

class Member
{
	String Name;
	int Age;
	String Phone_Number;
	String Address;
	int Salary;
	
	public Member(String Name, int Age, String Phone_Number, String Address, int Salary) 
	{
		// TODO Auto-generated constructor stub
		this.Name = Name;
		this.Age = Age;
		this.Phone_Number = Phone_Number;
		this.Address = Address;
		this.Salary = Salary;
	}
	
	void printSalary() 
	{
		System.out.println("Salary of " + Name + " is : " + Salary );
	}
}

public class Question_25 {
	
	public static void main(String[] args) {
		
		Member member = new Member("MIRAL", 22, "9510620422", "Virani Chowk", 50000);
		member.printSalary();
		
	}

}