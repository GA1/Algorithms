package mapcom.math;

import static org.junit.Assert.*;

import mapcom.math.Transl;
import mapcom.math.WorldConstants;

import org.junit.Test;

public class TranslTest
{
	double delta = 0.00000000001;  // 10 trylionowych, o tyle conajwyzej moze byc blad w double'ach
	double PI = Math.PI;
	
	
	
	/******************************************************************************************************************
	 *  coordToCartX Method TEST 
	 *****************************************************************************************************************/
	
	@Test
	public void coordToCartX_Test_0010()
	{
		assertEquals(WorldConstants.EARTH_RADIUS_LENGTH, Transl.coordToCartX(90.0, 0.0), delta);
	}
	@Test
	public void coordToCartX_Test_0020()
	{
		assertEquals(-WorldConstants.EARTH_RADIUS_LENGTH, Transl.coordToCartX(-90.0, 0.0), delta);
	}	
	@Test
	public void coordToCartX_Test_0030()
	{
		assertEquals(0.0, Transl.coordToCartX(90.0, 90.0), delta);
	}
	@Test
	public void coordToCartX_Test_004()
	{
		assertEquals(0.0, Transl.coordToCartX(17.0, 90.0), delta);
	}
	@Test
	public void coordToCartX_Test_005()
	{
		assertEquals(WorldConstants.EARTH_RADIUS_LENGTH/2.0, Transl.coordToCartX(30.0, 0.0), delta);
	}
	@Test
	public void coordToCartX_Test_006()
	{
		assertEquals(-WorldConstants.EARTH_RADIUS_LENGTH/2.0, Transl.coordToCartX(-30.0, 0.0), delta);
	}
	@Test
	public void coordToCartX_Test_007()
	{
		assertEquals(WorldConstants.EARTH_RADIUS_LENGTH/2.0*Math.sqrt(3), Transl.coordToCartX(60.0, 0.0), delta);
	}
	@Test
	public void coordToCartX_Test_008()
	{
		assertEquals(-WorldConstants.EARTH_RADIUS_LENGTH/2.0*Math.sqrt(3), Transl.coordToCartX(-60.0, 0.0), delta);
	}
	@Test
	public void coordToCartX_Test_009()
	{
		assertEquals(WorldConstants.EARTH_RADIUS_LENGTH/2.0*Math.sqrt(3), Transl.coordToCartX(90.0, 30.0), delta);
	}
	@Test
	public void coordToCartX_Test_010()
	{
		assertEquals(-WorldConstants.EARTH_RADIUS_LENGTH/2.0*Math.sqrt(3), Transl.coordToCartX(-90.0, 30.0), delta);
	}
	@Test
	public void coordToCartX_Test_011()
	{
		assertEquals(0.0, Transl.coordToCartX(-90.0, 90.0), delta);
	}
	@Test
	public void coordToCartX_Test_012()
	{
		assertEquals(0.0, Transl.coordToCartX(-17.0, 90.0), delta);
	}
	@Test
	public void coordToCartX_Test_013()
	{
		assertEquals(0.0, Transl.coordToCartX(0.0, 0.0), delta);
	}
	@Test
	public void coordToCartX_Test_014()
	{
		assertEquals(0.0, Transl.coordToCartX(180.0, 0.0), delta);
	}
	@Test
	public void coordToCartX_Test_015()
	{
		assertEquals(0.0, Transl.coordToCartX(-180.0, 0.0), delta);
	}
	
	
	/******************************************************************************************************************
	 *  ToCartY Method TEST 
	 *****************************************************************************************************************/
	@Test
	public void coordToCartY_Test_001()
	{
		assertEquals(-WorldConstants.EARTH_RADIUS_LENGTH, Transl.coordToCartY(0.0, 0.0), delta);
	}
	@Test
	public void coordToCartY_Test_002()
	{
		assertEquals(WorldConstants.EARTH_RADIUS_LENGTH, Transl.coordToCartY(180.0, 0.0), delta);
	}
	@Test
	public void coordToCartY_Test_003()
	{
		assertEquals(WorldConstants.EARTH_RADIUS_LENGTH, Transl.coordToCartY(-180.0, 0.0), delta);
	}
	@Test
	public void coordToCartY_Test_004()
	{
		assertEquals(-WorldConstants.EARTH_RADIUS_LENGTH/2.0, Transl.coordToCartY(60, 0.0), delta);
	}
	@Test
	public void coordToCartY_Test_005()
	{
		assertEquals(-WorldConstants.EARTH_RADIUS_LENGTH/2.0, Transl.coordToCartY(-60, 0.0), delta);
	}
	@Test
	public void coordToCartY_Test_006()
	{
		assertEquals(WorldConstants.EARTH_RADIUS_LENGTH/2.0, Transl.coordToCartY(-120, 0.0), delta);
	}
	@Test
	public void coordToCartY_Test_007()
	{
		assertEquals(WorldConstants.EARTH_RADIUS_LENGTH/2.0, Transl.coordToCartY(120, 0.0), delta);
	}
	@Test
	public void coordToCartY_Test_008()
	{
		assertEquals(-WorldConstants.EARTH_RADIUS_LENGTH*Math.sqrt(3)/2.0, Transl.coordToCartY(30, 0.0), delta);
	}
	@Test
	public void coordToCartY_Test_009()
	{
		assertEquals(-WorldConstants.EARTH_RADIUS_LENGTH*Math.sqrt(3)/2.0, Transl.coordToCartY(-30, 0.0), delta);
	}
	@Test
	public void coordToCartY_Test_010()
	{
		assertEquals(WorldConstants.EARTH_RADIUS_LENGTH*Math.sqrt(3)/2.0, Transl.coordToCartY(150, 0.0), delta);
	}
	@Test
	public void coordToCartY_Test_011()
	{
		assertEquals(WorldConstants.EARTH_RADIUS_LENGTH*Math.sqrt(3)/2.0, Transl.coordToCartY(-150, 0.0), delta);
	}
	@Test
	public void coordToCartY_Test_012()
	{
		assertEquals(WorldConstants.EARTH_RADIUS_LENGTH*Math.sqrt(3)/2.0, Transl.coordToCartY(-150, 0.0), delta);
	}
	@Test
	public void coordToCartY_Test_013()
	{
		assertEquals(-WorldConstants.EARTH_RADIUS_LENGTH/2.0, Transl.coordToCartY(45, 45), delta);
	}
	@Test
	public void coordToCartY_Test_014()
	{
		assertEquals(WorldConstants.EARTH_RADIUS_LENGTH/2.0, Transl.coordToCartY(135, 45), delta);
	}
	@Test
	public void coordToCartY_Test_015()
	{
		assertEquals(WorldConstants.EARTH_RADIUS_LENGTH/2.0, Transl.coordToCartY(-135, 45), delta);
	}
	
	
	/******************************************************************************************************************
	 *  coordToCartZ Method TEST 
	 *****************************************************************************************************************/
	@Test
	public void coordToCartZ_Test_001()
	{
		assertEquals(WorldConstants.EARTH_RADIUS_LENGTH, Transl.coordToCartZ(-90.0), delta);
	}
	@Test
	public void coordToCartZ_Test_002()
	{
		assertEquals(-WorldConstants.EARTH_RADIUS_LENGTH, Transl.coordToCartZ(90.0), delta);
	}
	@Test
	public void coordToCartZ_Test_003()
	{
		assertEquals(WorldConstants.EARTH_RADIUS_LENGTH/Math.sqrt(2), Transl.coordToCartZ(-45.0), delta);
	}
	@Test
	public void coordToCartZ_Test_004()
	{
		assertEquals(-WorldConstants.EARTH_RADIUS_LENGTH/Math.sqrt(2), Transl.coordToCartZ(45.0), delta);
	}
	@Test
	public void coordToCartZ_Test_005()
	{
		assertEquals(WorldConstants.EARTH_RADIUS_LENGTH*Math.sqrt(3)/2.0, Transl.coordToCartZ(-60.0), delta);
	}
	public void coordToCartZ_Test_006()
	{
		assertEquals(-WorldConstants.EARTH_RADIUS_LENGTH*Math.sqrt(3)/2.0, Transl.coordToCartZ(60.0), delta);
	}

	
	/******************************************************************************************************************
	 *  xyzToLongitude Method TEST 
	 *****************************************************************************************************************/
	@Test
	public void XYZToLongitude_Test_001()
	{		
		assertEquals(60.0, Transl.xyzToLongit(WorldConstants.EARTH_RADIUS_LENGTH*Math.sqrt(3.0)/2.0, 
				-WorldConstants.EARTH_RADIUS_LENGTH/2.0), delta);
	}
	@Test
	public void XYZToLongitude_Test_002()
	{
		assertEquals(-60.0, Transl.xyzToLongit(-WorldConstants.EARTH_RADIUS_LENGTH*Math.sqrt(3.0)/2.0, 
				-WorldConstants.EARTH_RADIUS_LENGTH/2.0), delta);
	}
	@Test
	public void XYZToLongitude_Test_003()
	{		
		assertEquals(120.0, Transl.xyzToLongit(WorldConstants.EARTH_RADIUS_LENGTH*Math.sqrt(3.0)/2.0, 
				WorldConstants.EARTH_RADIUS_LENGTH/2.0), delta);
	}
	@Test
	public void XYZToLongitude_Test_004()
	{
		assertEquals(-120.0, Transl.xyzToLongit(-WorldConstants.EARTH_RADIUS_LENGTH*Math.sqrt(3.0)/2.0, 
				WorldConstants.EARTH_RADIUS_LENGTH/2.0), delta);
	}
	@Test
	public void XYZToLongitude_Test_005()
	{
		assertEquals(0.0, Transl.xyzToLongit(0.0, -WorldConstants.EARTH_RADIUS_LENGTH), delta);
	}
	@Test
	public void XYZToLongitude_Test_006()
	{
		assertEquals(180.0, Transl.xyzToLongit(0.0, WorldConstants.EARTH_RADIUS_LENGTH), delta);
	}
	@Test
	public void XYZToLongitude_Test_007()
	{
		assertEquals(90.0, Transl.xyzToLongit(WorldConstants.EARTH_RADIUS_LENGTH, 0.0), delta);
	}
	@Test
	public void XYZToLongitude_Test_008()
	{
		assertEquals(-90.0, Transl.xyzToLongit(-WorldConstants.EARTH_RADIUS_LENGTH, 0.0), delta);
	}
	
	
	/******************************************************************************************************************
	 *  xyzToLat Method TEST 
	 *****************************************************************************************************************/
	@Test
	public void XYZToLat_Test_001()
	{
		assertEquals(-90.0, Transl.xyzToLat(WorldConstants.EARTH_RADIUS_LENGTH), delta);
	}
	@Test
	public void XYZToLat_Test_002()
	{
		assertEquals(90.0, Transl.xyzToLat(-WorldConstants.EARTH_RADIUS_LENGTH), delta);
	}
	@Test
	public void XYZToLat_Test_003()
	{
		assertEquals(-45.0, Transl.xyzToLat( WorldConstants.EARTH_RADIUS_LENGTH/Math.sqrt(2) ), delta);
	}
	@Test
	public void XYZToLat_Test_004()
	{
		assertEquals(45.0, Transl.xyzToLat( -WorldConstants.EARTH_RADIUS_LENGTH/Math.sqrt(2) ), delta);
	}
	@Test
	public void XYZToLat_Test_005()
	{
		assertEquals(-60.0, Transl.xyzToLat( WorldConstants.EARTH_RADIUS_LENGTH*Math.sqrt(3)/2 ), delta);
	}
	@Test
	public void XYZToLat_Test_006()
	{
		assertEquals(60.0, Transl.xyzToLat( -WorldConstants.EARTH_RADIUS_LENGTH*Math.sqrt(3)/2 ), delta);
	}
	
	
	/******************************************************************************************************************
	 *  latPixToDegEquirect Method TEST 
	 *****************************************************************************************************************/
//	@Test
//	public void latPixToDegEquirect001()
//	{	
//		assertEquals(180.0/100.0 - 90.0, Transl.latPixToDegEquirect(0, 100), delta);
//	}
//	
	
	
	
