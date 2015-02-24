import static org.junit.Assert.*;

import org.junit.Test;


public class HeapSortTest extends SortingTest{

	@Override
	public Sorting getInstance() {
		return new HeapSort();
	}

}
