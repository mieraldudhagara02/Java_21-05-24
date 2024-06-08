package operators_practice;

public class TernaryOperator {
	
	public static void main(String[] args) {
		//variable = Expression1 ? Expression2: Expression3
		
		int a = 10;
		int b = 20;
		
		int c = (a>b) ? (a+b) : (b-a);
		
		System.out.println(c);
		
	}

}