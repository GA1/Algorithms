package mapcom.math;


public class Transl
{
	
	// zamienia km na rowniku na stopnie
	// TESTED
	public static double kmToDegreesOnEquator(double km)
	{
		return 360/(WorldConstants.EARTH_RADIUS_LENGTH*2*Math.PI)*km;
	}	
	
	// zamienia km na rowniku na stopnie
	// TESTED
	public static double kmToDegreesOnParallel(double km, double lat)
	{
		return 360/(WorldConstants.EARTH_RADIUS_LENGTH*2*Math.PI)*km / Math.cos(Math.toRadians(lat));
	}
	
	// zamienia ilosc stopni na rowniku na kilometry
	// TESTED
	public static double degreesToKmOnEquator(double deg) 
	{
		return deg / 360 * 2 * Math.PI * WorldConstants.EARTH_RADIUS_LENGTH;		
	}

	// zamienia ilosc stopni na danym rownolezniku na kilometry
	// TESTED
	public static double degreesToKmOnParallel(double deg, double lat) 
	{
		return deg / 360 * 2 * Math.PI * WorldConstants.EARTH_RADIUS_LENGTH * Math.cos(Math.toRadians(lat));		
	}	
	
	
	// zamienia ilosc km na na rowniku na ilosc pixeli	
	// NOT TESTED, BUT SUPPOSED TO WORK PROPERLY
	public static double kmToPixelsEquirect(double km, int mapWidth)
	{
		return mapWidth/(WorldConstants.EARTH_RADIUS_LENGTH*Math.PI)*km;
	}
	
	
	// ************************************************************************************************************************
	// EQUIRECTANGULAR PROJECTION'S TRANSLATIONS
	// ************************************************************************************************************************
	
	// Ponizsze dwie metody: latPixToDegEquirect() oraz longitPixToDegEquirect()
	// sa oparte na podobnych zalozeniach. Dla ulatwienia tlumaczenie pierwszej z nich znajduje sie ponizej:
	// Kilka przykladow translacji dla obrazka o wysokosci 18 pikseli (pamietajmy o indeksowaniu od 0 do 17):
	// - 0 pix -> 5 stopni
	// - 5 pix -> 55 stopni
	// - 9 pix -> 95 stopni
	// - 17 pix -> 175 stopni	
	// Kilka przykladow translacji dla obrazka o wysokosci 9 pikseli (pamietajmy o indeksowaniu od 0 do 8):
	// - 0 pix -> 10 stopni
	// - 2 pix -> 50 stopni
	// - 4 pix -> 90 stopni
	// - 6 pix -> 130 stopni
	// - 8 pix -> 170 stopni
	//
	//                180*longitPix + 90   		 		                
	//  longitDeg =  ---------------------   -  90.0  
	//                       height                   
	// TESTED
	public static double latPixToDegEquirect(int latitudeInPixels, int height)
	{
		double lat = (90.0 + 180*latitudeInPixels)/height  - 90.0;
		assert isLatitudeInCorrectRange(lat);
		return lat;
	}
		private static boolean isLatitudeInCorrectRange(double latitude){
			return -90.0d <= latitude && latitude <= 90.0d;
		}
	//                360*longitPix + 180   		 		                
	//  longitDeg =  ---------------------   -  180.0  
	//                       width                     
	// TESTED
	public static double longitPixToDegEquirect(int longitudeInPixels, int width)	
	{
		double longitude = (180.0 + 360*longitudeInPixels)/width - 180.0;
		assert isCorrectLongitude(longitude);
		return longitude;
	}	
		private static boolean isCorrectLongitude(double longitude){
			return -180.0d <= longitude && longitude <= 180.0d;
		}
	// Ponizsze dwie metody: latDegToPixEquirect() oraz longitDegToPixEquirect() sa stworzone na podstawie 
	// dwoch powyzszych: latPixToDegEquirect() oraz longitPixToDegEquirect()
	// Ich rownania sa po prostu rozwiazane tak, zeby na wyjsciu dostac stopnie
	//
	//                    /       latDeg +900   				\		                
	//     latPix = round(    	----------------- * (width - 1)  )
	//                    \			   180                      /						   														   
	// TESTED	
	public static int latDegToPixEquirect(double latDeg, int height)
	{
		return (int)(Math.round((latDeg+90.0)/180.0*(double)(height-1.0)));		
	}	
	//
	//                    /       longitDeg +180   				\		                
	//  longitPix = round(    	----------------- * (width - 1)  )
	//                    \			   360                      /						   														   
	// TESTED
	public static int longitDegToPixEquirect(double longitDeg, int width)
	{		
		return (int)(Math.round((longitDeg+180.0)/360.0*(double)(width-1.0)));
	}

