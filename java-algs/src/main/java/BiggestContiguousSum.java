import java.util.Arrays;


public class BiggestContiguousSum {

	public static Integer of(int[] A, int toFind) {
		if (A == null || A.length == 0)
			return null;
		else {
			int tempSum = 0;
			Arrays.sort(A);
			int closeToZero = find0OrClosestToZero(A);
			int i = closeToZero; 
			int j = closeToZero;
			int bestDiff = 1000000000;
			while (true) {
				if (j < A.length && tempSum < toFind) {
					tempSum += A[j++];
					if (Math.abs(tempSum) < bestDiff)
						bestDiff = tempSum;
				} else if(i >= 0 && tempSum > toFind) {
					tempSum += A[i--];
					if (Math.abs(tempSum) < bestDiff)
						bestDiff = tempSum;
				} else if (tempSum == toFind) 
					return tempSum;					
				else 
					break;
			}
			return tempSum;
		}
	}
	
	static int find0OrClosestToZero(int[] A) {
		if (A == null || A.length == 0)
			return -1;
		int start = 0;
		int end = A.length - 1;
		int best = -1;
		int lastDiff = 1000000000;
		int tempDiff;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (A[mid] == 0)
				return mid;
			else if (A[mid] < 0) {
				start = mid + 1;
				tempDiff = Math.abs(A[mid]);
				if (tempDiff < lastDiff || best == -1) {
					lastDiff = tempDiff;
					best = mid;
				}				
			}
			else {
				tempDiff = Math.abs(A[mid]);
				if (tempDiff < lastDiff || best == -1) {
					lastDiff = tempDiff;
					best = mid;
				}
				end = mid - 1;
			}
		}
		return best;
	}
}