	/******************************************************************************************************************
	 *  latPixToDegEquirect Method TEST 
	 *****************************************************************************************************************/
	// Ponizsza pierwsza czesc testow opiera sie na zalozeniu, ze translacja z Pix -> Stopni i nastepnie translacja z otrzymanych  
	// Stopnie -> Pix, nie powinna zmienic poczatowej wartosci Pix.
	@Test
	public void latPixToDegEquirect_Test_001()
	{	
		double deg = Transl.latPixToDegEquirect(0, 180);	
		assertEquals(0.0, Transl.latDegToPixEquirect(deg, 180), delta);
	}
	@Test
	public void latPixToDegEquirect_Test_002()
	{	
		double deg = Transl.latPixToDegEquirect(30, 180);		
		assertEquals(30, Transl.latDegToPixEquirect(deg, 180), delta);
	}
	@Test
	public void latPixToDegEquirect_Test_003()
	{	
		double deg = Transl.latPixToDegEquirect(60, 180);		
		assertEquals(60, Transl.latDegToPixEquirect(deg, 180), delta);
	}
	@Test
	public void latPixToDegEquirect_Test_004()
	{	
		double deg = Transl.latPixToDegEquirect(120, 180);		
		assertEquals(120, Transl.latDegToPixEquirect(deg, 180), delta);
	}
	@Test
	public void latPixToDegEquirect_Test_005()
	{	
		double deg = Transl.latPixToDegEquirect(150, 180);		
		assertEquals(150, Transl.latDegToPixEquirect(deg, 180), delta);
	}
	@Test
	public void latPixToDegEquirect_Test_006()
	{	
		double deg = Transl.latPixToDegEquirect(15000, 18000);		
		assertEquals(15000, Transl.latDegToPixEquirect(deg, 18000), delta);
	}
	@Test
	public void latPixToDegEquirect_Test_007()
	{	
		double deg = Transl.latPixToDegEquirect(0, 14001);		
		assertEquals(0, Transl.latDegToPixEquirect(deg, 14001), delta);
	}
	@Test
	public void latPixToDegEquirect_Test_008()
	{	
		double deg = Transl.latPixToDegEquirect(3, 14001);		
		assertEquals(3, Transl.latDegToPixEquirect(deg, 14001), delta);
	}
	@Test
	public void latPixToDegEquirect_Test_009()
	{	
		double deg = Transl.latPixToDegEquirect(1000, 14001);		
		assertEquals(1000, Transl.latDegToPixEquirect(deg, 14001), delta);
	}
	@Test
	public void latPixToDegEquirect_Test_010()
	{	
		double deg = Transl.latPixToDegEquirect(7000, 14001);		
		assertEquals(7000, Transl.latDegToPixEquirect(deg, 14001), delta);
	}
	@Test
	public void latPixToDegEquirect_Test_011()
	{	
		double deg = Transl.latPixToDegEquirect(12000, 14001);		
		assertEquals(12000, Transl.latDegToPixEquirect(deg, 14001), delta);
	}
	@Test
	public void latPixToDegEquirect_Test_012()
	{	
		double deg = Transl.latPixToDegEquirect(14000, 14001);		
		assertEquals(14000, Transl.latDegToPixEquirect(deg, 14001), delta);
	}
	@Test
	public void latPixToDegEquirect_Test_013()
	{	
		double deg = Transl.latPixToDegEquirect(0, 63001);		
		assertEquals(0, Transl.latDegToPixEquirect(deg, 63001), delta);
	}
	@Test
	public void latPixToDegEquirect_Test_014()
	{	
		double deg = Transl.latPixToDegEquirect(5000, 63001);		
		assertEquals(5000, Transl.latDegToPixEquirect(deg, 63001), delta);
	}
	@Test
	public void latPixToDegEquirect_Test_015()
	{	
		double deg = Transl.latPixToDegEquirect(31500, 63001);		
		assertEquals(31500, Transl.latDegToPixEquirect(deg, 63001), delta);
	}
	@Test
	public void latPixToDegEquirect_Test_016()
	{	
		double deg = Transl.latPixToDegEquirect(45000, 63001);		
		assertEquals(45000, Transl.latDegToPixEquirect(deg, 63001), delta);
	}
	@Test
	public void latPixToDegEquirect_Test_017()
	{	
		double deg = Transl.latPixToDegEquirect(63000, 63001);		
		assertEquals(63000, Transl.latDegToPixEquirect(deg, 63001), delta);
	}
	@Test
	public void latPixToDegEquirect_Test_018()
	{	
		double deg = Transl.latPixToDegEquirect(1, 63001);		
		assertEquals(1, Transl.latDegToPixEquirect(deg, 63001), delta);
	}
	
		
	// Ponizsze testy testuja sama nature funkcji Transl.latPixToDegEquirect()
	@Test
	public void latPixToDegEquirect_Test_113()
	{
		assertEquals(-85.0, Transl.latPixToDegEquirect(0, 18), delta);
	}
	@Test
	public void latPixToDegEquirect_Test_114()
	{			
		assertEquals(85.0, Transl.latPixToDegEquirect(17, 18), delta);
	}
	@Test
	public void latPixToDegEquirect_Test_115()
	{			
		assertEquals(5.0, Transl.latPixToDegEquirect(9, 18), delta);
	}
	@Test
	public void latPixToDegEquirect_Test_116()
	{			
		assertEquals(-5.0, Transl.latPixToDegEquirect(8, 18), delta);
	}		
	
	
	
