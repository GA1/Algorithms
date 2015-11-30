
public class Steque<E> {
	
	Node<E> first;
	Node<E> last;
	int size;
	
	public Steque() {
		size = 0;		
	}
	
	private class Node<E> {
		E value;
		Node<E> next;
	}

	public int size() {
		return this.size;
	}

	public void push(E item) {
		if (isEmpty()) 
			buildFirstNode(item);
		else {
			Node<E> newFirst = new Node<E>();
			newFirst.value = item;
			newFirst.next = first;
			first = newFirst;
		}
		size++;		
	}

	public boolean isEmpty() {
		return size() == 0;
	}
	
	public void enqueue(E item) {
		if (isEmpty()) 
			buildFirstNode(item);
		else {
			Node<E> newLast = new Node<E>();
			newLast.value = item;
			last.next = newLast;
			last = newLast;
		}
		size++;		
	}
	
		private void buildFirstNode(E item) {
			first = new Node<E>();
			first.value = item;
			last = first;
		}		

	public E pop() {
		if (isEmpty())
			throw new IllegalStateException();
		E result = first.value;
		if (size == 1)
			first = last = null;
		else
			first = first.next;
		size--;
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	
//	
//	
//    private static class Node<E> {
//        E item;
//        Node<E> next;
//    }
//
//
//    private int size;
//    private Node<E> first;
//    private Node<E> last;
//
//
//    /**
//     * Create an empty steque
//     */
//    public Steque() {
//        size = 0;
//        first = null;
//        last = null;
//    }
//
//    /**
//     * Return the size of this steque
//     * 
//     * @return
//     */
//    public int size() {
//        return size;
//    }
//
//    /**
//     * Return if this steque is empty
//     * 
//     * @return
//     */
//    public boolean isEmpty() {
//        return size == 0;
//    }
//
//    /**
//     * Enqueue the <code>item</code> to the end of the steque
//     * 
//     * @param item
//     */
//    public void enqueue(E item) {
//        Node<E> newNode = new Node<E>();
//        newNode.item = item;
//
//        if (size == 0) {
//            first = last = newNode;
//        } else {
//            last.next = newNode;
//            last = newNode;
//        }
//        ++size;
//    }
//
//    /**
//     * Remove the first element and return it. <br/>
//     * If no element, return <code>null</code>
//     * 
//     * @return
//     */
//    public E pop() {
//        E item = null;
//        if (size > 0) {
//            item = first.item;
//            if (size == 1) {
//                first = last = null;
//            } else {
//                first = first.next;
//            }
//            --size;
//        }
//        return item;
//    }
//
//    /**
//     * Add <code>item</code> in the first of this steque
//     * 
//     * @param item
//     */
//    public void push(E item) {
//        Node<E> newNode = new Node<E>();
//        newNode.item = item;
//
//        if (size == 0) {
//            first = last = newNode;
//        } else {
//            newNode.next = first;
//            first = newNode;
//        }
//        ++size;
//    }
//
//    private void printState() {
//        for (Node<E> node = first; node != null; node = node.next) {
//            System.out.print(node.item + ", ");
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        Steque<String> steque = new Steque<String>();
////        System.out.println("Pop: " + steque.pop());
////        steque.enqueue("1");
////        steque.enqueue("2");
////        steque.printState();
////        System.out.println("Pop: " + steque.pop());
////        System.out.println("Pop: " + steque.pop());
//
//        steque.push("1");
//        steque.push("2");
//        steque.enqueue("3");
//        steque.push("4");
//        steque.printState();
//        System.out.println("Pop: " + steque.pop());
//        System.out.println("Pop: " + steque.pop());
//        System.out.println("Pop: " + steque.pop());
//        System.out.println("Pop: " + steque.pop());
//    }
}