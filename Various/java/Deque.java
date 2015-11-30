

public class Deque<Item> {

	int size;
	Item[] items;
	
	@SuppressWarnings("unchecked")
	public Deque() {
		size = 0;
		items = (Item[]) (new Object[8]); 
	}
	
	public int size() {
		return size;
	}

	public void addFirst(Item item) {
		size++;	
	}

	public void addLast(Integer item) {
		size++;		
	}

	public void removeFirst() {
		size--;		
	}

	public void removeLast() {
		size--;		
	}

}
