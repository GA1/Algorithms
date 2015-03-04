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

	private KdTreeNode insert(KdTreeNode node, Point2D p, boolean isVertical) {
		if (node == null) {
			size++;
			return new KdTreeNode(p, null, null, isVertical);
		} else {
			if (p.equals(node.point))
				return node;
			if (isVertical) {
				if (p.x() < node.point.x())
					node.leftDownChild = insert(node.leftDownChild, p,
							!isVertical);
				else
					node.rightUpChild = insert(node.rightUpChild, p,
							!isVertical);
			} else {
				if (p.y() < node.point.y())
					node.leftDownChild = insert(node.leftDownChild, p,
							isVertical);
				else
					node.rightUpChild = insert(node.rightUpChild, p, isVertical);
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

	private boolean contains(KdTreeNode node, Point2D p) {
		if (p.equals(node.point))
			return true;
		else {
			if (node.isVertical) {
				if (p.x() < node.point.x())
					return contains(node.leftDownChild, p);
				else
					return contains(node.rightUpChild, p);
			} else {
				if (p.y() < node.point.y())
					return contains(node.leftDownChild, p);
				else
					return contains(node.rightUpChild, p);
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
		// for (Point2D p: points)
		// if (rect.contains(p))
		// pointsInRange.add(p);
		return pointsInRange;
	}

	// a nearest neighbor in the set to point p; null if the set is empty
	public Point2D nearest(Point2D p) {
		if (p == null)
			throw new NullPointerException();
		if (size() == 0)
			return null;
		return nearestVertical(root, p);
	}

		private Point2D nearestVertical(KdTreeNode node, Point2D p) {
			if (nodeHasNoChildren(node))
				return node.point;
			if (p.x() < node.point.x()) {
				if (node.leftDownChild == null)
					return closestOfTwo(nearestHorizontal(node.rightUpChild, p), node.point, p);
				Point2D nearestLeft = nearestHorizontal(node.leftDownChild, p);
				Point2D betterOfLeftAndPresetnt = closestOfTwo(nearestLeft, node.point, p);
				if (betterOfLeftAndPresetnt.distanceSquaredTo(p) > Math.abs(betterOfLeftAndPresetnt.x() - node.point.x()))
					return closestOfTwo(nearestHorizontal(node.rightUpChild, p), node.point, p);
			}
			return p;
		
		}

			private Point2D closestOfTwo(Point2D nearestHorizontal, Point2D point, Point2D p) {
				if (nearestHorizontal.distanceSquaredTo(p) < point.distanceSquaredTo(p))
					return nearestHorizontal;
				else 
					return point;
			}

			private boolean nodeHasNoChildren(KdTreeNode node) {
				return node.leftDownChild == null && node.rightUpChild == null;
			}
		
		private Point2D nearestHorizontal(KdTreeNode node, Point2D p) {
			if (nodeHasNoChildren(node))
				return node.point;
			if (p.x() < node.point.x()) {
				if (node.leftDownChild == null)
					return nearestHorizontal(node.rightUpChild, p);	
				Point2D nearestLeft = nearestHorizontal(node.leftDownChild, p);
				Point2D nearestRight = nearestHorizontal(node.rightUpChild, p);
			}
			return p;
		
		}
	
//	private Point2D nearestVertical(KdTreeNode node, Point2D p) {
//		if (p.x() < node.point.x()) {
//			if (node.leftDownChild == null)
//				return node.point;
//			else {
//				Point2D temp = nearestHorizontal(node.leftDownChild, p);
//				if (p.distanceSquaredTo(temp) < node.point.distanceSquaredTo(p))
//					return temp;
//				else
//					return node.point;
//			}
//		} else {
//			if (node.rightUpChild == null)
//				return node.point;
//			else {
//				Point2D temp = nearestHorizontal(node.rightUpChild, p);
//				if (p.distanceSquaredTo(temp) < node.point.distanceSquaredTo(p))
//					return temp;
//				else
//					return node.point;
//			}
//		}
//	}
//
//	private Point2D nearestVer(KdTreeNode node, Point2D p) {
//		if (p.x() < node.point.x()) {
//			Point2D leftBestPoint = nearestVertical(node.leftDownChild, p);
//			if (leftBestPoint.x())
//		}
//	}
//	
//	private Point2D nearestHorizontal(KdTreeNode node, Point2D p) {
//		if (p.y() < node.point.y()) {
//			if (node.leftDownChild == null)
//				return node.point;
//			else {
//				Point2D temp = nearestVertical(node.leftDownChild, p);
//				if (p.distanceSquaredTo(temp) < node.point.distanceSquaredTo(p))
//					return temp;
//				else
//					return node.point;
//			}
//		} else {
//			if (node.rightUpChild == null)
//				return node.point;
//			else {
//				Point2D temp = nearestVertical(node.rightUpChild, p);
//				if (p.distanceSquaredTo(temp) < node.point.distanceSquaredTo(p))
//					return temp;
//				else
//					return node.point;
//			}
//		}
//	}
	
	// private Point2D nearest(KdTreeNode node, Point2D p) {
	// if (node.isVertical) {
	// if (p.x() < node.point.x()) {
	// if (node.leftDownChild == null)
	// return node.point;
	// else {
	// Point2D temp = nearest(node.leftDownChild, p);
	// if (p.distanceSquaredTo(temp) < node.point.distanceSquaredTo(p))
	// return temp;
	// else return node.point;
	// }
	// } else {
	// if (node.rightUpChild == null)
	// return node.point;
	// else {
	// Point2D temp = nearest(node.rightUpChild, p);
	// if (p.distanceSquaredTo(temp) < node.point.distanceSquaredTo(p))
	// return temp;
	// else return node.point;
	// }
	// }
	// } else {
	// if (p.y() < node.point.y()) {
	// if (node.leftDownChild == null)
	// return node.point;
	// else {
	// Point2D temp = nearest(node.leftDownChild, p);
	// if (p.distanceSquaredTo(temp) < node.point.distanceSquaredTo(p))
	// return temp;
	// else return node.point;
	// }
	// } else {
	// if (node.rightUpChild == null)
	// return node.point;
	// else {
	// Point2D temp = nearest(node.rightUpChild, p);
	// if (p.distanceSquaredTo(temp) < node.point.distanceSquaredTo(p))
	// return temp;
	// else return node.point;
	// }
	// }
	// }
	// }

	// unit testing of the methods (optional)
	public static void main(String[] args) {

	}

}