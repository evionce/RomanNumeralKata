package RomanNumeralConverter.RomanNumeralConverterKata;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumeralConverterTest {

	@Test
	public void passConverterZeroReturnNothing() {
		assertEquals("", RomanNumeralConverter.integerToRomanNumeral(0));

	}

	@Test
	public void passConverterOneReturn1() {
		assertEquals("I", RomanNumeralConverter.integerToRomanNumeral(1));

	}

	@Test
	public void passConverter2ReturnII() {
		assertEquals("II", RomanNumeralConverter.integerToRomanNumeral(2));

	}

	@Test
	public void passConverter3ReturnIII() {
		assertEquals("III", RomanNumeralConverter.integerToRomanNumeral(3));

	}

	@Test
	public void passConverter4ReturnIV() {
		assertEquals("IV", RomanNumeralConverter.integerToRomanNumeral(4));

	}

	@Test
	public void passConverter5ReturnV() {
		assertEquals("V", RomanNumeralConverter.integerToRomanNumeral(5));

	}

	@Test
	public void passConverter6ReturnVI() {
		assertEquals("VI", RomanNumeralConverter.integerToRomanNumeral(6));

	}

	@Test
	public void passConverter9ReturnIX() {
		assertEquals("IX", RomanNumeralConverter.integerToRomanNumeral(9));

	}

	@Test
	public void passConverter10ReturnX() {
		assertEquals("X", RomanNumeralConverter.integerToRomanNumeral(10));

	}

	@Test
	public void passConverter20ReturnXX() {
		assertEquals("XX", RomanNumeralConverter.integerToRomanNumeral(20));

	}

	@Test
	public void passConverter29ReturnXXIX() {
		assertEquals("XXIX", RomanNumeralConverter.integerToRomanNumeral(29));

	}

	@Test
	public void passConverter34ReturnXXXIV() {
		assertEquals("XXXIV", RomanNumeralConverter.integerToRomanNumeral(34));

	}

	@Test
	public void passConverter40ReturnXL() {
		assertEquals("XL", RomanNumeralConverter.integerToRomanNumeral(40));

	}

	@Test
	public void passConverter50ReturnL() {
		assertEquals("L", RomanNumeralConverter.integerToRomanNumeral(50));

	}

	@Test
	public void passConverter90ReturnXC() {
		assertEquals("XC", RomanNumeralConverter.integerToRomanNumeral(90));

	}

	@Test
	public void passConverter100ReturnC() {
		assertEquals("C", RomanNumeralConverter.integerToRomanNumeral(100));

	}

	@Test
	public void passConverter99ReturnXCIX() {
		assertEquals("XCIX", RomanNumeralConverter.integerToRomanNumeral(99));

	}

	@Test
	public void passConverter44ReturnXLIV() {
		assertEquals("XLIV", RomanNumeralConverter.integerToRomanNumeral(44));

	}

	@Test
	public void passConverter400ReturnCD() {
		assertEquals("CD", RomanNumeralConverter.integerToRomanNumeral(400));

	}

	@Test
	public void passConverter500ReturnD() {
		assertEquals("D", RomanNumeralConverter.integerToRomanNumeral(500));

	}

	@Test
	public void passConverter900ReturnCM() {
		assertEquals("CM", RomanNumeralConverter.integerToRomanNumeral(900));

	}

	@Test
	public void passConverter1000ReturnM() {
		assertEquals("M", RomanNumeralConverter.integerToRomanNumeral(1000));

	}

	@Test
	public void passConverter1444ReturnMCDXLIV() {
		assertEquals("MCDXLIV", RomanNumeralConverter.integerToRomanNumeral(1444));

	}

	@Test
	public void passConverter2903ReturnMMCMIII() {
		assertEquals("MMCMIII", RomanNumeralConverter.integerToRomanNumeral(2903));

	}
///////////////***************\\\\\\\\\\\\\\\\
	
	@Test
	public void passConverterNothingReturn0() {
		assertEquals(0, RomanNumeralConverter.romanNumeralToInteger(""));

	}
	@Test
	public void passConverterIReturn1() {
		assertEquals(1, RomanNumeralConverter.romanNumeralToInteger("I"));

	}
	@Test
	public void passConverterIIReturn2() {
		assertEquals(2, RomanNumeralConverter.romanNumeralToInteger("II"));

	}
	@Test
	public void passConverterVReturn5() {
		assertEquals(5, RomanNumeralConverter.romanNumeralToInteger("V"));

	}
	@Test
	public void passConverterIVReturn4() {
		assertEquals(4, RomanNumeralConverter.romanNumeralToInteger("IV"));

	}
	@Test
	public void passConverterXReturn10() {
		assertEquals(10, RomanNumeralConverter.romanNumeralToInteger("X"));

	}
	@Test
	public void passConverterXReturn14() {
		assertEquals(14, RomanNumeralConverter.romanNumeralToInteger("XIV"));

	}
	@Test
	public void passConverterXXXIVReturn34() {
		assertEquals(34, RomanNumeralConverter.romanNumeralToInteger("XXXIV"));

	}
	@Test
	public void passConverterXLReturn40() {
		assertEquals(40, RomanNumeralConverter.romanNumeralToInteger("XL"));

	}
	@Test
	public void passConverterLReturn50() {
		assertEquals(50, RomanNumeralConverter.romanNumeralToInteger("L"));

	}
	@Test
	public void passConverterCReturn100() {
		assertEquals(100, RomanNumeralConverter.romanNumeralToInteger("C"));

	}
	@Test
	public void passConverterDReturn500() {
		assertEquals(500, RomanNumeralConverter.romanNumeralToInteger("D"));

	}
	@Test
	public void passConverterMReturn1000() {
		assertEquals(1000, RomanNumeralConverter.romanNumeralToInteger("M"));

	}
	@Test
	public void passConverterMCDXLIVReturn1444() {
		assertEquals(1444, RomanNumeralConverter.romanNumeralToInteger("MCDXLIV"));

	}
	@Test
	public void passConverterMMCMIIIReturn2903() {
		assertEquals(2903, RomanNumeralConverter.romanNumeralToInteger("MMCMIII"));

	}
	
	
}
