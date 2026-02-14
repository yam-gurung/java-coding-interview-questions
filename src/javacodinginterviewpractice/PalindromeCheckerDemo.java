package javacodinginterviewpractice;

public class PalindromeCheckerDemo {

	public static void main(String[] args) {
		
		String string="madam";
		
		if(isPalindrome_Alg2(string)) {
			System.out.println(string+" is a palindrome");
		}else {
			System.out.println(string+" is not a palindrome");
		}
		
	}
	
	private static boolean isPalindrome_Alg2(String str) {

		StringBuilder strBuilder=new StringBuilder(str);
		StringBuilder reversedBuilder = new StringBuilder();
		int charpos = 0;
		for(int i=str.length()-1;i<=0;i++) {
			
			reversedBuilder.setCharAt(charpos, strBuilder.charAt(i));
			charpos++;
		}
		String reversedStr=reversedBuilder.toString();
		return str.equals(reversedStr);
	}

	static boolean isPalindrome_Alg1(String str) {
	
		/*
		madam word should be same when read from left to right and right to left character wise
		reverse word from right to left and if matches with original word then its palindrome
		*/
		
		/*
		temp=charfromendcharpos
		endcharpos=charfromfirstcharpos
		firstchar=temp
		*/

		char[] originalCharArray = str.toCharArray();
		char[] reverseCharArray=new char[str.length()];
		int firstcharpos=0;
		
		for(int i=str.length()-1;i>=0;i--) {
			reverseCharArray[firstcharpos]=originalCharArray[i];
			firstcharpos++;
		}
		
		return new String(reverseCharArray).equals(str);
	}

}
