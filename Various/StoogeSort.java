
public class StoogeSort implements Sorting{

	@Override
	public Integer[] of(Integer[] A) {
		if (A == null || A.length <= 1)
			return A;
		sort(A, 0, A.length-1);
		return A;
	}

		private void sort(Integer[] A, Integer start, Integer end) {
			if (A[start] > A[end])
				swap(A, start, end);
			if (end - start <= 1)
				return;
			
//			int length = end - start;
//			Integer oneThird = length / 3;	
//			Integer twoThirds = 2*length / 3;
//			sort (A, start, start + twoThirds);
//			sort (A, start + oneThird + 1, start + length);
//			sort (A, start, start + twoThirds);		
			
			int length = end - start + 1;
			Integer oneThird = length / 3;	
			sort (A, start, end - oneThird);
			sort (A, start + oneThird, end);
			sort (A, start, end - oneThird);
		}
			private void swap(Integer[] A, Integer i, Integer j) {
				Integer temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
	
			
}
