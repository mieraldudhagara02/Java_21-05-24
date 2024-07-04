/*
	Create a class named 'Print Number' to print various numbers of different data types by creating different methods with 
	the same name 'printn' having a parameter for each data type.
*/

package assignment_module_2;

public class Question_21_PrintNumber {

public void printn(int a)
{
	System.out.println("Integer Number : " + a);
}

public void printn(char a)
{
	System.out.println("Character : " + a);
}

public void printn(String a)
{
	System.out.println("String : " + a);
}

public void printn(float a)
{
	System.out.println("Float Number : " + a);
}

public void printn(double a)
{
	System.out.println("Double Number : " + a);
}

public void printn(long a)
{
	System.out.println("Long Number : " + a);
}

public void printn(boolean a)
{
	System.out.println("Boolean : " + a);
}

	public static void main(String[] args) {
		
		Question_21_PrintNumber printnum = new Question_21_PrintNumber();
		printnum.printn(11);
		printnum.printn('M');
		printnum.printn("MIRAL");
		printnum.printn(1.1F);
		printnum.printn(11.052023);
		printnum.printn(12345678910L);
		printnum.printn(false);
		
	}

}