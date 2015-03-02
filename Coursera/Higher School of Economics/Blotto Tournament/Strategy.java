package blotto;

import java.util.Arrays;

public class Strategy {

	static final int CORRECT_NUMBER_OF_SOLDIERS = 100;
	static final int CORRECT_NUMBER_OF_TROOPS = 9;
	
	final Integer[] soldiers;
	
	public Strategy(Integer[] soldiers) {
		checkSumOfSoldiers(soldiers);
		this.soldiers = soldiers;
	}
		private void checkSumOfSoldiers(Integer[] soldiers) {
			int numberOfSoldiers = 0;
			for (int i = 0; i < CORRECT_NUMBER_OF_TROOPS; i++)
				numberOfSoldiers += soldiers[i];
			if (numberOfSoldiers > CORRECT_NUMBER_OF_SOLDIERS)
				throw new IllegalArgumentException();		
		}

	public double getPointsForFightWith(Strategy that) {
		double points = 0;
		for (int i = 0; i < CORRECT_NUMBER_OF_TROOPS; i++) {
			if (this.soldiers[i] > that.soldiers[i])
				points ++;
			else if (this.soldiers[i] == that.soldiers[i])
				points += 0.5;
		}
		return points;
	}	
		
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(soldiers);
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
		Strategy other = (Strategy) obj;
		if (!Arrays.equals(soldiers, other.soldiers))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		int i;
		for (i = 0; i < CORRECT_NUMBER_OF_TROOPS - 1; i++) {
			sb.append(soldiers[i]);
			sb.append(",");
		}
		sb.append(soldiers[i]);
		sb.append("]");
		return Arrays.toString(soldiers);
	}
}
