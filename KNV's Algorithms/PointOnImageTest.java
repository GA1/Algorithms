package mapcom.math;

import static org.junit.Assert.*;
import mapcom.imgproc.ImgProc;

import org.junit.Test;

public class PointOnImageTest {

	PointOnImage point;
	int xInPixels, yInPixels, imageWidth, imageHeight; 
	ImageDimensions imgDimensions;
	
	@Test
	public void gettersTest() {
		xInPixels = 0;
		yInPixels = 1;
		imageWidth = 1;
		imageHeight = 2;		
		imgDimensions = new ImageDimensions(imageWidth, imageHeight);		
		point = new PointOnImage(xInPixels, yInPixels, imgDimensions);
		
		assertEquals(0, point.getX());
		assertEquals(1, point.getY());
	}

}
