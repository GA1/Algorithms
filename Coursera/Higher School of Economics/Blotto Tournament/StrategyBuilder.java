package blotto;

import java.util.ArrayList;
import java.util.List;

public class StrategyBuilder {
	
	public List<Strategy>  buildStrategies(int troopsMin, int troopsMax, int soldiersMin, int soldiersMax) {
		List<Strategy> strategies = new ArrayList<Strategy>();
		for (int i = troopsMin; i <= troopsMax; i++)
			for (int j = soldiersMin; j <= soldiersMax; j++) {
				if (i*j > Strategy.CORRECT_NUMBER_OF_SOLDIERS )
					break;
				Strategy strategy = buildStrategy(i, j);
				strategies.add(strategy);
			}
		return strategies;	
	}

	public Strategy buildStrategy(int numberOfTroops, int numberOfSoldiers) {
		Integer[] soldiers = new Integer[Strategy.CORRECT_NUMBER_OF_TROOPS];
		for (int i = 0; i < Strategy.CORRECT_NUMBER_OF_TROOPS; i++)
			soldiers[i] = numberOfSoldiers;			
		int restingSoldiers = Strategy.CORRECT_NUMBER_OF_SOLDIERS - numberOfTroops*numberOfSoldiers;
		int restingSquares = Strategy.CORRECT_NUMBER_OF_TROOPS - numberOfTroops;
		for (int i = numberOfTroops; i < Strategy.CORRECT_NUMBER_OF_TROOPS; i++) {
			soldiers[i] = restingSoldiers/restingSquares;
			restingSoldiers -= soldiers[i];
			restingSquares--;
		}
		
		return new Strategy(soldiers);
	}

}
