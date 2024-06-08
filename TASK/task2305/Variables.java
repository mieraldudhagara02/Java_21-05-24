package task2305;

public class Variables
{
	public static void main(String [] args)
	{
		int age = 21;
		age = 25;
		char firstletter = 'M';
		char myChar = 65; //ASCII value
		String name = "Miral";
		float percentage = 99e4f;
		boolean vote = true;
		double dbnumber = 35E5d;
		final int number = 24;
		//number = 25;		

		System.out.println(age + "years");
		System.out.println(firstletter);
		System.out.println(myChar);
		System.out.println(name);
		System.out.println(percentage + "%");
		System.out.println(vote);
		System.out.println(dbnumber);
		System.out.println(number); // will generate an error
	}
}