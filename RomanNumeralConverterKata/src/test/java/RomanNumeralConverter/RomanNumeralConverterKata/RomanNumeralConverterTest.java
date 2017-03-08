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

}
