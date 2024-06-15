package string;

public class StringDeclaration {
	
	public static void main(String[] args) {
		
		String name = "MIRAL";
		System.out.println("String Literals : " + name);
		
		char nm[] = {'M', 'I', 'R', 'A', 'L'};
		String arr = new String(nm);
		System.out.println("String Array : " + arr);
		
		String obj = new String("MIRAL");
		System.out.println("String Object : " + obj);
		
	}

}