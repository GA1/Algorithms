
public class QueueOnArray<T> {

	
	T[] items;
	int first;
	int last;
	int capacity;
	int count;
	
	@SuppressWarnings("unchecked")
	public QueueOnArray(int capacity) {
		first = 0;
		last = 0;
		this.capacity = capacity;
		items = (T[])(new Object[capacity]);
		count = 0;
	}
	
	public int size() {
//		if (last <= first)
//			return first - last;
//		else
//			return capacity - (last - first);
		return count;
	}

	public void enqueue(T item) {
		if (size() == capacity) 
			throw new IllegalStateException();
		items[first] = item;
		first = (first + 1) % capacity;
		count++;
	}

	public T dequeue() {
		if (size() == 0) 
			throw new IllegalStateException();
		T result = items[last];
		last = (last + 1) % capacity;
		count--;
		return result;		
	}
	
}
