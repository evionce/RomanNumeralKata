package RomanNumeralConverter.RomanNumeralConverterKata;

public class RomanNumeralConverter {

	public static int romanNumeralToInteger(String romanNumeral) {
		int resultNum = 0;
		for (int i = romanNumeral.length() - 1; i >= 0; i--) {
			int Ivalue = 1;
			int Vvalue = 5;
			if (romanNumeral.contains("I")) {
				resultNum += Ivalue;
			} else if (romanNumeral.contains("V")) {
				resultNum += Vvalue;
			}
		}
		return resultNum;
	}

	public static String integerToRomanNumeral(int arabicNumber) {
		String romanResults = "";

		while (arabicNumber >= 1000) {
			romanResults += "M";
			arabicNumber -= 1000;
		}
		while (arabicNumber >= 900) {
			romanResults += "CM";
			arabicNumber -= 900;
		}
		while (arabicNumber >= 500) {
			romanResults += "D";
			arabicNumber -= 500;
		}
		while (arabicNumber >= 400) {
			romanResults += "CD";
			arabicNumber -= 400;
		}
		while (arabicNumber >= 100) {
			romanResults += "C";
			arabicNumber -= 100;
		}
		while (arabicNumber >= 90) {
			romanResults += "XC";
			arabicNumber -= 90;
		}
		while (arabicNumber >= 50) {
			romanResults += "L";
			arabicNumber -= 50;
		}
		while (arabicNumber >= 40) {
			romanResults += "XL";
			arabicNumber -= 40;
		}
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