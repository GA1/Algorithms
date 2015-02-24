import java.util.Arrays;


public class KNearSorting {

	public Integer[] of(Integer[] A, int k) {
		if (A == null || A.length == 0)
			return A;
		for (int i = k; i < A.length; i = i + k + 1) {
			int start = i - k;
			int end = Math.min(i + k + 1, A.length);
			Arrays.sort(A, start, end);			
		}
		return A;
	}

	
}
