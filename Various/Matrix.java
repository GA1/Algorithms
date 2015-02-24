import java.util.Arrays;


public class Matrix {

	Integer[][] values;
	
	public Matrix(Integer[][] values) {
		if (values == null || values.length == 0)
			throw new IllegalArgumentException();
		this.values = values;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(values);
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
		Matrix other = (Matrix) obj;
		for(int i = 0; i < values.length; i++) {
			for(int j = 0; j < values[0].length; j++) {
				if(this.values[i][j] != other.values[i][j])
					return false;
			}	
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		int i;
		for (i = 0; i < values.length-1; i++) {
			sb.append(rowToString(i));
			sb.append(", ");
		}
		if (i < values.length)
			sb.append(rowToString(i));
		sb.append("]");
		return sb.toString();
	}

		private String rowToString(int i) {
			StringBuilder sb = new StringBuilder();
			sb.append("[");
			int j;
			for (j = 0; j < values[i].length-1; j++) {
				sb.append(values[i][j]);
				sb.append(", ");
			}
			if (j < values[i].length)
				sb.append(values[i][values[0].length-1]);
			sb.append("]");
			return sb.toString();
		}




	public Matrix multiply(Matrix that) {
		if (dimensionsNotCorrectForMultiplication(that))
			throw new IllegalArgumentException();
		int dimension1 = this.values.length;
		int dimension2 = this.values[0].length;
		Integer[][] values = new Integer[dimension1 ][dimension1 ];
		int tempValue;
		for (int i = 0; i < dimension1; i++) {
			for (int j = 0; j < dimension1; j++) {
				tempValue = 0;
				for (int k = 0; k < dimension2; k++) {
					 tempValue += this.values[i][k]*that.values[k][j]; 
				}
				values[i][j] = tempValue;
			}	
		}
		return new Matrix(values);
	}

	private boolean dimensionsNotCorrectForMultiplication(Matrix that) {
		return this.values[0].length != that.values.length;
	}

	public Matrix transpose() {
		Integer[][] transposedValues = new Integer[values[0].length][values.length];
		for (int i = 0; i < values.length; i++) { 
			for (int j = 0; j < values[0].length; j++) { 
				transposedValues[j][i] = values[i][j];
			}	
		}		
		Matrix transposedMatrix = new Matrix(transposedValues);
		return transposedMatrix;
	}
}





