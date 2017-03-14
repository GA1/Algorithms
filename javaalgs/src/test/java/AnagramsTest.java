import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class AnagramsTest {
	
	Anagrams anagrams = new Anagrams();
	String[] A;
	private List<String> result;
	ArrayList<Anagrams.wordAndItsSort> wordsAndTheirSorts, W1, W2;
	
	@Test
	public void test010() {
		A = new String[]{};
		assertNull(anagrams.of(null));
	}
	
	@Test
	public void test020() {
		A = new String[]{};
		assertEquals(new ArrayList<String>(), Arrays.asList(anagrams.of(A)));
	}
	
	@Test
	public void test030() {
		A = new String[]{"demoniac"};
		assertEquals(new ArrayList<String>(), Arrays.asList(anagrams.of(A)));
	}

	@Test
	public void test040() {
		A = new String[]{"demoniac", "comedian"};
		assertEquals(Arrays.asList(new String[]{"demoniac", "comedian"}), Arrays.asList(anagrams.of(A)));
	}
	
	@Test
	public void test045() {
		A = new String[]{"demoniac", "comedian", "diancome"};
		assertEquals(Arrays.asList(new String[]{"demoniac", "comedian", "diancome"}), Arrays.asList(anagrams.of(A)));
	}
	
	@Test
	public void test047() {
		A = new String[]{"demoniac", "comedian", "diancome", "abc", "bca"};
		assertEquals(Arrays.asList(new String[]{"abc", "bca", "demoniac", "comedian", "diancome"}), Arrays.asList(anagrams.of(A)));
	}
	
	@Test
	public void test048() {
		A = new String[]{"demoniac", "comedian", "diancome", "abc", "bca", "ccc"};
		assertEquals(Arrays.asList(new String[]{"abc", "bca", "demoniac", "comedian", "diancome"}), Arrays.asList(anagrams.of(A)));
	}
	
	@Test
	public void test050() {
		A = new String[]{"abc", "cba", "bca"};
		result = Arrays.asList(new String[]{"abc", "cba", "bca"});
		assertEquals(result, Arrays.asList(anagrams.of(A)));
	}
	
		
	@Test
	public void test060() {
		A = new String[]{};
		wordsAndTheirSorts = new ArrayList<Anagrams.wordAndItsSort>();
		assertEquals(wordsAndTheirSorts, anagrams.convertToWordsAndTheirSorts(A));
	}
	
	@Test
	public void test075() {
		A = new String[]{"cba"};
		Anagrams.wordAndItsSort a = new Anagrams.wordAndItsSort("cba", "abc");
		wordsAndTheirSorts = new ArrayList<Anagrams.wordAndItsSort>();
		wordsAndTheirSorts.add(a);
		assertEquals(wordsAndTheirSorts, anagrams.convertToWordsAndTheirSorts(A));
	}
	
	@Test
	public void test070() {
		A = new String[]{"abc", "cba", "bca"};
		Anagrams.wordAndItsSort a = new Anagrams.wordAndItsSort("abc", "abc");
		Anagrams.wordAndItsSort b = new Anagrams.wordAndItsSort("cba", "abc");
		Anagrams.wordAndItsSort c = new Anagrams.wordAndItsSort("bca", "abc");
		wordsAndTheirSorts = new ArrayList<Anagrams.wordAndItsSort>();
		wordsAndTheirSorts.add(a);
		wordsAndTheirSorts.add(b);
		wordsAndTheirSorts.add(c);
		assertEquals(wordsAndTheirSorts, anagrams.convertToWordsAndTheirSorts(A));
	}
	
	@Test
	public void test080() {
		A = new String[]{};
		W1 = new ArrayList<Anagrams.wordAndItsSort>();
		W2 = new ArrayList<Anagrams.wordAndItsSort>();
		anagrams.sortWordsAndItsSortsBySorts(W1);
		assertEquals(W2, W1);
	}
	
	@Test
	public void test090() {
		A = new String[]{};
		W1 = new ArrayList<Anagrams.wordAndItsSort>();
		W2 = new ArrayList<Anagrams.wordAndItsSort>();
		Anagrams.wordAndItsSort a = new Anagrams.wordAndItsSort("cba", "abc");
		W1.add(a);
		W2.add(a);
		anagrams.sortWordsAndItsSortsBySorts(W1);
		assertEquals(W2, W1);
	}
	
	@Test
	public void test100() {
		A = new String[]{};
		W1 = new ArrayList<Anagrams.wordAndItsSort>();
		W2 = new ArrayList<Anagrams.wordAndItsSort>();
		Anagrams.wordAndItsSort a = new Anagrams.wordAndItsSort("abc", "abc");
		Anagrams.wordAndItsSort b = new Anagrams.wordAndItsSort("cba", "abc");
		Anagrams.wordAndItsSort c = new Anagrams.wordAndItsSort("bca", "abc");
		W1.add(a);
		W1.add(b);
		W1.add(c);
		W2.add(a);
		W2.add(b);
		W2.add(c);		
		anagrams.sortWordsAndItsSortsBySorts(W1);
		assertEquals(W2, W1);
	}
	
	@Test
	public void test110() {
		A = new String[]{};
		W1 = new ArrayList<Anagrams.wordAndItsSort>();
		W2 = new ArrayList<Anagrams.wordAndItsSort>();
		Anagrams.wordAndItsSort a = new Anagrams.wordAndItsSort("abc", "abc");
		Anagrams.wordAndItsSort b = new Anagrams.wordAndItsSort("cba", "abc");
		Anagrams.wordAndItsSort c = new Anagrams.wordAndItsSort("bca", "abc");
		W1.add(a);
		W1.add(b);
		W1.add(c);
		W2.add(a);
		W2.add(b);
		W2.add(c);		
		anagrams.sortWordsAndItsSortsBySorts(W1);
		assertEquals(W2, W1);
	}
	
	@Test
	public void test120() {
		A = new String[]{};
		W1 = new ArrayList<Anagrams.wordAndItsSort>();
		W2 = new ArrayList<Anagrams.wordAndItsSort>();
		Anagrams.wordAndItsSort a = new Anagrams.wordAndItsSort("bba", "abb");
		Anagrams.wordAndItsSort b = new Anagrams.wordAndItsSort("aba", "aab");
		Anagrams.wordAndItsSort c = new Anagrams.wordAndItsSort("cca", "acc");
		W1.add(a);
		W1.add(b);
		W1.add(c);
		W2.add(b);
		W2.add(a);
		W2.add(c);		
		anagrams.sortWordsAndItsSortsBySorts(W1);
		assertEquals(W2, W1);
	}
	
	
	
}
