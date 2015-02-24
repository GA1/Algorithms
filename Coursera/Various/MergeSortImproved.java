
public class MergeSortImproved implements Sorting{

	public static void main(String[] args) {
		int c = 1;
		System.out.println(c++ + 5);
		System.out.println(c);
	}
	
	@Override
	public Integer[] of(Integer[] A) {
		if (A == null)
			return null;
		Integer[] aux = copyArray(A, 0, A.length);
		mergeSort(A, aux, 0, A.length);
		return aux;
	}

	
		void mergeSort(Integer[] toSort, Integer[] aux, int start, int end) {
			if (end - start <= 1)
				return;
			else {				
				int mid = start + (end - start) / 2;
				mergeSort(aux, toSort, start, mid);
				mergeSort(aux, toSort, mid, end);
				merge(toSort, aux, start, mid, end);
			}			
		}
		
		Integer[] copyArray(Integer[] A, int start, int end) {
			Integer[] copied = new Integer[end - start];
			for (int i = 0; i < end - start; i++) 
				copied[i] = A[start + i];
			return copied;
		}

		void merge(Integer[] input, Integer[] output, int start, int mid, int end) {
			int length1 = mid - start;
			int length2 = end - mid;			
			if (input[mid-1] > input[mid]) {
				int i = 0;
				int j = 0;
				while (i < length1 && j < length2) {
					if (input[start + i] < input[start + length1 + j]) { 
						output[start + i + j] = input[start + i];
						i++;
					}
					else {
						output[start + i + j] = input[start + length1 + j];
						j++;
					}
				}
				while (i < length1) {
					output[start + length2 + i] = input[start + i];
					i++;
				}
				while (j < length2) {
					output[start + length1 + j] = input[start + length1 + j];
					j++;
				}
			}
		}
	
}
