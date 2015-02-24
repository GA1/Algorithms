
public class StackWithAQueue<Item> {

	Queue<Item> queue;
	
	public StackWithAQueue() {
		queue = new Queue<Item>();
	}
	
	public void push(Item item) {
		queue.enqueue(item);
	}

	public Item pop() {
		if (queue.isEmpty()) 
			throw new IllegalStateException();
		for (int i = 0; i < queue.size()-1; i++)
			queue.enqueue(queue.dequeue());
		return queue.dequeue();
	}

	public int size() {
		return queue.size();
	}
	
	
	
}
