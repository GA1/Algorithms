import java.util.ArrayList;
import java.util.List;



public class KdTree {

//	Corner cases.  Throw a java.lang.NullPointerException if any argument is null. Performance requirements.  
//	Your implementation should support insert() and contains() in time proportional to the logarithm of the number 
//	of points in the set in the worst case; it should support nearest() and range() in time proportional to the 
//	number of points in the set.
	
	
	private KdTreeNode root;
	private int size = 0;
	
	private class KdTreeNode {
		KdTreeNode leftDownChild;
		KdTreeNode rightUpChild;
		Point2D point;
		
		public KdTreeNode(Point2D point, KdTreeNode leftDownChild, KdTreeNode rightUpChild) {
			this.leftDownChild = leftDownChild;
			this.rightUpChild = rightUpChild;
			this.point = point;
		}
	}
	
	
	// construct an empty set of points
	public KdTree() {
		size = 0;
	}

	// is the set empty?
	public boolean isEmpty() {
		return size() == 0;
	}

	// number of points in the set
	public int size() {
		return size;
	}

	// add the point to the set (if it is not already in the set)
	public void insert(Point2D p) {
		if (p == null)
			throw new NullPointerException();
		root = insert(root, p);
	}

		private KdTreeNode insert(KdTreeNode node, Point2D p) {
			if (node == null) {
				size++;
				return new KdTreeNode(p, null, null);
			}
			else 
				return null;
		}

	// does the set contain point p?
	public boolean contains(Point2D p) {
		if (p == null)
			throw new NullPointerException();
		return p.equals(root.point);
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