	// ************************************************************************************************************************
	// MOLLWEIDE'S PROJECTION'S TRANSLATIONS
	// ************************************************************************************************************************
	// Pamietajmy, ze dwie z metod translacyjnych (dotyczace latitude) dla projekcji Mollweide sa identyczne z tymi z 
	// projekcji Equirectangular, wiec nie ma sensu ich przepisywac
	// 	
	//
	//                 /             width   \
	//                (  longitP -  -------   ) * 360 + 180
	//	   	           \			  2      /
	// longitDeg = --------------------------------------------
	//          	 			  /	           height      \
	//                           /  latPix -  --------      \
    //		 					/		        2.0          \ 
    //	            width * cos( --------------------- * Pi   )
	//                          \        height              /
    //	 	                     \                          /
	//
	// Metoda nie jest napisana idealnie dla przypadku gdy mapa ma nieparzysta wysokosc. Jednak jest zapewione, ¿e zakres 
	// -180, 180 nie zostanie przekroczony
	// TESTED
	public static double longitPixToDegMollweide(int longitPix, int latPix, int width, int height) 	
	{		
		return ( ( longitPix - width/2.0 )*360.0 + 180.0 )/width / Math.cos( (double)(latPix - height/2.0)/height*Math.PI);
	}	 
	//						/	  /    /  latDeg       \                  \             \
	//					   /	 (cos.( ----------*2*Pi ) * longitDeg +180 )             \
	//                    /       \    \   360         /                  /               \
	//  longitPix = round(    	-------------------------------------------- * (width - 1) )
	//                    \						   360                                    /
	//					   \													         /
	// TESTED
	public static int longitDegToPixMollweide(double longitDeg, double latDeg, int width)
	{		
		return (int)(Math.round((Math.cos(Math.toRadians(latDeg))*longitDeg+180.0)/360.0*(double)(width-1.0)));
	}
	


	
	
//	public static double getTimeOfUnitsTravelOnTheEdge(Point point1, Point point2, double[] unitsSpeed, double[] terrains)
//	{
//		int i;
//		double distance = getDistance(point1, point2);		
//		double time = 0;
//		for(i = 0; i<terrains.length; i++)
//		{
//			//poszczegolne odcinki drogi dzielimy na czesci, o jednolitym terenie, liczymy czas przejscia po danej 
//			//czesci i dodajemy do lacznego czasu potrzebnego do przebycia drogi 
//			//time += (distance * doubleToPercent(terrains[i])) / getUnitsSpeed(idsOfUnits, doubleToId(terrains[i]));
//			time += (distance * doubleToPercent(terrains[i])) / unitsSpeed[doubleToId(terrains[i])/100];		
//			
//		}
//		return time;
//		//return Transl.getDistance(point1, point2);
//		//return 10.0/5.0;
//	}
	public static double doubleToPercent(double toConvert)
	{
		return (double)toConvert%100;		
	}
	
	public static int doubleToId(double toConvert)
	{
		return (int)(toConvert - toConvert%100);
	}
	public static float floatToPercent(float toConvert)
	{
		return (int)toConvert%100;		
	}
	
	public static int floatToId(float toConvert)
	{
		return (int)(toConvert - toConvert%100)/100;
	}

	//
	// Orientacja XYZ	   
	//
	//  	   ^ z (0 E ,90 N) [to jest skrajny przypadek, wybrana zostala opcja ze dla 90 N, wspolrzedna longitude = 0 E]  
	//  	   |     
	//  	   |    ^ y (180 E, 0 N) [A nie (180 W, 0 N)] 
	//         |   /
	//	       |  /
	//	       | /
	//	       |/                                    x (90 E, 0 N)
	//	        --------------------------------------> 
    //        /
	//       /
	//      /
	//     / (0, 0 N)
	//	
	// 
	// TESTED
	public static double coordToCartX(double longitude, double latitude) 
	{
		return WorldConstants.EARTH_RADIUS_LENGTH*Math.sin(Math.toRadians(longitude))*Math.cos(Math.toRadians(latitude));			
	}
	// TESTED
	public static double coordToCartX(PointOnWorldSphere point)
	{
		return coordToCartX(point.getLongit(), point.getLat());
	}
	// TESTED
	public static double coordToCartY(double longitude, double latitude)
	{
		return -WorldConstants.EARTH_RADIUS_LENGTH*Math.cos(Math.toRadians(longitude))*Math.cos(Math.toRadians(latitude));		
	}
	// TESTED
	public static double coordToCartY(PointOnWorldSphere point)
	{
		return coordToCartY(point.getLongit(), point.getLat());
	}
	// TESTED
	public static double coordToCartZ(double latitude)
	{
		return -WorldConstants.EARTH_RADIUS_LENGTH*Math.sin(Math.toRadians(latitude));		
	}
	// TESTED
	public static double coordToCartZ(PointOnWorldSphere point)
	{
		return coordToCartZ(point.getLat());
	}
	// TESTED
	public static double xyzToLongit(double x, double y)  
	{		
		if(x == 0)
			if(y < 0)
				return 0.0;
			else
				return 180.0;
		else  // czyli kiedy x rozny od zera
			if(x > 0)
				return 90.0 + Math.toDegrees( Math.atan(y/x) );
			else // patrzac na powyzsze warunki ten else znaczy tyle co "gdy x<0" 
				return -90.0 + Math.toDegrees( Math.atan(y/x) );			
	}			
	// TESTED
	public static double xyzToLat(double z)  
	{
		return -Math.toDegrees(Math.asin(z/WorldConstants.EARTH_RADIUS_LENGTH));		
	}	
	
}
