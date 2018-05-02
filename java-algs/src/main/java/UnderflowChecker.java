
public class UnderflowChecker {

	

	

	public static boolean check(String[] pushAndPops) {
		int sum = 0;
		for (int i = 0; i < pushAndPops.length; i++) {
			if(pushAndPops[i] == "+") 
				sum++;
			else
				sum--;
			
			if (sum < 0) 
				return true;
		}
		return false;
	}

}
