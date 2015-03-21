package mapcom.math;

import com.google.common.base.Objects;

public class PointOnWorldSphere {

	/**
	 * Latitude in degrees; 
	 * examples: 
	 * 70.3 east represented as 70.3 
	 * 15.1 west represented as -15.1
	 * 
	 */
	final protected double latitude; 
	/**
	 * Longitude in degrees; 
	 * examples: 
	 * 18.3 north represented as 18.3 
	 * 65.1 south represented as 65.1
	 */
	final protected double longitude;
	
	
	public PointOnWorldSphere(double longitude, double latitude) {
		this.longitude = longitude;
		this.latitude = latitude;
	}

	public double getLongit() {
		return longitude;
	}

	public double getLat() {
		return latitude;
	}

	public PointOnWorldSphere itsAntipodalPoint() {
		return new PointOnWorldSphere(-longitude, -latitude);
	}

	public String toString() {
		String s = "PointOnWorldSphere: " + "(" + longitude + ", " + latitude + ")";
		return s;
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(this.latitude, this.longitude);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final PointOnWorldSphere other = (PointOnWorldSphere) obj;
		return Objects.equal(this.longitude, other.longitude) && Objects.equal(this.latitude, other.latitude);
	}
}