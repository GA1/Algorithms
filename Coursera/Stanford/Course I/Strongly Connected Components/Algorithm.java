


public class Algorithm {

	public static Integer[] findStrongComponents(Graph graph) {
		Integer[] order = graph.firstDFS();
		Integer[] pointsPriority = indicesToValues(order);
		graph.reversEdges();
		Integer[] components = graph.secondDFS(pointsPriority);
		return return5BiggestComponentsSizes(components);
	}
	
		private static Integer[] return5BiggestComponentsSizes(Integer[] components) {
			Integer[] result = new Integer[5];
			for (int i = 0; i < result.length; i++)
				result[i] = 0;
			for (int i = 0; i < components.length && i < 5; i++)
				result[i] = components[i];
			return result;
		}

		public static Integer[] indicesToValues(Integer[] order) {
			Integer[] result = new Integer[order.length];
			for (int i = 0; i < order.length; i++) 
				result[order[i]] = i; 
			return result;
		}

}
