
public class Sort2distinct {

	public Integer[] of(Integer[] A) {
		if (A.length == 0)
			return A;
		int low = 0;
		int high = A.length - 1;
		while (low <= high) {
			if (A[low] == 1) {
				low++;
			} else {
				swap(A, low, high--);
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

//l     h
//3 3 1 1
//l   h
//1 3 1 3
//  l h
//1 3 1 3
//  
//1 3 1 3