	/******************************************************************************************************************
	 *  longitPixToDegEquirect Method TEST 
	 *****************************************************************************************************************/
	// Ponizsza pierwsza czesc testow opiera sie na zalozeniu, ze translacja z Pix -> Stopni i nastepnie translacja z otrzymanych  
	// Stopnie -> Pix, nie powinna zmienic poczatkowej wartosci Pix.
	@Test
	public void LongitPixToDegEquirect_Test_001()
	{	
		double deg = Transl.longitPixToDegEquirect(0, 180);	
		assertEquals(0.0, Transl.longitDegToPixEquirect(deg, 180), delta);
	}
	@Test
	public void LongitPixToDegEquirect_Test_002()
	{	
		double deg = Transl.longitPixToDegEquirect(30, 180);		
		assertEquals(30, Transl.longitDegToPixEquirect(deg, 180), delta);
	}
	@Test
	public void LongitPixToDegEquirect_Test_003()
	{	
		double deg = Transl.longitPixToDegEquirect(60, 180);		
		assertEquals(60, Transl.longitDegToPixEquirect(deg, 180), delta);
	}
	@Test
	public void LongitPixToDegEquirect_Test_004()
	{	
		double deg = Transl.longitPixToDegEquirect(120, 180);		
		assertEquals(120, Transl.longitDegToPixEquirect(deg, 180), delta);
	}
	@Test
	public void LongitPixToDegEquirect_Test_005()
	{	
		double deg = Transl.longitPixToDegEquirect(150, 180);		
		assertEquals(150, Transl.longitDegToPixEquirect(deg, 180), delta);
	}
	@Test
	public void LongitPixToDegEquirect_Test_006()
	{	
		double deg = Transl.longitPixToDegEquirect(15000, 18000);		
		assertEquals(15000, Transl.longitDegToPixEquirect(deg, 18000), delta);
	}
	@Test
	public void LongitPixToDegEquirect_Test_007()
	{	
		double deg = Transl.longitPixToDegEquirect(0, 14001);		
		assertEquals(0, Transl.longitDegToPixEquirect(deg, 14001), delta);
	}
	@Test
	public void LongitPixToDegEquirect_Test_008()
	{	
		double deg = Transl.longitPixToDegEquirect(3, 14001);		
		assertEquals(3, Transl.longitDegToPixEquirect(deg, 14001), delta);
	}
	@Test
	public void LongitPixToDegEquirect_Test_009()
	{	
		double deg = Transl.longitPixToDegEquirect(1000, 14001);		
		assertEquals(1000, Transl.longitDegToPixEquirect(deg, 14001), delta);
	}
	@Test
	public void LongitPixToDegEquirect_Test_010()
	{	
		double deg = Transl.longitPixToDegEquirect(7000, 14001);		
		assertEquals(7000, Transl.longitDegToPixEquirect(deg, 14001), delta);
	}
	@Test
	public void LongitPixToDegEquirect_Test_011()
	{	
		double deg = Transl.longitPixToDegEquirect(12000, 14001);		
		assertEquals(12000, Transl.longitDegToPixEquirect(deg, 14001), delta);
	}
	@Test
	public void LongitPixToDegEquirect_Test_012()
	{	
		double deg = Transl.longitPixToDegEquirect(14000, 14001);		
		assertEquals(14000, Transl.longitDegToPixEquirect(deg, 14001), delta);
	}
	@Test
	public void LongitPixToDegEquirect_Test_013()
	{	
		double deg = Transl.longitPixToDegEquirect(0, 63001);		
		assertEquals(0, Transl.longitDegToPixEquirect(deg, 63001), delta);
	}
	@Test
	public void LongitPixToDegEquirect_Test_014()
	{	
		double deg = Transl.longitPixToDegEquirect(5000, 63001);		
		assertEquals(5000, Transl.longitDegToPixEquirect(deg, 63001), delta);
	}
	@Test
	public void LongitPixToDegEquirect_Test_015()
	{	
		double deg = Transl.longitPixToDegEquirect(31500, 63001);		
		assertEquals(31500, Transl.longitDegToPixEquirect(deg, 63001), delta);
	}
	@Test
	public void LongitPixToDegEquirect_Test_016()
	{			
		double deg = Transl.longitPixToDegEquirect(45000, 63001);		
		assertEquals(45000, Transl.longitDegToPixEquirect(deg, 63001), delta);
	}
	@Test
	public void LongitPixToDegEquirect_Test_017()
	{	
		double deg = Transl.longitPixToDegEquirect(63000, 63001);		
		assertEquals(63000, Transl.longitDegToPixEquirect(deg, 63001), delta);
	}
	@Test
	public void LongitPixToDegEquirect_Test_018()	
	{	
		double deg = Transl.longitPixToDegEquirect(1, 63001);		
		assertEquals(1, Transl.longitDegToPixEquirect(deg, 63001), delta);
	}
	
		
	// Ponizsze testy testuja sama nature funkcji Transl.longitPixToDegEquirect()
	@Test
	public void LongitPixToDegEquirect_Test_119()
	{
		assertEquals(-170.0, Transl.longitPixToDegEquirect(0, 18), delta);
	}
	@Test
	public void LongitPixToDegEquirect_Test_120()
	{			
		assertEquals(170.0, Transl.longitPixToDegEquirect(17, 18), delta);
	}
	@Test
	public void LongitPixToDegEquirect_Test_121()
	{			
		assertEquals(10.0, Transl.longitPixToDegEquirect(9, 18), delta);
	}
	@Test
	public void LongitPixToDegEquirect_Test_122()
	{			
		assertEquals(-10.0, Transl.longitPixToDegEquirect(8, 18), delta);
	}
	
	
	/******************************************************************************************************************
	 *  longitPixToDegMollweide Method TEST 
	 *****************************************************************************************************************/
	// Dla tej metody wciaz brakuje testow dla nieparzystych dlugosci i wysokosci obrazka !!!!!!!!!!!!!!!!!!!!!!!!!!!!
	
