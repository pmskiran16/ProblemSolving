package com.practice;

public class PossibleCombinations {

	public static int givenNumberLen = 3;
	public String number = "12345678";
	public int numberLen = -1;

	public static void main(String[] args) {

		// For printCombinations.
		/*PossibleCombinations possibleCombinations = new PossibleCombinations();
		possibleCombinations.numberLen = possibleCombinations.number.length();
		possibleCombinations.printCombinationsWithRepeatation(new StringBuilder(""));*/

		// For printCombinations.
		 String givenNumber = "123";
		 givenNumberLen = givenNumber.length();
		 new PossibleCombinations().printCombinations(new StringBuffer(""), new StringBuffer(givenNumber));
	}

	/**
	 * Permutation with repeat of digits.
	 */
	public String printCombinationsWithRepeatation(StringBuilder preFix) {
		if (preFix.length() == numberLen) {
			return preFix.toString();
		}

		for (int i = 0; i < numberLen; i++) {
			String result = printCombinationsWithRepeatation(new StringBuilder(preFix.toString() + number.charAt(i)));
			if (result.length() > 0) {
				System.out.println("result :: " + result);
			}
		}

		return "";
	}

	/**
	 * With out repeat of digits.
	 */
	public String printCombinations(StringBuffer preFix, StringBuffer number) {
		if (number.length() == 1) {
			return number.toString();
		}

		for (int i = 0; i < number.length(); i++) {
			StringBuffer tempString = new StringBuffer(number);
			String resultStr = printCombinations(preFix.append(tempString.charAt(i)), tempString.deleteCharAt(i));

			if ((preFix + resultStr).length() == givenNumberLen)
				System.out.println("Number :: " + preFix + resultStr);

			preFix.deleteCharAt(preFix.length() - 1);
		}

		return "";
	}
}
