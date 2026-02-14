package javacodinginterviewpractice;

public class ReverseStringManagement {

	public static void main(String[] args) {
		String word="ball";
		String reversedWord = reverseString(word);
		System.out.println("reversedword for "+word+" is : "+reversedWord);
	}
	
	// reverse string by appending char from end of the string using append func
	// in StringBuilder class
	private static String reverseString(String str) {
		String reversedStr = null;
		StringBuilder builder = new StringBuilder();
		for(int i=str.length()-1;i>=0;i--) {
			builder.append(str.charAt(i));
		}
		reversedStr = builder.toString();
		return reversedStr;
	}
	
	// reverse string by using reverse function in StringBuilder class
	/*private static String reverseString(String str) {
		String reversedStr = null;
		StringBuilder builder = new StringBuilder(str);
		reversedStr = builder.reverse().toString();
		
		return reversedStr;
	}*/
	
	// reverse string by swapping char from both ends using StringBuilder class
	/*private static String reverseString(String str) {
		String reversedStr = null;
		StringBuilder builder = new StringBuilder(str);
		int first = 0, last = str.length() - 1;
		
		while(first < last ) {
			char temp;
			temp = str.charAt(last);
			builder.setCharAt(last, str.charAt(first));
			builder.setCharAt(first, temp);
			first ++;
			last --;
		}
		reversedStr = builder.toString();
		return reversedStr;
	}*/

}
