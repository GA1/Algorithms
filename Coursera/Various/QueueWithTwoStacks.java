import java.util.NoSuchElementException;


public class QueueWithTwoStacks<Item> {

	Stack<Item> stack1;
	Stack<Item> stack2;
	
	public QueueWithTwoStacks() {
		stack1 = new Stack<Item>();
		stack2 = new Stack<Item>();
	}
	
	public void enqueue(Item item) {
		stack1.push(item);
	}
	
	public Item dequeue() {
		if (stack2.isEmpty())
			moveStack1ToStack2();
		return stack2.pop(); 
	}
	
		private void moveStack1ToStack2() {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}

	public Object size() {
		return stack1.size();
	}
}
