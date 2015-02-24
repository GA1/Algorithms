
public class MergeWithLogNComparisons {

	public Integer[] merge(Integer[] A, Integer[] B) {
		int newLength = A.length + B.length;
		Integer[] result = new Integer[newLength];
		int k = 0;
		int i = 0;
		int j = 0;
		while (k < newLength) {
			if (i == A.length) {
				while (j < B.length)
					result[k++] = B[j++];
			} else if (j == B.length) {
				while (i < A.length)
					result[k++] = A[i++];
			} else if (A[i] < B[j]) 
				result[k++] = A[i++];
			else
				result[k++] = B[j++];
		}
		return result;
	}

}
