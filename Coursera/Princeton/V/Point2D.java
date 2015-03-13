public class Point2D implements Comparable<Point2D>  {
	
	private double x;
	private double y;
	private String name;
	
	public Point2D(double x, double y, String name) {
		this.x = x;
		this.y = y;
		this.name = name;
	}
	
	// construct the point (x, y)
	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

	// x-coordinate 
	public double x() {
		return x;
	}

	// y-coordinate 
	public double y() {
		return y;
	}

	// Euclidean distance between two points
	public double distanceTo(Point2D that) { 
		return Math.sqrt(distanceSquaredTo(that));
	}

	 // square of Euclidean between two points
	public double distanceSquaredTo(Point2D that) {
		double xDist = this.x - that.x;
		double yDist = this.y - that.y;
		return xDist*xDist + yDist*yDist;
	}

	// for use in an ordered symbol table
	public int compareTo(Point2D that) {
		if (this.x < that.x)
			return -1;
		else if (this.x > that.x)
			return 1;
		else {
			if (this.y < that.y)
				return -1;
			else if (this.y > that.y)
				return 1;
			return 0;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Point2D other = (Point2D) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}

	// draw to standard draw
	public void draw() {
		
	}

	// string representation
	public String toString() {
		return "(" + x + ", " + y + ")" + name;
	}
}
