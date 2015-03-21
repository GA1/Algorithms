package mapcom.math.transl;

import mapcom.math.ImageDimensions;
import mapcom.math.PointOnImage;
import mapcom.math.PointOnWorldSphere;

public interface CoordinatesToPixelsTranslator {	 
	PointOnImage toPointOnImage(PointOnWorldSphere pointOnWorldSphere, ImageDimensions imageDimensions);	
}
