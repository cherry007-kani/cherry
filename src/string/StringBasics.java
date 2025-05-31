package string;

public class StringBasics {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "world";
		// concatenation
		String result = str1 + " "+ str2;
		System.out.println("concateation:"+ result);
		
		//length
		System.out.println("Length of str1:" + str1.length());
		
		//substring
		System.out.println(" substring of str2 from index 1: " + str2.substring(1));
		
		//Replacement
		System.out.println(" Replace 'l' with 'p' in str1: " + str1.replace('l', 'p'));
		
		//case conversion
		System.out.println(" Uppercase str1: " + str1.toUpperCase());
		System.out.println("Lowercase str2: " + str2.toLowerCase());
	}

}
