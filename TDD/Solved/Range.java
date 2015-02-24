package tdd.tdd1;
// the class implements a range of integers and some basic operation on ranges
public class Range {
		
	private int startInclusive;
	private int endExclusive;
	private boolean isEmpty;


	// Range(2, 5) covers integers: {2, 3, 4}
	// Range(3, 3) covers integers: {}
	// Range(2, 2) covers integers: {}
	public Range(int startInclusive, int endExclusive) {
		this.startInclusive = startInclusive;
		this.endExclusive = endExclusive;
		if (startInclusive == endExclusive)
			isEmpty = true;
	}
	
	public boolean isInRange(int toCheck) {
		return false;
	}
	
	// For example, the intersection of Range(0..3) and Range(2..4) is the Range(2..3)
	public Range intersection(Range that) {
		int maxStart = Math.max(this.startInclusive, that.startInclusive);
		int minEnd = Math.min(this.endExclusive, that.endExclusive);
		if (minEnd <= maxStart)
			return createEmptyRange();
		else {
			return new Range(maxStart, minEnd);
		}
	}
		private Range createEmptyRange() {
			return new Range(0, 0);
		}
	
	
	// this method might be helpful while testing
	// note that for example Range(2, 2) and Range(3, 3) stand for the same empty range
	public boolean equals(Object that) {
		if (that == null)
			return false;
		else if (this == that)
			return true;
		else if (!(that instanceof Range))
			return false;
	    Range thatRange = (Range) that;
	    // other evaluations will be needed after adding internal variables
	    if (this.startInclusive == thatRange.startInclusive && this.endExclusive == thatRange.endExclusive)
	    	return true;
	    else if (this.isEmpty && thatRange.isEmpty)
	    	return true;
		return false;	
	}
	
	//This method is optional but might be helpful while testing
	public String toString() {
		if (isEmpty) 
			return "emptyRange";
		return "[" + startInclusive + ", " + endExclusive + ")";
	}
	
}