	// Ponizsze 6 testow jest dla translacji pkt lezacych na rowniku
	@Test 
	public void LongitPixToDegMollweide_Test_0010()
	{
		assertEquals(-170.0, Transl.longitPixToDegMollweide(0, 5, 18, 10), delta);	
	}
	@Test 
	public void LongitPixToDegMollweide_Test_0020()
	{
		assertEquals(170.0, Transl.longitPixToDegMollweide(17, 5, 18, 10), delta);	
	}
	
	@Test 
	public void LongitPixToDegMollweide_Test_0030()
	{
		assertEquals(-179.0, Transl.longitPixToDegMollweide(0, 6, 180, 12), delta);	
	}
	@Test 
	public void LongitPixToDegMollweide_Test_0040()
	{
		assertEquals(179.0, Transl.longitPixToDegMollweide(179, 6, 180, 12), delta);	
	}
	@Test 
	public void LongitPixToDegMollweide_Test_0050()
	{
		assertEquals(-179.0, Transl.longitPixToDegMollweide(0, 6, 180, 12), delta);	
	}
	@Test 
	public void LongitPixToDegMollweide_Test_0060()
	{
		assertEquals(179.0, Transl.longitPixToDegMollweide(179, 6, 180, 12), delta);	
	}
	
	// testy dla pkt nie lezacych na rowniku
	
