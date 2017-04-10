import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PalindromeCheckerTest {

	PalindromeChecker palindromeChecker = new PalindromeChecker();
	String A;
	
	@Test
	public void test010() {
		A = "";
		assertEquals("", palindromeChecker.of(A));
	}

	@Test
	public void test015() {
		A = "";
		assertEquals("", palindromeChecker.of(null));
	}
	
	@Test
	public void test020() {
		A = "z";
		assertEquals("z", palindromeChecker.of(A));
	}
	
	@Test
	public void test025() {
		A = "aza";
		assertEquals("aza", palindromeChecker.of(A));
	}
	
	@Test
	public void test030() {
		A = "zzz";
		assertEquals("zzz", palindromeChecker.of(A));
	}
	

	@Test
	public void test050() {
		A = "abaca";
		assertEquals("aba", palindromeChecker.of(A));
	}
	
	@Test
	public void test090() {
		A = "babcbad";
		assertEquals("abcba", palindromeChecker.of(A));
	}
	
	@Test
	public void test100() {
		A = "dabcbab";
		assertEquals("abcba", palindromeChecker.of(A));
	}
	
	
	@Test
	public void test023() {
		A = "zz";
		assertEquals("zz", palindromeChecker.of(A));
	}
	
	@Test
	public void test027() {
		A = "az";
		assertEquals("a", palindromeChecker.of(A));
	}

	@Test
	public void test035() {
		A = "zzzz";
		assertEquals("zzzz", palindromeChecker.of(A));
	}
	
	@Test
	public void test040() {
		A = "abcba";
		assertEquals("abcba", palindromeChecker.of(A));
	}
	
	@Test
	public void test070() {
		A = "cca";
		assertEquals("cc", palindromeChecker.of(A));
	}

	@Test
	public void test080() {
		A = "cca";
		assertEquals("cc", palindromeChecker.of(A));
	}
	
	@Test
	public void test095() {
		A = "babcbad";
		assertEquals("abcba", palindromeChecker.of(A));
	}
	
	@Test
	public void test097() {
		A = "abcdefedcb";
		assertEquals("bcdefedcb", palindromeChecker.of(A));
	}
	
	
	
}
