
public class Josephus {

	public String[] of(String[] names, int n) {
		if (names == null || n == 1)
			return null;
		
		Queue<String> people = new Queue<String>();
		for (int i = 0; i < names.length; i++) 
			people.enqueue(names[i]);
		
		String[] eliminated = new String[names.length];
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < n - 1; j++) {
				people.enqueue(people.dequeue());
			}
			eliminated[i] = people.dequeue();						
		}
		return eliminated;
	}
}
