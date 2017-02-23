package tdd;

// Rational numbers. Implements an IMMUTABLE data type Rational.java for rational numbers that supports addition,
// subtraction, multiplication, and division, equals operations

// You do not have to worry about testing for overflow, but use as instance variables two long values that represent
// the numerator and denominator to limit the possibility of overflow. Use Euclid's algorithm
// (supplied as a ready private method) to ensure that the numerator and denominator never have any common factors.
//
// throw IllegalArgumentException when a number is divided by 0;

public class Rational {

	public Rational(int numerator, int denominator) {

	}

		// returns the biggest positive common divisor
		static int euclidGreatestCommonDivisor(int p, int q) {
			if (q == 0) {
				return p;
		    }
		    return Math.abs(euclidGreatestCommonDivisor(q, p % q));
		}

	// example in pseudocode Rational(1, 2) + Rational(1, 3) == Rational(1, 6)
	public Rational plus(Rational that) {
		return null;
	}

	public Rational minus(Rational that) {
		return null;
	}

	// example in pseudocode Rational(1, 2) * Rational(3, 7) == Rational(3, 14)
	public Rational times(Rational that) {
		return null;
	}

	public Rational divide(Rational that) {
		return null;
	}

	public String toString() {
		return null;
	}

	// for example -2/5  should be equal to 4/-10
	public boolean equals(Object that) {
		if (that == null)
			return false;
		else if (this == that)
			return true;
		if (!(that instanceof Rational))
			return false;
	    Rational thatRange = (Rational) that;
	    // other evaluations will be needed after adding internal variables
		return false;
	}

}
