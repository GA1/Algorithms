package mapcom.math.transl.Equirectangular;

import static org.junit.Assert.*;

import org.junit.Test;

public class EquirectangularPixelsToCoordinatesTranslatorTest {

	EquirectangularCoordinatesToPixelsTranslator translator = new EquirectangularCoordinatesToPixelsTranslator();
	double delta = 0.00000000001;  // 10 trylionowych, o tyle conajwyzej moze byc blad w double'ach
	
	/******************************************************************************************************************
	 *  longitDegToPixEquirect Method TEST 
	 *****************************************************************************************************************/
	// Sprawdzic trzeba, czy dla obrazka o wysokosci WIDTH, dla 180 stopni otrzymuje sie piksel HEIGHT-1, oraz
	// czy dla -180 stopni otrzymuje sie 0. Oprocz tego dla nieparzystych WIDTH dla wysokosci geograficznej 0.0 
	// powinnismy otrzymac adres WIDTH-1/2
	@Test
	public void LongitDegToPixEquirect_Test_001()
	{	
		assertEquals(90, translator.longitudeInDegreesToPixels(0.0, 180), delta);
	}
	@Test
	public void LongitDegToPixEquirect_Test_002()
	{	
		assertEquals(0.0, translator.longitudeInDegreesToPixels(-180.0, 180), delta);
	}	
	
	@Test
	public void LongitDegToPixEquirect_Test_003()
	{
		assertEquals(179.0, translator.longitudeInDegreesToPixels(180.0, 180), delta);
	}
	@Test
	public void LongitDegToPixEquirect_Test_004()
	{
		assertEquals(85, translator.longitudeInDegreesToPixels(0.0, 171), delta);
	}
	@Test
	public void LongitDegToPixEquirect_Test_005()
	{	
		assertEquals(0.0, translator.longitudeInDegreesToPixels(-180.0, 171), delta);
	}
	@Test
	public void LongitDegToPixEquirect_Test_006()
	{	
		assertEquals(170, translator.longitudeInDegreesToPixels(180.0, 171), delta);
	}
	@Test
	public void LongitDegToPixEquirect_Test_007()
	{	
		assertEquals(8550, translator.longitudeInDegreesToPixels(0.0, 17101), delta);
	}
	@Test
	public void LongitDegToPixEquirect_Test_008()
	{	
		assertEquals(0.0, translator.longitudeInDegreesToPixels(-180.0, 17101), delta);
	}
	@Test
	public void LongitDegToPixEquirect_Test_009()
	{	
		assertEquals(17100, translator.longitudeInDegreesToPixels(180.0, 17101), delta);
	}
	@Test
	public void LongitDegToPixEquirect_Test_010()
	{	
		assertEquals(9, translator.longitudeInDegreesToPixels(90.0, 13), delta);
	}
	@Test
	public void LongitDegToPixEquirect_Test_011()
	{	
		assertEquals(3, translator.longitudeInDegreesToPixels(-90.0, 13), delta);
	}
	@Test
	public void LongitDegToPixEquirect_Test_012()
	{	
		assertEquals(4, translator.longitudeInDegreesToPixels(-60.0, 13), delta);
	}
	@Test
	public void LongitDegToPixEquirect_Test_013()
	{	
		assertEquals(2, translator.longitudeInDegreesToPixels(-120.0, 13), delta);
	}
	@Test
	public void LongitDegToPixEquirect_Test_014()
	{	
		assertEquals(8, translator.longitudeInDegreesToPixels(60.0, 13), delta);
	}
	@Test
	public void LongitDegToPixEquirect_Test_015()
	{	
		assertEquals(10, translator.longitudeInDegreesToPixels(120.0, 13), delta);
	}
	@Test
	public void LongitDegToPixEquirect_Test_016()
	{	
		assertEquals(0, translator.longitudeInDegreesToPixels(-180.0, 15007), delta);
	}
	@Test
	public void LongitDegToPixEquirect_Test_017()
	{		
		assertEquals(2501, translator.longitudeInDegreesToPixels(-120.0, 15007), delta);
	}
	@Test
	public void LongitDegToPixEquirect_Test_018()
	{
		assertEquals(5002, translator.longitudeInDegreesToPixels(-60.0, 15007), delta);
	}
	@Test
	public void LongitDegToPixEquirect_Test_019()
	{
		assertEquals(7503, translator.longitudeInDegreesToPixels(0.0, 15007), delta);
	}
	@Test
	public void LongitDegToPixEquirect_Test_020()
	{
		assertEquals(10004, translator.longitudeInDegreesToPixels(60.0, 15007), delta);
	}
	@Test
	public void LongitDegToPixEquirect_Test_021()
	{
		assertEquals(12505, translator.longitudeInDegreesToPixels(120.0, 15007), delta);
	}
	@Test
	public void LongitDegToPixEquirect_Test_022()
	{
		assertEquals(15006, translator.longitudeInDegreesToPixels(180.0, 15007), delta);
	}
	