	// Tu powinny sie znalezc testy dla pkt lezacych nie na rowniku.
		
	// Ponizsza pierwsza czesc testow opiera sie na zalozeniu, ze translacja z Pix -> Stopni i nastepnie translacja z otrzymanych  
	// Stopnie -> Pix, nie powinna zmienic poczatkowej wartosci Pix.	
	@Test
	public void LongitPixToDegMollweide_Test_0070()	
	{	
		double deg = Transl.longitPixToDegMollweide(179, 6, 180, 12);		
		assertEquals(179, Transl.longitDegToPixMollweide(deg, 0.0, 180), delta);
	}
	@Test
	public void LongitPixToDegMollweide_Test_0080()	
	{	
		double deg = Transl.longitPixToDegMollweide(0, 6, 180, 12);	
		assertEquals(0.0, Transl.longitDegToPixMollweide(deg, 0.0, 180), delta);
	}
	@Test
	public void LongitPixToDegMollweide_Test_0090()	
	{	
		double deg = Transl.longitPixToDegMollweide(17, 5, 18, 10);		
		assertEquals(17, Transl.longitDegToPixMollweide(deg, 0.0, 18), delta);
	}
	
	/******************************************************************************************************************
	 *  longitDegToPixMollweide Method TEST 
	 *****************************************************************************************************************/
	
