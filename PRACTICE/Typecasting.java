/*
	TypeCasting
	
	1. Narrowing Casting
		double -> float -> long -> int -> char -> short -> byte
		
	2. Widening Casting
		byte -> short -> chat -> int -> long -> float -> double
	
*/

package practice;

public class Typecasting {
	
	public static void main(String[] args) {
		
		
		//Widening Casting
		int id = 101;
		float myId = id;
		
		System.out.println(myId);
		
		
		//Narrowing Casting
		float radius = 11.11F;
		int r = (int) radius;
		
		System.out.println(r);
		
	}

}