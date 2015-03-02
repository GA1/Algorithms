package blotto;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	private static StrategyBuilder strategyBuilder = new StrategyBuilder();
	
	public static void main(String[] args) throws IOException {
		String fileName = "blottoresults2.txt";
		Strategy[] allStrategiesFromPreviousTournament = loadStrategies(fileName);
		Strategy[] bestStrategiesFromPreviousTournament = copyArray(allStrategiesFromPreviousTournament, 0, allStrategiesFromPreviousTournament.length);
		
		Strategy bestShuffledFromAll = bestOfAllShuffledResults(strategyBuilder.buildStrategies(5, 8, 11, 18), bestStrategiesFromPreviousTournament);
//		Strategy s = new Strategy(new Integer[]{4, 17, 17, 17, 4, 17, 3, 17, 4});
		System.out.println("Points for the best shuffling of the strategy: " + getPointsForFightingWithTheStrategies(bestShuffledFromAll, bestStrategiesFromPreviousTournament));
		System.out.println("The best strategy is: " + bestShuffledFromAll.toString());
		System.out.println("Average Strategy is: " + meanValue(allStrategiesFromPreviousTournament, 0, allStrategiesFromPreviousTournament.length));
		
		System.out.println(strategyBuilder.buildStrategies(5, 8, 11, 20));
	}
	
	private static Strategy[] copyArray(Strategy[] toCopy, int from, int to) {
		Strategy[] copied = new Strategy[to-from];
		for (int i = from; i < to; i++)
			copied[i] = toCopy[i];
		return copied;
	}

	private static Strategy bestOfAllShuffledResults(List<Strategy> toShuffle, Strategy[] all) {
		double best = 0;
		Strategy bestShuffledStrategy = null;
		double temp; 
		for (Strategy s: toShuffle) {
			Strategy bestShuffle = bestOfShuffledResults(s, all);
			temp = getPointsForFightingWithTheStrategies(bestShuffle, all);
			if (temp > best) {
				best = temp;
				bestShuffledStrategy = bestShuffle;
			}
		}
		return bestShuffledStrategy;
	}
	
	private static Strategy bestOfShuffledResults(Strategy strategy, Strategy[] strategies) {
		double best = 0;
		Strategy bestShuffledStrategy = null;
		double temp;
		for (int i = 0; i < 1000; i++) {
			Integer[] soldiers = copyArray(strategy.soldiers);
			Collections.shuffle(Arrays.asList(soldiers));
			Strategy shuffledStrategy = new Strategy(soldiers) ;
			temp = getPointsForFightingWithTheStrategies(shuffledStrategy, strategies);
			if (temp > best) {
				best = temp;
				bestShuffledStrategy = shuffledStrategy;
			}
		}
		return bestShuffledStrategy;
	}
	
		private static Integer[] copyArray(Integer[] soldiers) {
			Integer[] copied = new Integer[soldiers.length];
			for (int i = 0; i < soldiers.length; i++)
				copied[i] = soldiers[i];
			return copied;
		}
		private static String meanValue(Strategy[] strategies, int from, int to) {
			Integer[] sumsOfSoldiersOnFields = createArrayOfSizeFilledWith0();
			for (int i = from; i < to; i++) 
				for (int j = 0; j < Strategy.CORRECT_NUMBER_OF_TROOPS; j++)
					sumsOfSoldiersOnFields[j] += strategies[i].soldiers[j];
			Double[] scaledNoOfSoldiersOnFields = new Double[Strategy.CORRECT_NUMBER_OF_TROOPS];
			for (int i = 0; i < Strategy.CORRECT_NUMBER_OF_TROOPS; i++)
				scaledNoOfSoldiersOnFields[i] = (double)sumsOfSoldiersOnFields[i]/(to-from);
			return Arrays.asList(scaledNoOfSoldiersOnFields).toString();
		}
			private static Integer[] createArrayOfSizeFilledWith0() {
				Integer[] sumsOfSoldiersOnFields = new Integer[Strategy.CORRECT_NUMBER_OF_TROOPS];
				for (int i = 0; i < Strategy.CORRECT_NUMBER_OF_TROOPS; i++)
					sumsOfSoldiersOnFields[i] = 0;
				return sumsOfSoldiersOnFields;
			}

		private static double getPointsForFightingWithTheStrategies(Strategy strategy, Strategy[] strategies) {
			double pointsForFights = 0;
			for (Strategy s: strategies)
//				if (!strategy.equals(s))
					pointsForFights += strategy.getPointsForFightWith(s);
			return pointsForFights;
		}

		private static Strategy[] loadStrategies(String fileName) throws IOException {
			List<String> linesFromFile = TxtFileProcessing.readLinesFromFile(fileName);
			Strategy[] strategies = new Strategy[linesFromFile.size()];
			for (int i = 0; i < linesFromFile.size(); i++) {
				String[] soldiersInString = linesFromFile.get(i).split(",");
				Integer[] soldiers = new Integer[Strategy.CORRECT_NUMBER_OF_TROOPS];
				for (int j = 0; j < Strategy.CORRECT_NUMBER_OF_TROOPS; j++)
					soldiers[j] = Integer.parseInt(soldiersInString[j]);
				strategies[i] = new Strategy(soldiers);
			}
			return strategies;
		}

}
