import java.util.HashMap;


public class ConvolutionSum {

	public static boolean of(int[] A) {
		if (A == null)
			return false;
		
		HashMap<Integer, Boolean> mapka = new HashMap<Integer, Boolean>();
		for (int i = 0; i < A.length; i++) {
			mapka.put(A[i], true);
		}
		int suma;
		for(int i = 0; i < A.length; i++) {
			for(int j = 0; j < A.length; j++) {
				suma = A[i] + A[j];
				if (mapka.containsKey(suma))
					return true;
			}	
		}		
		return false;		
	}

}
