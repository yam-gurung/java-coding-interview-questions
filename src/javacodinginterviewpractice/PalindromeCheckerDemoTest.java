package javacodinginterviewpractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PalindromeCheckerDemoTest {

	private PalindromeCheckerDemo checker;
	
	@BeforeEach
	public void setUp() {
		checker = new PalindromeCheckerDemo();
	}
	
	@Test
	@DisplayName("Positive cases for palindrom")
	void testisPalindrome_PositiveCases() {
		assertTrue(checker.isPalindrome_Alg1("madam"),"'madam' should be palindrom");
		assertTrue(checker.isPalindrome_Alg1("racecar"),"'racecar' should be a palindrome");
	}
	
	@Test
	@DisplayName("Negative cases for non-palindromes")
	void testIsPalindrome_NegativeCases() {
		assertFalse(checker.isPalindrome_Alg1("hello"),"'hello' should not be a palindrome");
		assertFalse(checker.isPalindrome_Alg1("world"),"'world' should not be a palindrome");
	}
	
	@Test
	@DisplayName("Edge cases")
	void testIsPalindrome_EdgeCases() {
		assertTrue(checker.isPalindrome_Alg1("a"),"Single character should be a palindrome");
		assertTrue(checker.isPalindrome_Alg1("ab a"),"String with spaces should be handled");
		assertTrue(checker.isPalindrome_Alg1(null),"Null string should return false");
		
	}

}
