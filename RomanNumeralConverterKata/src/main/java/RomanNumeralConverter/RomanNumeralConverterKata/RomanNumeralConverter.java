package RomanNumeralConverter.RomanNumeralConverterKata;

public class RomanNumeralConverter {

	public static String integerToRomanNumeral(int arabicNumber) {
		String romanResults = "";
		while (arabicNumber >= 1) {
			romanResults += "I";
			arabicNumber -= 1;
		}
		return romanResults;
	}

}