package blotto;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	private static StrategyBuilder strategyBuilder = new StrategyBuilder();
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("BLOTTO I\n");
		String fileName1 = "blottoresults1.txt";
		Strategy[] allFrom1Tourn = loadStrategies(fileName1);
		Strategy[] best500StrategiesFromFirstTourn = copyArray(allFrom1Tourn, 0, 500);

		System.out.println("Mean strategy from the 1st tourn is: " + meanValue(allFrom1Tourn, 0, allFrom1Tourn.length));
		
		Strategy myBestForTheFirstTourn = bestOfAllShuffledResults(strategyBuilder.buildStrategies(5, 8, 11, 18), allFrom1Tourn);
		System.out.println("My best strategy against all the strategies from the 1st tournament: " 
							+ myBestForTheFirstTourn + ", and its score: " 
							+ getPointsForFightingWithTheStrategies(myBestForTheFirstTourn, allFrom1Tourn));
		
		System.out.println("The best strategy from the 1st tournament: " 
							+ "[3, 14, 14, 13, 3, 13, 13, 14, 13]" + ", and its score: "
							+ getPointsForFightingWithTheStrategies(new Strategy(new Integer[]{3, 14, 14, 13, 3, 13, 13, 14, 13}), allFrom1Tourn));
		
		Strategy myBestForTheFirstTournFirst500 = bestOfAllShuffledResults(strategyBuilder.buildStrategies(5, 8, 11, 18), best500StrategiesFromFirstTourn);
		System.out.println("My best strategy against 500 best strategies from the 1st tournament: " 
				+ myBestForTheFirstTournFirst500 + ", and its score: " 
				+ getPointsForFightingWithTheStrategies(myBestForTheFirstTournFirst500, allFrom1Tourn));
				
		
		System.out.println(" \n\nBLOTTO II\n");		
		String fileName2 = "blottoresults2.txt";
		Strategy[] allFrom2Tourn = loadStrategies(fileName2);

		System.out.println("Mean strategy from the 2nd tourn is: " + meanValue(allFrom2Tourn, 0, allFrom2Tourn.length));

		System.out.println("The best strategy from the 2st tournament: " 
				+ "[4, 17, 17, 17, 4, 17, 17, 3, 4]" + ", and its score: "
				+ getPointsForFightingWithTheStrategies(new Strategy(new Integer[]{4, 17, 17, 17, 4, 17, 17, 3, 4}), allFrom2Tourn));
		System.out.println("My best strategy: " + myBestForTheFirstTournFirst500 + ", and its score: " + getPointsForFightingWithTheStrategies(myBestForTheFirstTournFirst500, allFrom2Tourn));
		
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
				Integer[] sumsOfSoldiersOnFields = createArrayFilledWith0();
				for (int i = from; i < to; i++) 
					for (int j = 0; j < Strategy.CORRECT_NUMBER_OF_TROOPS; j++)
						sumsOfSoldiersOnFields[j] += strategies[i].soldiers[j];
				Double[] scaledNoOfSoldiersOnFields = new Double[Strategy.CORRECT_NUMBER_OF_TROOPS];
				for (int i = 0; i < Strategy.CORRECT_NUMBER_OF_TROOPS; i++) {
					scaledNoOfSoldiersOnFields[i] = (double)sumsOfSoldiersOnFields[i]/(to-from);
					scaledNoOfSoldiersOnFields[i] = round(scaledNoOfSoldiersOnFields[i], 2);
				}
				return Arrays.asList(scaledNoOfSoldiersOnFields).toString();
			}
				private static double round(double value, int places) {
				    if (places < 0) throw new IllegalArgumentException();
	
				    BigDecimal bd = new BigDecimal(value);
				    bd = bd.setScale(places, RoundingMode.HALF_UP);
				    return bd.doubleValue();
				}
				private static Integer[] createArrayFilledWith0() {
					Integer[] sumsOfSoldiersOnFields = new Integer[Strategy.CORRECT_NUMBER_OF_TROOPS];
					for (int i = 0; i < Strategy.CORRECT_NUMBER_OF_TROOPS; i++)
						sumsOfSoldiersOnFields[i] = 0;
					return sumsOfSoldiersOnFields;
				}
	
			private static double getPointsForFightingWithTheStrategies(Strategy strategy, Strategy[] strategies) {
				double pointsForFights = 0;
				for (Strategy s: strategies)
				//	if (!strategy.equals(s))
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
