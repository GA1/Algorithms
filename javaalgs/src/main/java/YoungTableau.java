
public class YoungTableau {

	public Integer[][] of(Integer[][] A, int x, int y) {
		if (A == null || A.length == 0 || A[0].length == 0)
			return A;
		while (x < A.length - 1 && y < A[0].length - 1) {
			if (A[x + 1][y] < A[x][y + 1]) {
				A[x][y] = A[x + 1][y];
				A[x + 1][y] = -1;
				x++;
			} else {
				A[x][y] = A[x][y + 1];
				A[x][y + 1] = -1;
				y++;
			}
		}
		while (x < A.length - 1) {
			A[x][y] = A[x + 1][y];
			A[x + 1][y] = -1;
			x++;
		}
		while (y < A[0].length - 1) {
			A[x][y] = A[x][y + 1];
			A[x][y + 1] = -1;
			y++;
		}
		return A;
	}
	
	

}
