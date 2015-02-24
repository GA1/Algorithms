
public class SecondSmallest {
	
	
	public int of(int[] A) {
		int smallest = -1;
		int secondSmallest = -1;
		for(int i = 0; i < A.length; i++) {
			if(smallest < 1) {
				
			}
		}
		return -1;
	}
	
		private int[] firstPhaseOfTournament(int[] A) {
			int sizeOfFirstPhase = biggestPowerOf2LowerThan(A.length);
			int numberOfWrestles = A.length - sizeOfFirstPhase;
			int[] firstPhase = new int[]{sizeOfFirstPhase};
			return firstPhase; 
		}
		
			private int biggestPowerOf2LowerThan(int limit) {
				int powerOf2 = 1;
				while(powerOf2 <= limit) {
					powerOf2 *= 2;
				}
				return powerOf2;
			}
	
//		private class tournamentTree() {
//			
//		}
}
