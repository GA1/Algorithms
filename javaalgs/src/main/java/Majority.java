
public class Majority {

	
	public int of(int[] A) {
		int i = 0;
		int j = A.length-1;
		int majority = -1;
		int tempMajority = -1;
		int[] B = copyArray(A);
		while(i < j) {
			if(A[i] != A[j]) {
				B[i] = -1;
				B[j] = -1;
				i++;
				j--;
			} else {
				j--;
			}
		}
		for(int k = 0; k < A.length; k++) {
			if(B[k] != -1) {
				tempMajority = A[k];
				break;
			}
		} 
		int counter = 0;
		for(int k = 0; k < A.length; k++) {
			if (A[k] == tempMajority) {
				counter++;
			}
		}
		if(counter > A.length/2) {
			majority = tempMajority;
		}
		return majority;
	}
	
		private int[] copyArray(int[] A) {
			int[] B = new int[A.length];
			for(int i = 0; i < A.length; i++) {
				B[i] = A[i]; 
			}
			return B;
		}
}

//
//public class Majority {
//
//	
//	public int of(int[] A) {
//		int i = 0;
//		int j = 1;
//		int majority = -1;
//		int tempMajority = -1;
//		while(i < A.length && j < A.length) {
//			if(A[i] != A[j]) {
//				A[i] = -1;
//				A[j] = -1;
//				i = j + 1;
//				j = j + 2;
//			} else {
//				j++;
//			}
//		}
//		for(int k = 0; k < A.length; k++) {
//			if(A[k] != -1) {
//				tempMajority = A[k];
//			}
//		} 
//		int counter = 0;
//		for(int k = 0; k < A.length; k++) {
//			if (A[k] == tempMajority) {
//				counter++;
//			}
//		}
//		if(counter > A.length/2) {
//			majority = tempMajority;
//		}
//		return majority;
//	}
//	
//	
//}
//
