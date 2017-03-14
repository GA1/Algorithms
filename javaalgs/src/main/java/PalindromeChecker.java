
public class PalindromeChecker {

	
	
	public String of(String s) {		
		if (s == null || s.length() == 0) {
			return "";
		}
		
		s = interleaveStringWithHashes(s);	
		
		int[] radiuses = new int[s.length()];
		int tempCenter = 0;
		int righterMostRadius = 0;
		for (int i = 0; i < s.length(); i++) {
			int reflRadius = getReflectionRadius(radiuses, tempCenter, i);
			if (i + reflRadius < tempCenter + righterMostRadius) {
				radiuses[i] = reflRadius;
			} else {
				radiuses[i] = checkMirrorsFromRange(s, i, tempCenter + righterMostRadius - i);
				tempCenter = i;
				righterMostRadius = radiuses[i];			
			}			
		}		
		
		int center = getCenterWithBiggestPalindrome(radiuses); 
		String palindrom = extractPalindromFromString(s, center, radiuses[center]);
		return removeHashesFromString(palindrom);
	}
			
		private int getReflectionRadius(int[] radiuses, int tempCenter, int i) {
			if (0 <= tempCenter - (i - tempCenter))
				return radiuses[tempCenter - (i - tempCenter)];			
			return 0;
		}

		private String interleaveStringWithHashes(String s) {
			StringBuilder builder = new StringBuilder();
			for (int i = 0; i < s.length(); i++) {
				builder.append("#");
				builder.append(s.charAt(i));
			}
			if (s.length() != 0)
				builder.append("#");			
			return builder.toString();
		}
		
		private String removeHashesFromString(String s) {
			StringBuilder builder = new StringBuilder();
			for(int i = 0; i < s.length(); i++) 
				if(s.charAt(i) != '#') 
					builder.append(s.charAt(i));			
			return builder.toString();
		}
		
		private int getCenterWithBiggestPalindrome(int[] radiuses) {
			int centerWithBiggestPalindrome = -1;
			for(int i = 0; i < radiuses.length; i++)
				if(radiuses[i] > centerWithBiggestPalindrome)
					centerWithBiggestPalindrome = i;
			return centerWithBiggestPalindrome;
		}
				
		private String extractPalindromFromString(String s, int center, int radius) {
			StringBuilder builder = new StringBuilder();
			for (int i = center - radius; i <= center + radius; i++) 
				builder.append(s.charAt(i));			
			return builder.toString();
		}
			// lowerRadius exclusive
			private int checkMirrorsFromRange(String s, int center, int lowerRadius) {
				int radius = lowerRadius; 
				while(areReflectionsAroundTheCenterTheSame(s, center, radius + 1)) {
					radius++;						
				}				
				return radius;
			}
		
				private boolean areReflectionsAroundTheCenterTheSame(String s, int center, int radius) {
					int left = center - radius;
					int right = center + radius;
					if (left > -1 && right < s.length())
						if (s.charAt(center - radius) == s.charAt(center + radius))
							return true;				
					return false;
				}

}
