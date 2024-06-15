package oop;

class multiplication
{
	int mult()
	{
		int m = 11;
		int n = 1;
		int p = m * n;
		
		return p;
	}
	
}

public class F_OverLoading {
	
	public static void main(String[] args) {
		
		multiplication mul = new multiplication();
		
		int result = mul.mult();
		System.out.println("First"+result);
		
	}

}
