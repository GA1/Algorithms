
import java.util.ArrayList;
import java.util.Arrays;



public class SortedSumOfCubes {

	
	MinPQ<Pair> minPq;
	
	public SortedSumOfCubes() {
		minPq = new MinPQ<Pair>();
	}
	
	public Pair[] of(int N) {
		Pair[] result = new Pair[(int)((N+1)/2.0*N)];
		for (int i = 0; i < N; i++) 
			minPq.insert(new Pair(i, i));
		
		int i = 0;
		while(!minPq.isEmpty()) {
			Pair p = minPq.delMin();
			result[i++] = p;
			if (p.b < N - 1) //{
				minPq.insert(new Pair(p.a, p.b+1));
		}
		return result;
	}
	
	class Pair implements Comparable<Pair>{
		
		int a;
		int b;
		int sumOfCubes;
			
		public Pair(int a, int b) {
			this.a = a;
			this.b = b;
			sumOfCubes = a*a*a + b*b*b;
//			sumOfCubes = a*a + b*b;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result;
			result = prime * result + a;
			result = prime * result + b;
			result = prime * result + sumOfCubes;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Pair other = (Pair) obj;			
			if (a != other.a)
				return false;
			if (b != other.b)
				return false;
			if (sumOfCubes != other.sumOfCubes)
				return false;
			return true;
		}

		@Override
		public int compareTo(Pair that) {
			return ((Integer)this.sumOfCubes).compareTo((Integer)that.sumOfCubes);
		}

		@Override
		public String toString() {
			return "(" + sumOfCubes + ", " + a + ", " + b + ")";
		}
	}

	private ArrayList<Pair> removeDuplicates(Pair[] sorted) {
		ArrayList<Pair> sortedArrayList = new ArrayList<Pair>(Arrays.asList(sorted));		
		for (int i = 0; i < sortedArrayList.size(); i++) {
			Pair p = sortedArrayList.get(i);
			if (p.a < p.b) 
				sortedArrayList.remove(i--);
		}
		return sortedArrayList;
	}
	
	public void equalCubes(int N) {
		Pair[] sorted = of(N);
		for (int i = 0; i < sorted.length - 1; i++) {
			if (sorted[i].sumOfCubes == sorted[i+1].sumOfCubes)
				System.out.println(sorted[i] + " = " + sorted[i+1]);
		}
	}
}
