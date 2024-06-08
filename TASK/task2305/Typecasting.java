package task2305;

public class Typecasting 
{
	public static void main (String [] args)
	{
		int num = 5;
		double dbnum = num;

		double dbnumber = 11.9d;
		int number = (int) dbnumber;

		System.out.println(num);
		System.out.println(dbnum); //implicit,widening,automatically type casting

		System.out.println(dbnumber);
		System.out.println(number); //explicit,narrowing,manually type casting
	}
}