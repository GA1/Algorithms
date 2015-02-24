
public class FindDuplicate {

	public boolean of(int[] A) {
		
		for(int i = 0; i < A.length; i++) {
			if (A[Math.abs(A[i])-1] > 0) {
				A[Math.abs(A[i])-1] = - A[Math.abs(A[i])-1];
			} else {
				return true;
			}
		}		
		return false;
	}
	
}
