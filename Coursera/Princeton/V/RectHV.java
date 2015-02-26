public class RectHV {

	private double xmin, ymin, xmax, ymax;

	// construct the rectangle [xmin, xmax] x [ymin, ymax] throw
	// a java.lang.IllegalArgumentException if (xmin > xmax) or (ymin > ymax)
	public RectHV(double xmin, double ymin, double xmax, double ymax) {
		if (xmin > xmax || ymin > ymax)
			throw new IllegalArgumentException();
		this.xmin = xmin;
		this.ymin = ymin;
		this.xmax = xmax;
		this.ymax = ymax;
	}

	// minimum x-coordinate of rectangle
	public double xmin() {
		return xmin;
	}

	// minimum y-coordinate of rectangle
	public double ymin() {
		return ymin;
	}

	// maximum x-coordinate of rectangle
	public double xmax() {
		return xmax;
	}

	// maximum y-coordinate of rectangle
	public double ymax() {
		return ymax;
	}

	// does this rectangle contain the point p (either inside or on boundary)?
	public boolean contains(Point2D p) {
		return (xmin <= p.x() && p.x() <= xmax && ymin <= p.y() && p.y() <= ymax);
	}

	// does this rectangle intersect that rectangle (at one or more points)?
	public boolean intersects(RectHV that) {
		if (isAbove(that) || isOnTheLeft(that) || isBelow(that)
				|| isOnTheRight(that))
			return false;
		return true;
	}

	private boolean isAbove(RectHV that) {
		return this.ymax < that.ymin();
	}

	private boolean isOnTheLeft(RectHV that) {
		return that.xmax < this.xmin;
	}

	private boolean isBelow(RectHV that) {
		return that.ymax < this.ymin;
	}

	private boolean isOnTheRight(RectHV that) {
		return this.xmax < that.xmin;
	}

	// Euclidean distance from point p to closest point in rectangle
	public double distanceTo(Point2D p) {
		return Math.sqrt(distanceSquaredTo(p));
	}

	// square of Euclidean distance from point p to closest point in rectangle
	public double distanceSquaredTo(Point2D p) {
		if (this.contains(p))
			return 0.0;
		if (p.x() < this.xmin) {
			if (this.ymax < p.y())
				return p.distanceSquaredTo(new Point2D(xmin, ymax));
			else if (p.y() < this.ymin)
				return p.distanceSquaredTo(new Point2D(xmin, ymin));
			else
				return (this.xmin - p.x()) * (this.xmin - p.x());
		}
		if (this.xmax < p.x()) {
			if (this.ymax < p.y())
				return p.distanceSquaredTo(new Point2D(xmax, ymax));
			else if (p.y() < this.ymin)
				return p.distanceSquaredTo(new Point2D(xmax, ymin));
			else
				return (this.xmin - p.x()) * (this.xmin - p.x());
		}
		if (this.ymax < p.y())
			return (p.y() - this.ymax) * (p.y() - this.ymax);
		if (p.y() < this.ymin)
			return (this.ymin - p.y()) * (this.ymin - p.y());
		return -3214562;
	}

	// draw to standard draw
	public void draw() {

	}

	// string representation
	public String toString() {
		return "(" + xmin + ", " + ymin + ", " + xmax + ", " + ymax + ")";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(xmax);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(xmin);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(ymax);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(ymin);
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
		RectHV other = (RectHV) obj;
		if (Double.doubleToLongBits(xmax) != Double
				.doubleToLongBits(other.xmax))
			return false;
		if (Double.doubleToLongBits(xmin) != Double
				.doubleToLongBits(other.xmin))
			return false;
		if (Double.doubleToLongBits(ymax) != Double
				.doubleToLongBits(other.ymax))
			return false;
		if (Double.doubleToLongBits(ymin) != Double
				.doubleToLongBits(other.ymin))
			return false;
		return true;
	}
}