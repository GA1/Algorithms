import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;



public class PointSET {

//	Corner cases.  Throw a java.lang.NullPointerException if any argument is null. Performance requirements.  
//	Your implementation should support insert() and contains() in time proportional to the logarithm of the number 
//	of points in the set in the worst case; it should support nearest() and range() in time proportional to the 
//	number of points in the set.

	private SET<Point2D> points;
	
	// construct an empty set of points
	public PointSET() {
		points = new SET<Point2D>();
	}

	// is the set empty?
	public boolean isEmpty() {
		return size() == 0;
	}

	// number of points in the set
	public int size() {
		return points == null ? 0 : points.size();
	}

	// add the point to the set (if it is not already in the set)
	public void insert(Point2D p) {
		if (p == null)
			throw new NullPointerException();
		points.add(p);
	}

	// does the set contain point p?
	public boolean contains(Point2D p) {
		if (p == null)
			throw new NullPointerException();
		return points.contains(p);
	}

	// draw all points to standard draw
	public void draw() {

	}

	// all points that are inside the rectangle
	public Iterable<Point2D> range(RectHV rect) {
		if (rect == null)
			throw new NullPointerException();
		List<Point2D> pointsInRange = new ArrayList<Point2D>();
		for (Point2D p: points)
			if (rect.contains(p))
				pointsInRange.add(p);
		return pointsInRange;
	}

	// a nearest neighbor in the set to point p; null if the set is empty
	public Point2D nearest(Point2D p) {
		if (p == null)
			throw new NullPointerException();
		if (points.size() == 0)
			return null;
		double lowestSquaredDistance = Double.POSITIVE_INFINITY;
		Point2D nearest = null;
		for (Point2D p2: points) {
			double tempSquaredDistance = p.distanceSquaredTo(p2);
			if (tempSquaredDistance < lowestSquaredDistance) {
				lowestSquaredDistance = tempSquaredDistance;
				nearest = p2;
			}
		}
		return nearest;
	}

	// unit testing of the methods (optional)
	public static void main(String[] args) {

	}
	
	
}