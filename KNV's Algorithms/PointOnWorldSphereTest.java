package mapcom.math;

import org.junit.Test;
import static org.junit.Assert.*;

public class PointOnWorldSphereTest {

	double delta = 0.00000000001;

	@Test
	public void compareTheSamePoints() {
		PointOnWorldSphere A = new PointOnWorldSphere(60.0, 88.9999);
		PointOnWorldSphere B = new PointOnWorldSphere(60.0, 89.0);

		assertFalse(A.equals(B));
	}

	@Test
	public void comparePointsWithDifferentLatitudes() {
		PointOnWorldSphere A = new PointOnWorldSphere(60.0, 89.0);
		PointOnWorldSphere B = new PointOnWorldSphere(60.0, 88.99999);

		assertFalse(A.equals(B));
	}

	@Test
	public void isCreatedAntipodalPointHasIndeedOppositeCoordinates() {
		PointOnWorldSphere point = new PointOnWorldSphere(10.123, 20.456);
		PointOnWorldSphere antipodalPoint = point.itsAntipodalPoint();
		assertEquals(-10.123, antipodalPoint.getLongit(), delta);
		assertEquals(-20.456, antipodalPoint.getLat(), delta);
	}

}
