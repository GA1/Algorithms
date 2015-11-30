
public class BinarySearchInRotatedList {

	public boolean of(int[] A, int toFind) {
		assert isRotated(A);
		
		int leapIndex = binarySearchForLeap(A);
		int result; 
		result = binarySearchInSortedArray(A, toFind, 0, leapIndex - 1);
		if (result != -1)
			return true	;
		result = binarySearchInSortedArray(A, toFind, leapIndex, A.length - 1);
		if (result != -1)
			return true;
		return false;
	}
	
	public int binarySearchInSortedArray(int[] A, int toFind, int start, int end) {
		if (A == null || A.length == 0)
			return -1;
		int mid;
		while(start <= end) {
			mid = start + (end - start)/2;
			if (A[mid] == toFind) 
				return mid;
			else if (A[mid] < toFind)
				start = mid + 1;
			else
				end = mid - 1;
				
		}
		return -1;
	}
	
	public int binarySearchForLeap(int[] A) {
		assert isRotated(A);
		
		int start = 0;
		int end = A.length - 1;
		int mid;
		while(start <= end) {
			mid = start + (end - start)/2;
			if (mid < A.length - 1) 
				if (A[mid] > A[mid + 1])
					return mid + 1;							
			if (A[mid] < A[A.length -1 ])
				end = mid;
			else
				start = mid;
				
		}
		return -1;
	}
	
	
		public boolean isRotated(int[] A) {
			if (A == null || A.length == 0)
				return false;
			int leapIndex = findLeapIndexLinearly(A);
			if (leapIndex == -1) 
				return false;
			if (A[0] < A[A.length - 1])
				return false;
			return isSorted(A, findLeapIndexLinearly(A), A.length - 1);
		}
	
			int findLeapIndexLinearly(int[] A) {
				for(int i = 0; i < A.length - 1; i++)
					if (A[i] > A[i + 1])
						return i + 1;
				return -1;
			}
		
			boolean isSorted(int[] A, int start, int end) {	
				for(int i = start; i < end; i++)
					if (A[i] > A[i + 1])
						return false;
				return true;
			}


}