	// ponizsze testy dla parzystej i bardzo duzej szerokosci obrazka
	@Test
	public void LongitDegToPixMollweide_Test_0010()
	{
		assertEquals(0, Transl.longitDegToPixMollweide(-180, 0, 20000), delta );
	}
	@Test
	public void LongitDegToPixMollweide_Test_0020()
	{
		assertEquals(19999, Transl.longitDegToPixMollweide(180, 0, 20000), delta );
	}
	@Test
	public void LongitDegToPixMollweide_Test_0030()
	{
		assertEquals(Math.round( 9999.0*(1.0-Math.sqrt(2)/2.0) ), Transl.longitDegToPixMollweide(-180, 45, 20000), delta );
	}
	@Test
	public void LongitDegToPixMollweide_Test_0040()
	{
		assertEquals(Math.round( 9999+10000.0*Math.sqrt(2)/2.0 ), Transl.longitDegToPixMollweide(180, 45, 20000), delta );
	}
	@Test
	public void LongitDegToPixMollweide_Test_0050()
	{
		assertEquals(Math.round( 9999.0/2.0 ), Transl.longitDegToPixMollweide(-180, -60, 20000), delta );
	}
	@Test
	public void LongitDegToPixMollweide_Test_0060()
	{
		assertEquals(Math.round( 9999+10000.0/2.0 ), Transl.longitDegToPixMollweide(180, -60, 20000), delta );
	}
	
