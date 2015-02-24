
public class LongestRowOf0s {

	public static int of(int[][] A) {
		if (A == null)
			return -1;
	
		int i = 0;
		int j = A.length - 1;
		int best = 0;
		while (i < A.length && j >= 0) {
			if (A[i][j] == 0) {
				j--;
				best = i;
			}
			else
				i++;
		}
		return best;
			
	}

}
