import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;



public class TwoSum {

	
	private List<Long> list;
	private HashSet<Long> set;
	
	public TwoSum() {
		list = new ArrayList<Long>();
		set = new HashSet<Long>();
	}
	
	public void insert(Long n) {
		if (!set.contains(n)) {
			set.add(n);
			list.add(n);
		}
	}

	public boolean hasSum(int t) {
		for (Long a : list) {
			if (set.contains(t - a)){
				if (t - a != a)
					return true;
			}
		}
			
				
//		Iterator<Long> it = set.iterator();
//		while (it.hasNext()) {
//			Long a = it.next(); 
//			if (set.contains(t - a)){
//				if (t - a != a)
//					return true;
//			}
//		}
		
		
		return false;
	}

}
