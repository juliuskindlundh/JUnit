import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class JUnitLab {
	
	/*
	 * Test "add" with assertEquals
	 */
	@Test
	void add() {
		System.out.println("Testing \"add\"");
		Calc c = new Calc();
		
		int result = c.add(1, 1);
		
		assertEquals(result,2);
	}
	
	/*
	 * Test "add" failing with assertEquals
	 */
	@Test
	void addFail() {
		System.out.println("Testing \"add\"");
		Calc c = new Calc();
		
		int result = c.add(1, 1);
		
		assertEquals(result,0);
	}
	
	/*
	 * Test "or" with assertTrue and assertFalse
	 */
	@Test
	void or() {
		System.out.println("Testing \"or\"");
		Calc c = new Calc();
		
		//generate the results for all possible inputs
		boolean r1 = c.or(true, true);
		boolean r2 = c.or(true, false);
		boolean r3 = c.or(false, true);
		boolean r4 = c.or(false, false);
		
		// test the results 
		assertTrue(r1);
		assertTrue(r2);
		assertTrue(r3);
		assertFalse(r4);
		
	}
	
	@Test
	void orFail() {
		System.out.println("Testing \"or\"");
		Calc c = new Calc();
		
		boolean r1 = c.or(true, true);
		boolean r2 = c.or(true, false);
		boolean r3 = c.or(false, true);
		boolean r4 = c.or(false, false);
		
		assertFalse(r1);
		assertFalse(r2);
		assertFalse(r3);
		assertTrue(r4);
	}
	/*
	 * Test "isPalindrome" on a string that is a palindrome
	 */
	@Test
	void isPalindrome() {
		System.out.println("Testing \"isPalindrome\"");
		String str = "qwerrewq";
		Calc c = new Calc();
		
		boolean result = c.isPalindrome(str);
		
		assertTrue(result);
	}
	
	/*
	 * Test "isPalindrome" on a string that is not a palindrome
	 */
	@Test
	void isPalindromeFail() {
		System.out.println("Testing \"isPalindrome\"");
		String str = "qwerrewq1234";
		Calc c = new Calc();
		
		boolean result = c.isPalindrome(str);
		
		assertTrue(result);
	}
	
	@BeforeAll
	static void initAll() {
		//do nothing
	}
	
	@BeforeAll
	static void init() {
		//do nothing
	}
	
	@AfterEach
	void tearDown() {
		//do nothing
	}
	
	@AfterAll
	static void tearDownAll() {
		//do nothing
	}
	
	

}
