import java.util.Arrays;
import java.util.Collections;


public class SchedulerNProcessors {

	public Integer schedule(Integer[] tasks, int N) {
		Arrays.sort(tasks, Collections.reverseOrder());
		int[] processors = new int[N];
		for (int i = 0; i < tasks.length; i++)
			processors[findFreeProcessorIndex(processors)] += tasks[i];
		return processorsWithMostTime(processors);
	}
	
	

	private Integer processorsWithMostTime(int[] processors) {
		int maxLoaded = processors[0];
		for (int i = 1; i < processors.length; i++)
			if (processors[i] > processors[i-1])
				maxLoaded = processors[i];
		return maxLoaded;
	}



	private int findFreeProcessorIndex(int[] processors) {
		int freeProcessors = 0;
		for (int i = 1; i < processors.length; i++)
			if (processors[i] < processors[i-1])
				freeProcessors = i;
		return freeProcessors;
	}

}
