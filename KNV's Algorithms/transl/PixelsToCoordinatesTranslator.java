package mapcom.math.transl;

import mapcom.math.PointOnImage;
import mapcom.math.PointOnWorldSphere;

public interface PixelsToCoordinatesTranslator {
	PointOnWorldSphere toPointOnWorldSphere(PointOnImage pointOnImage);
}
