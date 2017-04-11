
public class MergeSort implements Sorting{

	public Integer[] of(Integer[] A) {
		if (A == null)
			return null;
		mergeSort(A, 0, A.length);
		return A;
	}

	
	private void mergeSort(Integer[] toSort, int start, int end) {
		if (end - start <= 1)
			return;
		else {
			int mid = start + (end - start) / 2;
			mergeSort(toSort, start, mid);
			mergeSort(toSort, mid, end);
			merge(toSort, start, end);
		}
	}
		
	Integer[] copyArray(Integer[] A, int start, int end) {
		Integer[] copied = new Integer[end - start];
		for (int i = 0; i < end - start; i++)
			copied[i] = A[start + i];
		return copied;
	}

	void merge(Integer[] toMerge, int start, int end) {
		int length = end - start;
		int length1 = length/2;
		int length2 = length - length1;
		int i = 0;
		int j = 0;
		Integer[] copied = copyArray(toMerge, start, end);
		while (i < length1 && j < length2) {
			if (copied[i] < copied[length1 + j]) {
				toMerge[start + i + j] = copied[i];
				i++;
			}
			else {
				toMerge[start + i + j] = copied[length1 + j];
				j++;
			}
		}
		while (i < length1) {
			toMerge[start + i + length2] = copied[i];
			i++;
		}
		while (j < length2) {
			toMerge[start + j + length1] = copied[length1 + j];
			j++;
		}
	}

}
