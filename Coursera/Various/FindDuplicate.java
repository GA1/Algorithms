//Find a duplicate. Given an array of N elements in which each element is an integer between 1 and N, 
//write an algorithm to determine if there are any duplicates. Your algorithm should run in linear time 
//and use O(1) extra space. Hint: you may destroy the array.

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
