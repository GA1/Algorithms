

public class PriorityQueueStable<T extends Comparable<T>>{

	int size;
	Object[] A;
	
	int INITIAL_CAPACITY = 2;
	
		@SuppressWarnings("unchecked")
		private T get(int which) {
			return (T)A[which];
		}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public PriorityQueueStable() {
		A = new Object[INITIAL_CAPACITY];
		size = 0;
	}

	public Integer size() {
		return size;
	}

	public void insert(T t) {
		enlargeIfNeeded();
		A[size++] = t;
		swim();
	}
	
		private void enlargeIfNeeded() {
			if (size == A.length) {
				Object[] B = new Object[A.length*2];
				copySmallerTableToBiggerOne(A, B);
				A = B;
			}
		} 
			private void copySmallerTableToBiggerOne(Object[] smaller, Object[] bigger) {
				for (int i = 0; i < smaller.length; i++)
					bigger[i] = smaller[i];
			}
			
		private void swim() {
			int j = size()-1;
			while (j != 0 && isSmaller(get(j/2), get(j))) {
				swap(j, (j)/2);
				j = (j)/2;
			}
		}
			private boolean isSmaller(T t1, T t2) {
				return t1.compareTo(t2) < 0;
			}
			private void swap(int i, int j) {
				T temp = get(i);
				A[i] = A[j];
				A[j] = temp;
			}

	public T delMax() {
		shrinkIfNeeded();
		if (isEmpty())
			return null;
		T max = get(0);
		swap(0, --size);
		sink();
		return max;		
	}
		private void shrinkIfNeeded() {
			if (size > INITIAL_CAPACITY && size*4 == A.length) {
				Object[] B = new Object[A.length/2];
				copyBiggerTableToSmallerOne(B, A);
				A = B;
			}
		}
			private void copyBiggerTableToSmallerOne(Object[] smaller, Object[] bigger) {
				for (int i = 0; i < size; i++)
					smaller[i] = bigger[i];
			}
			
		private void sink() {
			int j = 0;
			while (j*2+1 < size && isBiggerOrEqual(get(j*2+1), get(j))) {
				if (j*2+2 < size && isBiggerOrEqual(get(j*2+2), get(j*2+1))) {
					swap(j, j*2+2);
					j = j*2+2;
				} else {
					swap(j, j*2+1);
					j = j*2+1;
				}
			}
		}
			private boolean isBiggerOrEqual(T t1, T t2) {
				return t1.compareTo(t2) >= 0;
			}

	public T max() {
		return get(0);
	}
		
}
