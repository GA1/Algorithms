package mapcom.math.transl.Equirectangular;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EquirectangularCoordinatesToPixelsTranslatorTest {

	EquirectangularCoordinatesToPixelsTranslator translator = new EquirectangularCoordinatesToPixelsTranslator();
	double degrees;
	int evenWidth, oddWidth; 
	
	/******************************************************************************************************************
	 *  longitDegToPixEquirect Method TEST 
	 *****************************************************************************************************************/
	// Sprawdzic trzeba, czy dla obrazka o wysokosci WIDTH, dla 180 stopni otrzymuje sie piksel HEIGHT-1, oraz
	// czy dla -180 stopni otrzymuje sie 0. Oprocz tego dla nieparzystych WIDTH dla wysokosci geograficznej 0.0 
	// powinnismy otrzymac adres WIDTH-1/2
	@Test
	public void LongitDegToPixEquirect_Test_001() {
		assertEquals(90, translator.longitudeInDegreesToPixels(0, 180));
	}
	
	@Test
	public void LongitDegToPixEquirect_Test_002() {		
		assertEquals(0, translator.longitudeInDegreesToPixels(-180.0, 180));
	}	
	
	@Test
	public void LongitDegToPixEquirect_Test_003() {
		assertEquals(179, translator.longitudeInDegreesToPixels(180.0, 180));
	}
	
	@Test
	public void LongitDegToPixEquirect_Test_004() {
		assertEquals(85, translator.longitudeInDegreesToPixels(0.0, 171));
	}
	
	@Test
	public void LongitDegToPixEquirect_Test_005() {	
		assertEquals(0, translator.longitudeInDegreesToPixels(-180.0, 171));
	}
	
	@Test
	public void LongitDegToPixEquirect_Test_006() {	
		assertEquals(170, translator.longitudeInDegreesToPixels(180.0, 171));
	}
	
	@Test
	public void LongitDegToPixEquirect_Test_007() {	
		assertEquals(8550, translator.longitudeInDegreesToPixels(0.0, 17101));
	}
	
	@Test
	public void LongitDegToPixEquirect_Test_008() {	
		assertEquals(0, translator.longitudeInDegreesToPixels(-180.0, 17101));
	}
	
	@Test
	public void LongitDegToPixEquirect_Test_009() {	
		assertEquals(17100, translator.longitudeInDegreesToPixels(180.0, 17101));
	}
	
	@Test
	public void LongitDegToPixEquirect_Test_010() {	
		assertEquals(9, translator.longitudeInDegreesToPixels(90.0, 13));
	}
	
	@Test
	public void LongitDegToPixEquirect_Test_011() {	
		assertEquals(3, translator.longitudeInDegreesToPixels(-90.0, 13));
	}
	
	@Test
	public void LongitDegToPixEquirect_Test_012() {	
		assertEquals(4, translator.longitudeInDegreesToPixels(-60.0, 13));
	}
	
	@Test
	public void LongitDegToPixEquirect_Test_013(){	
		assertEquals(2, translator.longitudeInDegreesToPixels(-120.0, 13));
	}
	
	@Test
	public void LongitDegToPixEquirect_Test_014() {	
		assertEquals(8, translator.longitudeInDegreesToPixels(60.0, 13));
	}
	
	@Test
	public void LongitDegToPixEquirect_Test_015() {	
		assertEquals(10, translator.longitudeInDegreesToPixels(120.0, 13));
	}
	
	@Test
	public void LongitDegToPixEquirect_Test_016() {	
		assertEquals(0, translator.longitudeInDegreesToPixels(-180.0, 15007));
	}
	
	@Test
	public void LongitDegToPixEquirect_Test_017() {		
		assertEquals(2501, translator.longitudeInDegreesToPixels(-120.0, 15007));
	}
	
	@Test
	public void LongitDegToPixEquirect_Test_018() {
		assertEquals(5002, translator.longitudeInDegreesToPixels(-60.0, 15007));
	}
	
	@Test
	public void LongitDegToPixEquirect_Test_019() {
		assertEquals(7503, translator.longitudeInDegreesToPixels(0.0, 15007));
	}
	
	@Test
	public void LongitDegToPixEquirect_Test_020() {
		assertEquals(10004, translator.longitudeInDegreesToPixels(60.0, 15007));
	}
	
	@Test
	public void LongitDegToPixEquirect_Test_021() {
		assertEquals(12505, translator.longitudeInDegreesToPixels(120.0, 15007));
	}
	
	@Test
	public void LongitDegToPixEquirect_Test_022() {
		assertEquals(15006, translator.longitudeInDegreesToPixels(180.0, 15007));
	}
	

	/******************************************************************************************************************
	 *  latDegToPixEquirect Method TEST 
	 *****************************************************************************************************************/
	// Sprawdzic trzeba, czy dla obrazka o wysokosci HEIGHT, dla 90 stopni otrzymuje sie piksel HEIGHT-1, oraz
	// czy dla -90 stopni otrzymuje sie 0. Oprocz tego dla nieparzystych HEIGHT dla wysokosci geograficznej 0.0 
	// powinnismy otrzymac adres HEIGHT-1/2
	@Test
	public void LatDegToPixEquirect_Test_001() {	
		assertEquals(90, translator.latitudeInDegreesToPixels(0.0, 180));
	}
	
	@Test
	public void LatDegToPixEquirect_Test_002() {	
		assertEquals(0, translator.latitudeInDegreesToPixels(-90.0, 180));
	}	
	
	@Test
	public void LatDegToPixEquirect_Test_003() {	
		assertEquals(179, translator.latitudeInDegreesToPixels(90.0, 180));
	}
	
	@Test
	public void LatDegToPixEquirect_Test_004() {
		assertEquals(85, translator.latitudeInDegreesToPixels(0.0, 171));
	}
	
	@Test
	public void LatDegToPixEquirect_Test_005() {	
		assertEquals(0, translator.latitudeInDegreesToPixels(-90.0, 171));
	}
	
	@Test
	public void LatDegToPixEquirect_Test_006() {	
		assertEquals(170, translator.latitudeInDegreesToPixels(90.0, 171));
	}
	
	@Test
	public void LatDegToPixEquirect_Test_007() {	
		assertEquals(8550, translator.latitudeInDegreesToPixels(0.0, 17101));
	}
	
	@Test
	public void LatDegToPixEquirect_Test_008() {	
		assertEquals(0, translator.latitudeInDegreesToPixels(-90.0, 17101));
	}
	
	@Test
	public void LatDegToPixEquirect_Test_009() {	
		assertEquals(17100, translator.latitudeInDegreesToPixels(90.0, 17101));
	}
	
	@Test
	public void LatDegToPixEquirect_Test_010() {	
		assertEquals(9, translator.latitudeInDegreesToPixels(45.0, 13));
	}
	
	@Test
	public void LatDegToPixEquirect_Test_011() {	
		assertEquals(3, translator.latitudeInDegreesToPixels(-45.0, 13));
	}
	
	@Test
	public void LatDegToPixEquirect_Test_012() {	
		assertEquals(4, translator.latitudeInDegreesToPixels(-30.0, 13));
	}
	
	@Test
	public void LatDegToPixEquirect_Test_013() {	
		assertEquals(2, translator.latitudeInDegreesToPixels(-60.0, 13));
	}
	
	@Test
	public void LatDegToPixEquirect_Test_014() {	
		assertEquals(8, translator.latitudeInDegreesToPixels(30.0, 13));
	}
	
	@Test
	public void LatDegToPixEquirect_Test_015() {	
		assertEquals(10, translator.latitudeInDegreesToPixels(60.0, 13));
	}		
	
	@Test
	public void LatDegToPixEquirect_Test_016() {	
		assertEquals(0, translator.latitudeInDegreesToPixels(-90.0, 15007));
	}
	
	@Test
	public void LatDegToPixEquirect_Test_017() {		
		assertEquals(2501, translator.latitudeInDegreesToPixels(-60.0, 15007));
	}
	
	@Test
	public void LatDegToPixEquirect_Test_018() {
		assertEquals(5002, translator.latitudeInDegreesToPixels(-30.0, 15007));
	}
	
	@Test
	public void LatDegToPixEquirect_Test_019() {
		assertEquals(7503, translator.latitudeInDegreesToPixels(0.0, 15007));
	}
	
	@Test
	public void LatDegToPixEquirect_Test_020() {
		assertEquals(10004, translator.latitudeInDegreesToPixels(30.0, 15007));
	}
	
	@Test
	public void LatDegToPixEquirect_Test_021() {
		assertEquals(12505, translator.latitudeInDegreesToPixels(60.0, 15007));
	}
	
	@Test
	public void LatDegToPixEquirect_Test_022()
	{
		assertEquals(15006, translator.latitudeInDegreesToPixels(90.0, 15007));
	}
	

}
