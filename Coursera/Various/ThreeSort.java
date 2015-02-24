
public class ThreeSort {
	
	public static int[] of(int a, int b, int c) {
		
		int temp;
		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		if (b > c) {
			temp = b;
			b = c;
			c = temp;
		}
		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		return new int[]{a, b, c}; 
	}
}
