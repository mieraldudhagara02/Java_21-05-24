package string;

public class StringMethods {
	
	public static void main(String[] args) {
		
		//String cartoon = "SHINCHAN_";
		//String cartoonOne = "DOREMON";
		//String cartoonTwo = "DOREMON";
		//String cartoonThree = "doremon";
		//String cartoonFour = "doremon shinchan";
		//String empty = "";
		
		//System.out.println(cartoon);
		
		
		
		/*
			-> returns the character at the specified index in a string
			
			char index = intro.charAt(0);
			System.out.println(index);
		*/
		
		
		
		/*
			-> concatenate a string to the end of another string
			
			System.out.println(cartoon.concat(cartoonOne));
		*/
		
		
		/*
		 	-> checks whether a string contains a sequence of characters or not
		 	
			System.out.println(cartoon.contains("SI"));		//false
			System.out.println(cartoonOne.contains("DOR"));	//true
		*/
		
		
		/*
			-> searches a string to find out if it contains the exact same sequence of characters in the specified string 
			
			System.out.println(cartoonOne.contentEquals("DORE"));		//false
			System.out.println(cartoonOne.contentEquals("DRE"));		//false
			System.out.println(cartoonOne.contentEquals("DOREMON"));	//true
		*/
		
		
		/*
			-> checks whether a string ends with the specified character
			
			System.out.println(cartoon.endsWith("n"));	//false
			System.out.println(cartoon.endsWith("_"));	//true
		*/
		
		
		/*
			-> compares two strings
			
			System.out.println(cartoon.equals(cartoonTwo));		//false
			System.out.println(cartoonOne.equals(cartoonTwo));	//true
			System.out.println(cartoonTwo.equals(cartoonThree)); //false
		*/		
		
		
		/*
			-> compares two strings, ignoring lower case and upper case differences
		 
			System.out.println(cartoonTwo.equalsIgnoreCase(cartoonThree)); //true
		*/
		
		
		/*
			-> returns the position of the first occurrence of specified character in a string 
			
			System.out.println(cartoonFour.indexOf("shinchan"));
		*/
		
		
		/*
			->returns the position of the first occurrence of specified character in a string 
		
			String intro = "My name is Miral Dudhagara. My Father Name is Shaileshbhai.";
			System.out.println(intro.lastIndexOf("is"));
		*/			
		
		
		/*
			-> checks whether a string is empty or not.
			
			System.out.println(empty.isEmpty());
		*/
		
		
		/*
			-> joins one or more strings with a specified separator
			
			SYNTAX:
			join(separator, elements)
			
			String fruits = String.join(" ", "Apple", "Banana", "Orange");
			System.out.println(fruits);
		*/
		
		
		/*
			-> replace a character
			
			System.out.println(cartoon.replace("I", "E"));
		*/
		
		
		/*
			SYNTAX:
			subSequence(int start, int end)
			- start : The index of the character at which the subsequence starts (required)
			- end	: The index after the last character of the subsequence (required)
			
			String intro = "My name is Miral.";
			System.out.println(intro.subSequence(11, 16));
		*/
		
		
		/*
			SYNTAX:
			subString(int start, int end)
			- start : The index of the character at which the subsequence starts (required)
			- end	: The index after the last character of the subsequence (optional)
					  If the end argument is not specified then the substring will end at the end of the string.
		
			String intro = "My name is Miral.";
			System.out.println(intro.subString(11, 16));
		 */
		
		
		/*
			String intro = "     My name is Miral.";
			System.out.println(intro.toString());
			System.out.println(intro.toUpperCase());
			System.out.println(intro.toLowerCase());
			System.out.println(intro.trim());
		*/
		
		
		/*
			-> checks whether a string starts with the specified character
			
			System.out.println(cartoon.startsWith("SHI"));	//true
			System.out.println(cartoon.startsWith("HI"));	//false
		*/
		
	}

}