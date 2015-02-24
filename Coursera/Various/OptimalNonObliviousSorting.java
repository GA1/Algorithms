
public class OptimalNonObliviousSorting {

	public static int[] of5(int[] A) {
		if (A[0] > A[1]) {
			swap(A, 0, 1);
		}		
		if (A[0] > A[1]) {
			swap(A, 0, 1);
		}
		return A;
	}
	

	private static void swap(int[] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;		
	}
}


//Write a program that sorts 5 inputs using only 7 comparisons. Hint: First compare the first two numbers, the second two numbers,
//and the larger of the two groups, and label them so that a < b < d and c < d. Second, insert the remaining item e into its proper 
//place in the chain a < b < d by first comparing against b, then either a or d depending on the outcome. Third, insert c into the proper 
//place in the chain involving a, b, d, 
//and e in the same manner that you inserted e (with the knowledge that c < d). This uses 3 (first step) + 2 (second step) + 2 (third step) = 7 c
//omparisons. This method was first discovered by H. B. Demuth in 1956.