	/******************************************************************************************************************
	 *  latPixToDegEquirect Method TEST 
	 *****************************************************************************************************************/
	// Ponizsza pierwsza czesc testow opiera sie na zalozeniu, ze translacja z Pix -> Stopni i nastepnie translacja z otrzymanych  
	// Stopnie -> Pix, nie powinna zmienic poczatowej wartosci Pix.
	@Test
	public void latPixToDegEquirect_Test_001()
	{	
		double deg = translator.latPixToDegEquirect(0, 180);	
		assertEquals(0.0, translator.latitudeInDegreesToPixels(deg, 180), delta);
	}
	@Test
	public void latPixToDegEquirect_Test_002()
	{	
		double deg = translator.latPixToDegEquirect(30, 180);		
		assertEquals(30, translator.latitudeInDegreesToPixels(deg, 180), delta);
	}
	@Test
	public void latPixToDegEquirect_Test_003()
	{	
		double deg = translator.latPixToDegEquirect(60, 180);		
		assertEquals(60, translator.latitudeInDegreesToPixels(deg, 180), delta);
	}
	@Test
	public void latPixToDegEquirect_Test_004()
	{	
		double deg = translator.latPixToDegEquirect(120, 180);		
		assertEquals(120, translator.latitudeInDegreesToPixels(deg, 180), delta);
	}
	@Test
	public void latPixToDegEquirect_Test_005()
	{	
		double deg = translator.latPixToDegEquirect(150, 180);		
		assertEquals(150, translator.latitudeInDegreesToPixels(deg, 180), delta);
	}
	@Test
	public void latPixToDegEquirect_Test_006()
	{	
		double deg = translator.latPixToDegEquirect(15000, 18000);		
		assertEquals(15000, translator.latitudeInDegreesToPixels(deg, 18000), delta);
	}
	@Test
	public void latPixToDegEquirect_Test_007()
	{	
		double deg = translator.latPixToDegEquirect(0, 14001);		
		assertEquals(0, translator.latitudeInDegreesToPixels(deg, 14001), delta);
	}
	@Test
	public void latPixToDegEquirect_Test_008()
	{	
		double deg = translator.latPixToDegEquirect(3, 14001);		
		assertEquals(3, translator.latitudeInDegreesToPixels(deg, 14001), delta);
	}
	@Test
	public void latPixToDegEquirect_Test_009()
	{	
		double deg = translator.latPixToDegEquirect(1000, 14001);		
		assertEquals(1000, translator.latitudeInDegreesToPixels(deg, 14001), delta);
	}
	@Test
	public void latPixToDegEquirect_Test_010()
	{	
		double deg = translator.latPixToDegEquirect(7000, 14001);		
		assertEquals(7000, translator.latitudeInDegreesToPixels(deg, 14001), delta);
	}
	@Test
	public void latPixToDegEquirect_Test_011()
	{	
		double deg = translator.latPixToDegEquirect(12000, 14001);		
		assertEquals(12000, translator.latitudeInDegreesToPixels(deg, 14001), delta);
	}
	@Test
	public void latPixToDegEquirect_Test_012()
	{	
		double deg = translator.latPixToDegEquirect(14000, 14001);		
		assertEquals(14000, translator.latitudeInDegreesToPixels(deg, 14001), delta);
	}
	@Test
	public void latPixToDegEquirect_Test_013()
	{	
		double deg = translator.latPixToDegEquirect(0, 63001);		
		assertEquals(0, translator.latitudeInDegreesToPixels(deg, 63001), delta);
	}
	@Test
	public void latPixToDegEquirect_Test_014()
	{	
		double deg = translator.latPixToDegEquirect(5000, 63001);		
		assertEquals(5000, translator.latitudeInDegreesToPixels(deg, 63001), delta);
	}
	@Test
	public void latPixToDegEquirect_Test_015()
	{	
		double deg = translator.latPixToDegEquirect(31500, 63001);		
		assertEquals(31500, translator.latitudeInDegreesToPixels(deg, 63001), delta);
	}
	@Test
	public void latPixToDegEquirect_Test_016()
	{	
		double deg = translator.latPixToDegEquirect(45000, 63001);		
		assertEquals(45000, translator.latitudeInDegreesToPixels(deg, 63001), delta);
	}
	@Test
	public void latPixToDegEquirect_Test_017()
	{	
		double deg = translator.latPixToDegEquirect(63000, 63001);		
		assertEquals(63000, translator.latitudeInDegreesToPixels(deg, 63001), delta);
	}
	@Test
	public void latPixToDegEquirect_Test_018()
	{	
		double deg = translator.latPixToDegEquirect(1, 63001);		
		assertEquals(1, translator.latitudeInDegreesToPixels(deg, 63001), delta);
	}
	
		
	// Ponizsze testy testuja sama nature funkcji translator.latPixToDegEquirect()
	@Test
	public void latPixToDegEquirect_Test_113()
	{
		assertEquals(-85.0, translator.latPixToDegEquirect(0, 18), delta);
	}
	@Test
	public void latPixToDegEquirect_Test_114()
	{			
		assertEquals(85.0, translator.latPixToDegEquirect(17, 18), delta);
	}
	@Test
	public void latPixToDegEquirect_Test_115()
	{			
		assertEquals(5.0, translator.latPixToDegEquirect(9, 18), delta);
	}
	@Test
	public void latPixToDegEquirect_Test_116()
	{			
		assertEquals(-5.0, translator.latPixToDegEquirect(8, 18), delta);
	}		


}
