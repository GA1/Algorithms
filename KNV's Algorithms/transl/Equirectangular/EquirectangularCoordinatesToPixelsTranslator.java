package mapcom.math.transl.Equirectangular;

import mapcom.math.ImageDimensions;
import mapcom.math.PointOnImage;
import mapcom.math.PointOnWorldSphere;
import mapcom.math.transl.CoordinatesToPixelsTranslator;

public class EquirectangularCoordinatesToPixelsTranslator implements CoordinatesToPixelsTranslator{

	@Override
	public PointOnImage toPointOnImage(PointOnWorldSphere pointOnWorldSphere,
			ImageDimensions imageDimensions) {
		
		int xInPixels = longitudeInDegreesToPixels(pointOnWorldSphere.getLongit(), imageDimensions.getWidth());
		int yInPixels = latitudeInDegreesToPixels(pointOnWorldSphere.getLat(), imageDimensions.getHeight());
		
		return new PointOnImage(xInPixels, yInPixels, imageDimensions);
		
	}
	
		// Ponizsze dwie metody: latitudeInDegreesToPixels(...) oraz longitudeInDegreesToPixels(...) sa stworzone na podstawie 
		// dwoch powyzszych: latPixToDegEquirect() oraz longitPixToDegEquirect()
		// Ich rownania sa po prostu rozwiazane tak, zeby na wyjsciu dostac stopnie
		//
		//                    /       latDeg +900   				\		                
		//     latPix = round(    	----------------- * (width - 1)  )
		//                    \			   180                      /
		int latitudeInDegreesToPixels(double latDeg, int height)
		{
			int pix = (int)(Math.round((latDeg+90.0)/180.0*(double)(height-1.0)));
			assert 0 <= pix && pix < height;
			return pix;
		}	
		//
		//                    /       longitDeg +180   				\		                
		//  longitPix = round(    	----------------- * (width - 1)  )
		//                    \			   360                      /
		int longitudeInDegreesToPixels(double longitDeg, int width)
		{		
			int pix = (int)(Math.round((longitDeg+180.0)/360.0*(double)(width-1.0)));
			assert 0 <= pix && pix < width;
			return pix;
		}
}
