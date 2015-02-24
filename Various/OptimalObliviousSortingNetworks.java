
public class OptimalObliviousSortingNetworks {

	public static int[] of4(int[] A) {
		if (A[0] > A[3]) {
			swap(A, 0, 3);
		}
		if (A[1] > A[2]) {
			swap(A, 1, 2);
		}
		if (A[2] > A[3]) {
			swap(A, 2, 3);
		}
		if (A[0] > A[1]) {
			swap(A, 0, 1);
		}
		if (A[1] > A[2]) {
			swap(A, 1, 2);
		}
		return A;
	}
	
	private static void swap(int[] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;		
	}

	public static int[] of5(int[] B) {
		if (B[0] > B[4]) {
			swap(B, 0, 4);
		}
		if (B[0] > B[2]) {
			swap(B, 0, 2);
		}
		if (B[2] > B[4]) {
			swap(B, 2, 4);
		}
		if (B[1] > B[2]) {
			swap(B, 1, 2);
		}
		if (B[2] > B[3]) {
			swap(B, 2, 3);
		}
		return B;
	}

}
