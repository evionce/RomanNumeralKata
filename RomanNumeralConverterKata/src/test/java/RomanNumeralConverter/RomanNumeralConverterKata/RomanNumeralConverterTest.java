package RomanNumeralConverter.RomanNumeralConverterKata;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumeralConverterTest {

	@Test
	public void passConverterZeroReturnNothing() {
		assertEquals("", RomanNumeralConverter.integerToRomanNumeral(0));

	}

}
