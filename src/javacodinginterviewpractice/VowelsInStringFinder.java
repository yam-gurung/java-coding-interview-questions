package javacodinginterviewpractice;

public class VowelsInStringFinder {
	
	public static void main(String[] args) {
		String str="bbpp";
		System.out.println(str+" contains Vowel: "+stringContainsVowel((str)));
	}
	
	private static boolean stringContainsVowel(String str) { 
		return str.toLowerCase().matches(".*[aeoiu].*");
	}

}
