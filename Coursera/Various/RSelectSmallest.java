
public class RSelectSmallest {

	private static Partitioner partitioner = new Partitioner(); 
	
	public int select(Integer[] A, int n) {
		int pivotIndex = -1;
		int start = 0;
		int end = A.length-1;
		while (true) {
			pivotIndex = partitioner.partitionWhenPivotAtStart(A, start, end);
			if (pivotIndex + 1 == n) 
				return A[pivotIndex];
			else if (pivotIndex < n)
				start = pivotIndex + 1;
			else 
				end = pivotIndex - 1;
		}
	}

}