	// Ponizsze testy dla nieparzystej szerokosci obrazka
	@Test
	public void LongitDegToPixMollweide_Test_0070()
	{
		assertEquals(0, Transl.longitDegToPixMollweide(-180, 0, 201), delta );
	}
	@Test
	public void LongitDegToPixMollweide_Test_0080()
	{
		assertEquals(200, Transl.longitDegToPixMollweide(180, 0, 201), delta );
	}
	@Test
	public void LongitDegToPixMollweide_Test_0090()
	{
		assertEquals(Math.round( 99.5*(1.0-Math.sqrt(2)/2.0) ), Transl.longitDegToPixMollweide(-180, 45, 201), delta );
	}
	@Test
	public void LongitDegToPixMollweide_Test_0100()
	{
		assertEquals(Math.round( 99.5+100.5*Math.sqrt(2)/2.0 ), Transl.longitDegToPixMollweide(180, 45, 201), delta );
	}
	@Test
	public void LongitDegToPixMollweide_Test_0110()
	{
		assertEquals(Math.round( 99.5/2.0 ), Transl.longitDegToPixMollweide(-180, -60, 201), delta );
	}
	@Test
	public void LongitDegToPixMollweide_Test_0120()
	{
		assertEquals(Math.round( 99.5+100.5/2.0 ), Transl.longitDegToPixMollweide(180, -60, 201), delta );
	}
	@Test
	public void LongitDegToPixMollweide_Test_0130()
	{
		assertEquals(100, Transl.longitDegToPixMollweide(180, 90, 201), delta );
	}
	@Test
	public void LongitDegToPixMollweide_Test_0140()
	{
		assertEquals(100, Transl.longitDegToPixMollweide(-80, 90, 201), delta );
	}
	
