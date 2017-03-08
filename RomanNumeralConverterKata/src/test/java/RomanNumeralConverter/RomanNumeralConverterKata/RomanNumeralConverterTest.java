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

}
