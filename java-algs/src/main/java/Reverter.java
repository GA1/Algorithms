
public class Reverter {

	/**
	 * @param args
	 */
	
	public static void reverse(String s) {
		char[] array = s.toCharArray();
		reverse(array, 0);
	}
	
		private static void reverse(char[] array, int i) {
			if (i < array.length) {
				reverse(array, i+1);
				System.out.print(array[i]);
			}
		}

	public static void main(String[] args) {
		reverse("abcdefg");
	}

}
