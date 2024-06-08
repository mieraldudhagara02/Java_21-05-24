package operators_practice;

public class LogicalOperators {
	
	public static void main(String[] args) {
		
		int a = 11;
		int b = 1;
		
		//Logical AND
		System.out.println("Logical AND Opearator : "+((a>b)&&(a>10)));
		System.out.println("Logical AND Opearator : "+((a>b)&&(b<0)));
		
		
		//Logical OR
		System.out.println("Logical OR Operator : "+((a>b)||(a>10)));
		System.out.println("Logical OR Opearator : "+((a>b)||(b<0)));
		
		//Logical NOT
		System.out.println("Logical NOT Operator : "+(!(a>b)));
		System.out.println("Logical NOT Operator : "+(!(a<b)));
		
	}

}