import java.util.Arrays;


public class SumOf3 {

	
	public static boolean has0SumI(Integer[] A, Integer[] B, Integer[] C) {
		if (A == null || B == null || C == null)
			return false;
		Integer[] allSums = allPossibleSums(A, B);
		int temp;
		for(int i = 0; i < C.length; i++) {
			temp = C[i];
			if (binarySearch(allSums, -temp) != -1)
				return true;
		}
		return false;
	}
	
	static Integer[] findTheShortest(Integer[] A, Integer[] B, Integer[] C) {
		if (C.length <= A.length && C.length <= B.length)
			return C;
		else if (B.length <= A.length && B.length <= C.length)
			return B;
		else 
			return A;		
	}
	
	static Integer[] findTheLongest(Integer[] A, Integer[] B, Integer[] C) {
		if (C.length >= A.length && C.length >= B.length)
			return C;
		else if (B.length >= A.length && B.length >= C.length)
			return B;
		else 
			return A;		
	}
	
	static Integer[] findMedium(Integer[] A, Integer[] B, Integer[] C) {
		if (C.length >= A.length && C.length >= B.length)
			return C;
		else if (B.length >= A.length && B.length >= C.length)
			return B;
		else 
			return A;		
	}
	
	
	static Integer[] allPossibleSums(Integer[] A, Integer[] B) {
		Integer[] result = new Integer[A.length*B.length];
		for (int i = 0; i < A.length; i++)
			for (int j = 0; j < B.length; j++)
				result[j*A.length + i] = A[i] + B[j];
		Arrays.sort(result);
		return result;		
	}

	static int binarySearch(Integer[] A, int toFind) {
		if (A == null)
			return -1;
		int start = 0;
		int end = A.length - 1;
		int mid;
		while (start <= end) {
			mid = start + (end - start) / 2;
			if (A[mid] == toFind) 
				return mid;
			else if (A[mid] < toFind) 
				start = mid + 1;
			else 
				end = mid - 1;
		}
		return -1;		
		
 	}
}
