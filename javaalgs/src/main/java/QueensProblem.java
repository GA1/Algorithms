/*  
    author: Kamil Nguyen Van
	find all the possible arrangements of 8 queens on NxN checkBoard 
*/

import java.util.ArrayList;
import java.util.List;

public class QueensProblem {

	private int gridSize = 8;
	private int callsCount;

	public class Position {
		int x;
		int y;

		public Position(int row, int column) {
			this.x = row;
			this.y = column;
		}

		@Override
		public String toString() {
			return "(" + x + "," + y + ")";
		}
	}
	
	public int getCallsCount() { 
		return callsCount;
	}

	public List<List<Position>> quenes(int gridSize) {
		List<List<Position>> solutions = new ArrayList<List<Position>>();
		List<Position> positions = new ArrayList<Position>();
		callsCount = 0;
		this.gridSize = gridSize;
		queens(1, positions, solutions);
		return solutions;
	}

		private void queens(int row, List<Position> positions, List<List<Position>> solutions) {
			callsCount++;
			if (row == gridSize + 1)
				solutions.add(new ArrayList<Position>(positions));
			else {
				for (int column = 0; column < gridSize; column++) {
					Position tempPos = new Position(row, column);
					if (noPositionsWithColumn(positions, column) && noAttackingQueensOnDiaganals(positions, tempPos)) {
						positions.add(tempPos);
						queens(row + 1, positions, solutions);
						positions.remove(positions.size() - 1);
					}
				}
			}
		}
	
			private boolean noAttackingQueensOnDiaganals(List<Position> positions, Position tempPos) {
				for (Position p : positions)
					if (areOnDiagonals(tempPos, p))
						return false;
				return true;
			}
		
				private boolean areOnDiagonals(Position p1, Position p2) {
					return Math.abs(p1.x - p2.x) == Math.abs(p1.y - p2.y);
				}
				
				private boolean noPositionsWithColumn(List<Position> positions, int i) {
					for (Position p : positions)
						if (p.y == i)
							return false;
					return true;
				}

	public static void printSolution(List<Position> solution) {
		for (Position p : solution) {
			for (int i = 0; i < p.y; i++)
				System.out.print("# ");
			System.out.print("x ");
			for (int i = p.y + 1; i < solution.size(); i++)
				System.out.print("# ");
			System.out.println("");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		
		QueensProblem qp = new QueensProblem();
		List<List<Position>> solutions = qp.quenes(8);
		for (List<Position> solution: solutions)
			QueensProblem.printSolution(solution);
		System.out.println("Number of recursive calls to queens(): " + qp.getCallsCount());
		System.out.println("Number of solutions: " + solutions.size());
	}
}
