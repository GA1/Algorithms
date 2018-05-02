import org.junit.Assert;
import org.junit.Test;


public class RomanNumberConverterTest {

	private RomanNumberConverter converter = new RomanNumberConverter();

	@Test
	public void oneValidSymbolTest(){
		Assert.assertEquals(converter.convert("I"), 1);
		Assert.assertEquals(converter.convert("V"), 5);
		Assert.assertEquals(converter.convert("X"), 10);
		Assert.assertEquals(converter.convert("L"), 50);
		Assert.assertEquals(converter.convert("C"), 100);
		Assert.assertEquals(converter.convert("D"), 500);
		Assert.assertEquals(converter.convert("M"), 1000);
	}

	@Test
	public void twoIdenticalValidSymbolsTest(){
		Assert.assertEquals(converter.convert("II"), 2);
		Assert.assertEquals(converter.convert("XX"), 20);
	}

	@Test
	public void threeIdenticalValidSymbolsTest(){
		Assert.assertEquals(converter.convert("III"), 3);
		Assert.assertEquals(converter.convert("CCC"), 300);
		Assert.assertEquals(converter.convert("MMM"), 3000);
	}

	@Test
	public void validSubtractionTest(){
		Assert.assertEquals(converter.convert("IV"), 4);
		Assert.assertEquals(converter.convert("IX"), 9);
		Assert.assertEquals(converter.convert("CM"), 900);
	}

	@Test
	public void validSymbolsStringTest(){
		Assert.assertEquals(converter.convert("XIX"), 19);
		Assert.assertEquals(converter.convert("XXXIII"), 33);
		Assert.assertEquals(converter.convert("CXLVII"), 147);
		Assert.assertEquals(converter.convert("CCCLXV"), 365);
		Assert.assertEquals(converter.convert("XCIV"), 94);
		Assert.assertEquals(converter.convert("CCLXXXIX"), 289);
		Assert.assertEquals(converter.convert("MCMXCVII"), 1997);
		Assert.assertEquals(converter.convert("DCCCXCVIII"), 898);
		Assert.assertEquals(converter.convert("DCCLXIX"), 769);
		Assert.assertEquals(converter.convert("MMMDXLVIII"), 3548);
		Assert.assertEquals(converter.convert("MMCMLXXI"), 2971);
	}

}



