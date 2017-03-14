
public class Monotone2dArray {

	public static boolean of(int[][] A, int toFind) {
		if (A == null)
			return false;
		int i = 0;
		int j = A[0].length-1;
		while(i < A.length && 0 <= j) {
			if (A[i][j] == toFind)
				return true;
			else if (toFind < A[i][j]) {
				j--;
			} else 
				i++;
		}
		return false;
	}
}
