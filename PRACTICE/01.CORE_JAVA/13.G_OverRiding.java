package oop;

class Father
{
	int inheritence()
	{
		return 1;
	}
}

class child_1 extends Father
{
	@Override
	int inheritence()
	{
		return 2;
	}
}

class child_2 extends Father
{
	@Override
	int inheritence()
	{
		return 3;
	}
}

class child_3 extends Father
{
	@Override
	int inheritence()
	{
		return 4;
	}
}

public class G_OverRiding {
	
	public static void main(String[] args) {
		
		//child_1 one = new child_1();
		//System.out.println(one.inheritence());
		
		//child_2 two = new child_2();
		//System.out.println(two.inheritence());
		
		//child_3 three = new child_3();
		//System.out.println(three.inheritence());
		
		
		//reference variable
		Father myFather;
		
		myFather = new child_1();
		System.out.println(myFather.inheritence());
		
		myFather = new child_2();
		System.out.println(myFather.inheritence());
		
		myFather = new child_3();
		System.out.println(myFather.inheritence());
		
	}

}