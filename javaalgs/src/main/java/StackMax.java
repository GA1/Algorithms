
public class StackMax extends Stack<Integer>{

	private Stack<Integer> maximums;
	
	public StackMax() {
		maximums = new Stack<Integer>();
	}

	
	@Override
	public Integer pop() {
		Integer result = super.pop();
		if (maximums.peek() == result) {
			maximums.pop();
		}
		return result;
	}
	
	@Override
	public void push(Integer item) {
		if(this.maximums.isEmpty()) 
			maximums.push(item);
		else if(maximums.peek() < item) 
			maximums.push(item);		
		super.push(item);
	}
	
	
	public Integer max() {		
		return maximums.peek();
	}	
}
