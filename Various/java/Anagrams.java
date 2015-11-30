import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class Anagrams {

	public String[] of(String[] A) {
		if (A == null)
			return null;
		
		ArrayList<wordAndItsSort> wordsAndTheirSorts = convertToWordsAndTheirSorts(A);
		sortWordsAndItsSortsBySorts(wordsAndTheirSorts);			
		ArrayList<String> anagrams = extractAnagrams(wordsAndTheirSorts);		
		return anagrams.toArray(new String[0]);				
	}

		ArrayList<wordAndItsSort> convertToWordsAndTheirSorts(String[] A) {
			char[] chars;
			String word;
			String sortedWord;
			ArrayList<wordAndItsSort> wordsAndTheirSorts = new ArrayList<wordAndItsSort>(); 
			for (int i = 0; i < A.length; i++) {
				word = A[i];
				chars = word.toCharArray();
				Arrays.sort(chars);
				sortedWord = new String(chars);
				wordsAndTheirSorts.add(new wordAndItsSort(word, sortedWord));
			}
			return wordsAndTheirSorts;
		}
		
		void sortWordsAndItsSortsBySorts(ArrayList<wordAndItsSort> wordsAndTheirSorts) {
			Collections.sort(wordsAndTheirSorts, new Comparator<wordAndItsSort>() {			
				@Override
				public int compare(wordAndItsSort w1, wordAndItsSort w2) {
					return w1.sortedWord.compareTo(w2.sortedWord);
				}
			});
		}

		ArrayList<String> extractAnagrams(ArrayList<wordAndItsSort> wordsAndTheirSorts) {
			ArrayList<String> anagrams = new ArrayList<String>();
			
			wordAndItsSort currWord = null;
			wordAndItsSort prevWord = null;
			int i = 1;
			boolean isPreviousTheSame = false;
			while (i < wordsAndTheirSorts.size()) {
				currWord = wordsAndTheirSorts.get(i);
				prevWord = wordsAndTheirSorts.get(i - 1);
				if (currWord.sortedWord.equals(prevWord.sortedWord)) {
					isPreviousTheSame = true;
					anagrams.add(prevWord.word);
				} else if (!currWord.sortedWord.equals(prevWord.sortedWord) && isPreviousTheSame) {
					anagrams.add(prevWord.word);
					isPreviousTheSame = false;
				} else {
					 isPreviousTheSame = false;
				}
				i++;
			}
			if (isPreviousTheSame)
				anagrams.add(currWord.word);
			return anagrams;
		}
	
			
		static class wordAndItsSort {
			
			String word;
			String sortedWord;
			
			public wordAndItsSort(String word, String sortedWord) {
				this.word = word;
				this.sortedWord = sortedWord;
			}
			
			@Override
			public String toString() {
				return "(" + word + ", " + sortedWord + ")";
			}					

			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				wordAndItsSort other = (wordAndItsSort) obj;
				if (sortedWord == null) {
					if (other.sortedWord != null)
						return false;
				} else if (!sortedWord.equals(other.sortedWord))
					return false;
				if (word == null) {
					if (other.word != null)
						return false;
				} else if (!word.equals(other.word))
					return false;
				return true;
			}
		}

}
