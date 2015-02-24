
public class ImprovedMerge {

	public Integer[] of(Integer[] A, Integer[] B) {
		Integer[] C = new Integer[A.length + B.length];
		int start = 0;
		int temp = -1;
		int k = 0;
		int index = -1;
		for (int i = 0; i < B.length; i++) {
			start = temp + 1;
			index = binarySearch(A, start, A.length - 1, B[i]);
			if (index != -1)
				temp = index;
			if (index != -1) 
				for (int j = start; j <= index; j++) 
					C[k++] = A[j];
			C[k++] = B[i];
		}
		for (int m = temp + 1; m < A.length; m++) 
			C[k++] = A[m];
		return C;
	}

	int binarySearch(Integer[] A, int start, int end, int toFind) {
		if (A.length == 0)
			return - 1;
		int mid;
		int best = -1;
		while (start <= end) {
			mid = start + (end - start)/2;
			if (A[mid] < toFind) {
				start = mid + 1;				
				best = mid;
			} else if (A[mid] > toFind) {
				end = mid - 1;
			} else {
				return mid;
			}
		}
		return best;		
	}
}
