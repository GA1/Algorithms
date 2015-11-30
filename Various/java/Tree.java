
public class probaDrzewo {

	private Node root;
	private int size;
	
	public probaDrzewo() {
		size = 0;
	}
	
	public boolean insert(Integer value) {
		root = insert(root, value);
		return root != null;
	}
	
	private Node insert(Node node, Integer value) {
		if (node == null) {			
		    size++;			
		    return new Node(value);
		}
		else { 
			if (node.value > value)
				node.left = insert(node.left, value);
			else if (node.value < value)
				node.right = insert(node.right, value);
			else 
				node = null;
			return node;		
		}		
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}

	class Node {		
		private Integer value;
		private Node left;
		private Node right;
		
		public Node(Integer value) {
			this.value = value;
		}
	}

	
	
	public boolean exists(int value) {
		Node temp = root;
		while (temp != null) {
			if (temp.value < value)
				temp = temp.right;
			else if (temp.value > value)
				temp = temp.left;
			else return true;
		}
	    return false;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("");
		sb.append("(");
		sb.append(toStringHelper(root));
		sb.append(")");
		return sb.toString();
	}
	 	private StringBuilder toStringHelper(Node temp) {
	 		StringBuilder sb = new StringBuilder("");
	 		if (temp != null) {
	 			sb.insert(0, (temp.left != null ? toStringHelper(temp.left) + " " : ""));
	 			sb.append(Integer.toString(temp.value));
	 			sb.append((temp.right != null ? " " + toStringHelper(temp.right) : ""));
	 		}
	 		return sb;
	 	}

	public Node ceiling(int value) {
		return ceilingHelper(root, value);
	}

	private Node ceilingHelper(Node root, int value) {
		while (root != null) 
			if (value < root.right.value) 
				return root.right;
		return null;
	}

	public void floor(int i) {
		// TODO Auto-generated method stub
	}

	public void min(int i) {
		// TODO Auto-generated method stub		
	}

	public void height(int i) {
		// TODO Auto-generated method stub
	}

	public void max(int i) {
		// TODO Auto-generated method stub
	}
	
	public void breadthTraversal(int i) {
		// TODO Auto-generated method stub
	}
}
