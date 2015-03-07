import java.util.ArrayList;
import java.util.List;

public class KdTree {

	// Corner cases. Throw a java.lang.NullPointerException if any argument is
	// null. Performance requirements.
	// Your implementation should support insert() and contains() in time
	// proportional to the logarithm of the number
	// of points in the set in the worst case; it should support nearest() and
	// range() in time proportional to the
	// number of points in the set.

	private KdTreeNode root;
	private int size = 0;

	private class KdTreeNode {
		KdTreeNode leftDownChild;
		KdTreeNode rightUpChild;
		Point2D point;
		private boolean isVertical;

		public KdTreeNode(Point2D point, KdTreeNode leftDownChild,
				KdTreeNode rightUpChild, boolean isVertical) {
			this.leftDownChild = leftDownChild;
			this.rightUpChild = rightUpChild;
			this.isVertical = isVertical;
			this.point = point;
		}

		public boolean isHorizontal() {
			return isVertical;
		}

		public boolean isVertical() {
			return !isVertical;
		}

		@Override
		public String toString() {
			return "KdTreeNode [point=" + point + "]";
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
		root = insert(root, p, true);
	}

	private KdTreeNode insert(KdTreeNode node, Point2D toInsert, boolean isVertical) {
		if (node == null) {
			size++;
			return new KdTreeNode(toInsert, null, null, isVertical);
		} else {
			if (toInsert.equals(node.point))
				return node;
			if (isVertical) {
				if (toInsert.x() < node.point.x())
					node.leftDownChild = insert(node.leftDownChild, toInsert, !isVertical);
				else
					node.rightUpChild = insert(node.rightUpChild, toInsert, !isVertical);
			} else {
				if (toInsert.y() < node.point.y())
					node.leftDownChild = insert(node.leftDownChild, toInsert, isVertical);
				else
					node.rightUpChild = insert(node.rightUpChild, toInsert, isVertical);
			}
		}
		return node;
	}

	// does the set contain point p?
	public boolean contains(Point2D p) {
		if (p == null)
			throw new NullPointerException();
		return contains(root, p);
	}

	private boolean contains(KdTreeNode node, Point2D toFind) {
		if (node == null)
			return false;
		if (toFind.equals(node.point))
			return true;
		else {
			if (node.isVertical) {
				if (toFind.x() < node.point.x())
					return contains(node.leftDownChild, toFind);
				else
					return contains(node.rightUpChild, toFind);
			} else {
				if (toFind.y() < node.point.y())
					return contains(node.leftDownChild, toFind);
				else
					return contains(node.rightUpChild, toFind);
			}
		}
	}

	// draw all points to standard draw
	public void draw() {

	}

	// all points that are inside the rectangle
	public Iterable<Point2D> range(RectHV rect) {
		if (rect == null)
			throw new NullPointerException();
		List<Point2D> pointsInRange = new ArrayList<Point2D>();
		rangeVertical(root, rect, pointsInRange);
		return pointsInRange;
	}

		private void rangeVertical(KdTreeNode node, RectHV rect, List<Point2D> pointsInRange) {
			if (node == null)
				return;
			if (rect.xmin() < node.point.x())
				rangeHorizontal(node.leftDownChild, rect, pointsInRange);
			if (node.point.x() < rect.xmax())
				rangeHorizontal(node.rightUpChild, rect, pointsInRange);	
			if (rect.contains(node.point))
				pointsInRange.add(node.point);		
		}

		private void rangeHorizontal(KdTreeNode node, RectHV rect, List<Point2D> pointsInRange) {
			if (node == null)
				return;
			if (rect.ymin() < node.point.y())
				rangeVertical(node.leftDownChild, rect, pointsInRange);
			if (node.point.y() < rect.ymax())
				rangeVertical(node.rightUpChild, rect, pointsInRange);	
			if (rect.contains(node.point))
				pointsInRange.add(node.point);		
		}

	// a nearest neighbor in the set to point p; null if the set is empty
	public Point2D nearest(Point2D p) {
		if (p == null)
			throw new NullPointerException();
		if (size() == 0)
			return null;
		return nearestVertical(root, p);
	}

		private Point2D nearestVertical(KdTreeNode presentNode, Point2D toFind) {
			if (hasNoChildren(presentNode))
				return presentNode.point;
			if (toFind.x() < presentNode.point.x())
				return processVertically(presentNode, presentNode.leftDownChild, presentNode.rightUpChild, toFind);
			else 
				return processVertically(presentNode, presentNode.rightUpChild, presentNode.leftDownChild, toFind);
		}
		
			private Point2D processVertically(KdTreeNode presentNode, KdTreeNode A, KdTreeNode B, Point2D toFind) {
				Point2D bestOfAandPresent = presentNode.point; 
				if (A != null)
					bestOfAandPresent = closestOfTwo(nearestHorizontal(A, toFind), presentNode.point, toFind);
				Point2D bestOfAandBandPresent = bestOfAandPresent;
				if (B != null && bestOfAandPresent.distanceSquaredTo(toFind) > Math.abs(bestOfAandPresent.x() - presentNode.point.x()))
					 bestOfAandBandPresent = closestOfTwo(nearestHorizontal(B, toFind), bestOfAandPresent, toFind);
				return bestOfAandBandPresent;
			}
			
		private Point2D nearestHorizontal(KdTreeNode presentNode, Point2D toFind) {
			if (hasNoChildren(presentNode))
				return presentNode.point;
			if (toFind.y() < presentNode.point.y())
				return processHorizontally(presentNode, presentNode.leftDownChild, presentNode.rightUpChild, toFind);
			else 
				return processHorizontally(presentNode, presentNode.rightUpChild, presentNode.leftDownChild, toFind);
		}
		
			private Point2D processHorizontally(KdTreeNode presentNode, KdTreeNode A, KdTreeNode B, Point2D toFind) {
				Point2D bestOfAandPresent = presentNode.point; 
				if (A != null)
					bestOfAandPresent = closestOfTwo(nearestVertical(A, toFind), presentNode.point, toFind);
				Point2D bestOfAandBandPresent = bestOfAandPresent;
				if (B != null && bestOfAandPresent.distanceSquaredTo(toFind) > Math.abs(bestOfAandPresent.y() - presentNode.point.y()))
					 bestOfAandBandPresent = closestOfTwo(nearestVertical(B, toFind), bestOfAandPresent, toFind);
				return bestOfAandBandPresent;
			}

				private Point2D closestOfTwo(Point2D nearestHorizontal, Point2D point, Point2D p) {
					if (nearestHorizontal.distanceSquaredTo(p) <= point.distanceSquaredTo(p))
						return nearestHorizontal;
					else 
						return point;
				}

				private boolean hasNoChildren(KdTreeNode node) {
					return node.leftDownChild == null && node.rightUpChild == null;
				}

	// unit testing of the methods (optional)
	public static void main(String[] args) {

	}

}