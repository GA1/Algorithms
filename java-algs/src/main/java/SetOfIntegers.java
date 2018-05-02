import java.util.ArrayList;
import java.util.Iterator;


public class SetOfIntegers {

	
	ArrayList<Integer> numbers;
	
	public SetOfIntegers() {
		numbers = new ArrayList<Integer>();
	}

	public boolean exists(int n) {
		for (Integer number : numbers)
			if (number == n)
				return true;
		return false;
	}

	public void add(int number) {
		int position = indexOfCellWithBiggestNumberSmallerThanN(number);
		if (position != -2)
			numbers.add(position + 1, number);
	}

	
	// returns -1 for no smaller number
	// returns -2 if n already exists in the set
	int indexOfCellWithBiggestNumberSmallerThanN(int n) {
		
		int start = 0;
		int end = numbers.size() - 1;
		int mid;
		int midValue;
		int biggestSmaller = -1;
		
		while (start <= end) {
			mid = start + (end - start)/2;
			midValue = numbers.get(mid);
			if (midValue < n) {
				biggestSmaller = mid;
				start = mid + 1; 
			} else if (midValue == n) {
				return -2;
			} else {		
			    end = mid - 1;
			}										
		}			
		return biggestSmaller;
	}
		
	public void remove(int n) {
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) == n) 
				numbers.remove(i);
		}		
	}

	public Integer size() {
		return numbers.size();
	}

	public Iterator<Integer> iterator() {
		return numbers.iterator();
	}
	
	@Override
	public boolean equals(Object that) {
		if (this == that)
			return true;
		else if (that == null) 
			return false;
		else if (this.getClass() != getClass())
			return false;
		else {
			SetOfIntegers thatSet = (SetOfIntegers)that;
			if (this.size() != thatSet.size())
				return false;
			else 
				return this.numbers.equals(thatSet.numbers);
		}					
	}

	public SetOfIntegers intersect(SetOfIntegers that) {
		SetOfIntegers intersection = new SetOfIntegers();
		ArrayList<Integer> tempNumbers = new ArrayList<Integer>();
		int i = 0;
		int j = 0;
		
		while (i < this.size() && j < that.size()) {			
			if (this.numbers.get(i) < that.numbers.get(j)) 
				i++;
			else if (this.numbers.get(i) > that.numbers.get(j))
				j++;
			else {
				tempNumbers.add(this.numbers.get(i++));
				j++;
			}
		}
				
		intersection.numbers = tempNumbers;
		return intersection;		
	}

	public SetOfIntegers difference(SetOfIntegers that) {		
		SetOfIntegers difference = new SetOfIntegers();
		ArrayList<Integer> tempNumbers = new ArrayList<Integer>();
		int i = 0;
		int j = 0;
		
		while (i < this.size() && j < that.size()) {			
			if (this.numbers.get(i) < that.numbers.get(j)) 
				tempNumbers.add(this.numbers.get(i++));
			else if (this.numbers.get(i) > that.numbers.get(j))
				j++;
			else {
				i++;
				j++;
			}
		}
		
		while (i < this.size())
			tempNumbers.add(this.numbers.get(i++));
		
		difference.numbers = tempNumbers;
		return difference;
	}

	public SetOfIntegers union(SetOfIntegers that) {
		SetOfIntegers union = new SetOfIntegers();
		ArrayList<Integer> tempNumbers = new ArrayList<Integer>();
		int i = 0;
		int j = 0;
		while (i < this.size() && j < that.size()) {
			if (this.numbers.get(i) < that.numbers.get(j)) 
				tempNumbers.add(this.numbers.get(i++));
			else if (this.numbers.get(i) >= that.numbers.get(j)) {
				tempNumbers.add(that.numbers.get(j));				
				if (this.numbers.get(i) == that.numbers.get(j++)) 
					i++;
			}
		}
		while (i < this.size())
			tempNumbers.add(this.numbers.get(i++));
		while (j < that.size())
			tempNumbers.add(that.numbers.get(j++));
		union.numbers = tempNumbers;
		return union;
	}
	
	public SetOfIntegers symmetricDifference(SetOfIntegers that) {

		SetOfIntegers union = this.union(that);
		SetOfIntegers intersection = this.intersect(that);
		return union.difference(intersection);
	}

	public String toString() {
		return numbers.toString();
	}

	public boolean isSubset(SetOfIntegers that) {
		return that.intersect(this).equals(this);
	}

	public boolean isDisjointFrom(SetOfIntegers that) {
		return this.intersect(that).equals(new SetOfIntegers());
	}
}



