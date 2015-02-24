package algs;


public class RSelect {

	private int SORTING_CONST = 5;
	private Partitioner partitioner = new Partitioner();
	
	public Integer rSelect(Integer[] A, int which) {
		return rSelect(A, which, 0, A.length);
	}

		private Integer rSelect(Integer[] A, int which, int start, int stop) {
			groupAndSort(A);
			Integer[] medians = extractMedians(A);
			int medianOfMedians = rSelect(medians, medians.length/2, 0, medians.length);
			if (which < medianOfMedians/2)  
				return rSelect(removeUpperPart(A), medians.length/2, 0, medians.length);
			else 
			return -1;
		}

		private Integer[] extractMedians(Integer[] A) {
			int numberOfMedians = A.length/SORTING_CONST;
			Integer[] medians = new Integer[numberOfMedians]; 
			for (int i = 0; i < numberOfMedians; i++)  
				medians[i] = A[i*SORTING_CONST + SORTING_CONST/2];
			return medians;
		}

		private void groupAndSort(Integer[] A) {
			int clusters = A.length/SORTING_CONST;
			for (int i = 0; i < clusters; i += i)
				sort(A, i*SORTING_CONST, i*SORTING_CONST + SORTING_CONST);
		}

			void sort(Integer[] A, int start, int to) {
				for (int i = 0; i < SORTING_CONST; i++) 
					for (int j = start; j < to - i - 1; j++) {
						if (A[j] > A[j + 1])
							swap(A, j, j + 1);
					}
			}

			private void swap(Integer[] A, int i, int j) {
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}

}