	/******************************************************************************************************************
	 *  kmToDegreesOnEquator Method TEST 
	 *****************************************************************************************************************/
	@Test
	public void kmToDegreesOnEquator_Test_1400()
	{
		assertEquals(1.0, Transl.kmToDegreesOnEquator( WorldConstants.EARTH_RADIUS_LENGTH*2*PI / 360.0), delta );
	}
	
	
	/******************************************************************************************************************
	 *  degreesToKmOnEquator Method TEST 
	 *****************************************************************************************************************/
	@Test
	public void degreesToKmOnEquator_Test_1410()
	{
		assertEquals(PI * 2 * WorldConstants.EARTH_RADIUS_LENGTH / 6, Transl.degreesToKmOnEquator(60.0), delta );
	}
	
	
	/******************************************************************************************************************
	 *  degreesToKmOnParallel Method TEST 
	 *****************************************************************************************************************/
	@Test
	public void kmToDegreesOnParallel_Test_1420()
	{
		assertEquals(2.0, Transl.kmToDegreesOnParallel( WorldConstants.EARTH_RADIUS_LENGTH*2*PI / 360.0, 60), delta );
	}
	
	
	/******************************************************************************************************************
	 *  degreesToKmOnParallel Method TEST 
	 *****************************************************************************************************************/
	@Test
	public void degreesToKmOnParallel_Test_1430()
	{
		assertEquals(PI * 2 * WorldConstants.EARTH_RADIUS_LENGTH / 12, Transl.degreesToKmOnParallel(60.0, 60), delta );
	}
	
	
	
	
	
}