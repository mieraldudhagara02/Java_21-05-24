package oop;

public class E_OverLoading {
	
	void add()
	{
		int a = 10, b = 10, c;
		c=a+b;
		
		System.out.println("First"+c);
	}
	
	void add(int a, int b)
	{
		int c;
		c = a + b;
		
		System.out.println("Second"+c);
	}
	
	void add(double a, double b)
	{
		//Narrowing Casting
		int c = (int) (a + b) ;
		
		System.out.println("Third"+c);
	}
	
	void add(int a, int b, double c)
	{
		//Widening Casting
		double d;
		d = a + b + c;
		
		System.out.println("Fourth"+d);
	}
	
	int add(int m, int n, int p)
	{
		double addition;
		addition = m + n + p;
		
		return (int) addition;
	}
	
	public static void main(String[] args) {
		
		E_OverLoading ovrloading = new E_OverLoading();
		
		ovrloading.add();
		ovrloading.add(20, 30);
		ovrloading.add(11, 1);
		ovrloading.add(11.0, 1.0);
		ovrloading.add(11, 1, 0.7);
		
		int returnType = ovrloading.add(11, 1, 11);
		System.out.println("Fifth"+returnType);
		
	}

}