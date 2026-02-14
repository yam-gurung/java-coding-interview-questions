package javacodinginterviewpractice;

public class StringContainsVowel {

	public static void main(String[] args) {
		String str="ppaa";
		
		System.out.println(str+" contains vowel "+stringContainsVowel(str));
		
	}
	
	private  static boolean stringContainsVowel(String str) {
		if(str.toLowerCase().matches(".*[aeiou].*"))
			return true;
		return false;
	}

}
