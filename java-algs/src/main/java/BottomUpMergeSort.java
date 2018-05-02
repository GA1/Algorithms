
public class BottomUpMergeSort implements Sorting {

	@Override
	public Integer[] of(Integer[] A) {
		if (A == null)
			return null;
		if (A.length < 2)
			return A;
		for (int i = 1; i <= A.length; i*=2) 
			for (int j = 0; j + i < A.length; j+= 2*i) {
				int start = j;
				int end = Math.min(start + 2*i, A.length);
				int mid = start + i;
//				System.out.println(end-start);
				merge(A, start, mid, end);
			}
		return A;
	}

		void merge(Integer[] toMerge, int start, int mid, int end) {		
			int i = 0;
			int j = mid - start;
			int k = start;
			Integer[] copied = copyArray(toMerge, start, end);
			while (k < end) {
				if (i >= mid - start) 
					toMerge[k++] = copied[j++];
				else if (j >= end - start) 
					toMerge[k++] = copied[i++];
				else if (copied[i] < copied[j])
					toMerge[k++] = copied[i++];
				else 
					toMerge[k++] = copied[j++];
			}
		}
		
			Integer[] copyArray(Integer[] A, int start, int end) {
				Integer[] copied = new Integer[end - start];
				for (int i = 0; i < end - start; i++) 
					copied[i] = A[start + i];
				return copied;
			}
}
