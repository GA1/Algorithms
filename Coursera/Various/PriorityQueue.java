
public class PriorityQueue {

	int size;
	Integer[] A;
	
	int INITIAL_CAPACITY = 4;
	
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public PriorityQueue() { 
		A = new Integer[INITIAL_CAPACITY];
		size = 0;
	}
	
		private void swap(Integer[] A, int i, int j) {
			int temp = A[i];
			A[i] = A[j];
			A[j] = temp;
		}

	public Integer size() {
		return size;
	}

	public void insert(int v) {
		enlargeIfNeeded();
		A[size++] = v;
		swim();
	}
		private void enlargeIfNeeded() {
			if (size() == A.length) {
				Integer[] newA = new Integer[A.length*2];
				for (int i = 0; i < size(); i++)
					newA[i] = A[i];
				A = newA;
			}		
		}
		private void swim() {
			int k = size-1;
			while (k > 0 && A[k] > A[k/2]) {
				swap(A, k, k/2);
				k = k/2;
			}
		}

	public Integer delMax() {
		shrinkIfNeeded();
		if (isEmpty())
			return null;
		swap(A, 0, --size);
		sink();		
		return A[size];
	}
		private void shrinkIfNeeded() {
			if (A.length > INITIAL_CAPACITY && A.length > 4*size) {
				Integer[] newA = new Integer[A.length/2];
				for (int i = 0; i < size(); i++)
					newA[i] = A[i];
				A = newA;
			}		
		}
		private void sink() {
			int k = 0;
			int j;
			while (2*k < size) {
				j = 2*k;
				if (j + 1 < size)
					j++;
				else 
					break;
				if (j + 1 < size && A[j+1] > A[j])
					j++;
				if (A[k] < A[j])
					swap(A, k, j);
				k = j;
			}
		}

	public Integer max() {
		if (isEmpty())
			return null;
		return A[0];	
	}
		
}
