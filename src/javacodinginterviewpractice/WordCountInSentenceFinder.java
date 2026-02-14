package javacodinginterviewpractice;

public class WordCountInSentenceFinder {

	public static void main(String[] args) {
			String str=" this is a good day today ";
			
			int countWord = countWordInSentence(str);
			System.out.println("total words is: "+countWord);
	}
	
	/*
	 * \s is for space character
	 * + is for repeated space character
	 * \ is for the escaping space character
	 * trim() method removes space at the beginning and end of string
	 * 
	 */
	private static int countWordInSentence(String str) {
		return str.trim().split("\\s+").length;
	}
	
}
