package RomanNumeralConverter.RomanNumeralConverterKata;

public class RomanNumeralConverter {

	public static String integerToRomanNumeral(int arabicNumber) {
		String romanResults = "";
		
		while (arabicNumber >= 10) {
			romanResults += "X";
			arabicNumber -= 10;
		}
		while (arabicNumber >= 9) {
			romanResults += "IX";
			arabicNumber -= 9;
		}
		while (arabicNumber >= 5) {
			romanResults += "V";
			arabicNumber -= 5;
		}
		while (arabicNumber >= 4) {
			romanResults += "IV";
			arabicNumber -= 4;
		}
		while (arabicNumber >= 1) {
			romanResults += "I";
			arabicNumber -= 1;
		}
		return romanResults;
	}

}