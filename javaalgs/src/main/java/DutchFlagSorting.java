
public class DutchFlagSorting {

	public Integer[] of(Integer[] A) {
		if (A.length == 0)
			return A;
		int low = 0;
		int mid = 0;
		int high = A.length - 1;
		while (mid <= high) {
			if (A[mid] == 1) {
				swap(A, mid++, low++);
			} else if(A[mid] == 3) {
				swap(A, mid, high--);
			} else {
				mid++;
			}
		}
		return A;
	}
		private void swap(Integer[] A, int i, int j) {
			int temp = A[i];
			A[i] = A[j];
			A[j] = temp;
		}
	
}
