/*
* numberToString.java
* Made for Viope course, chapter seven
* (c) Viope Solutions Oy
*/
import java.util.Scanner;
/**
* Program asks for numbers, printing a character string of them on screen.
* E.g. the character string of 32 is thirty-two. If the given number is 
* bigger than 9999, number is printed as is. Numbers are asked until
* a negative number is given as input.
*/
	public class numberToString {
	/**
	* Returns the character string thousand, two thousand,  nine thousand depending on 
	* the given parameter. Uses changeOnes for help.
	*
	* @param t number between 1-9
	* @return character string of the given number (e.g. "two thousand")
	*/
	private static String changeThousands(int t) {
		if (t == 1) {
			return "thousand";
		} else {
			String cs = changeOnes(t);
			cs += "thousand";
			return cs;
		}
	}
	/**
	* Returns the character string hundred, two hundred,  nine hundred depending on
	* the given parameter. Uses changeOnes for help. 
	*
	* @param s number between 1-9
	* @return character string of the given number (e.g. "two hundred")
	*/
	private static String changeHundreds(int s) {
		if (s == 1) {
			return "hundred";
		} else {
			String cs = changeOnes(s);
			cs += "hundred";
			return cs;
		}
	}
	/**
	* Returns the character string one, two,  nine, depending on the given parameter.
	*
	* @param s number between 1-9
	* @return character string of the given number (e.g. "six")
	*/
	private static String changeOnes(int y) {
		/* break statements have been left out from the switch statement because exit is done with return statement */
		switch (y) {
			case 1:
				return "one";
			case 2:
				return "two";
			case 3:
				return "three";
			case 4:
				return "four";
			case 5:
				return "five";
			case 6:
				return "six";
			case 7:
				return "seven";
			case 8:
				return "eight";
			case 9:
				return "nine";
			default:
				return "error";
		}
	}
	/**
	* Returns the character string depending on the given parameter.
	* Parameter is an integer between 1 and 99.
	* E.g. character string of the number 32 is thirty-two.
	*
	* @param k number between 1-99
	* @return character string
	*/
	private static String changeTensAndOnes(int k) {
		String numberCs = "";
		if (k >= 20) {
			// tens if there are any
			if (k / 10 != 0) {
				numberCs += changeOnes(k / 10);
				numberCs += "tens";
			}
			// ones if there are any
			if (k % 10 != 0)
				numberCs += changeOnes(k % 10);
			} else if (k < 20 && k > 10) { // words ending with teen
				numberCs += changeOnes(k % 10);
				numberCs += "teen";
			} else if (k == 10) {
				return "ten";
			} else { // numbers 0-9
				numberCs += changeOnes(k);
		}
		return numberCs;
	}
	/**
	* Returns the character string depending on the given parameter.
	* Parameter can be a positive integer or zero.
	* Only numbers 0-9999 are changed: 1 --> "one",
	* 2 --> "two" etc. bigger numbers than this are changed to character strings
	* as follows: 10000 --> "10000", 10001 -> "10001" etc.
	*
		* @param k number >= 0
	* @return characterstring
	*/
	private static String numberToString (int number) {
		String numberCs = "";
		if (number > 0 && number <= 9999) {
			// thousands
			int thousands = number / 1000;
			if (thousands != 0)
				numberCs += changeThousands(thousands);
			// hundreds
			int hundreds = (number % 1000) / 100;
			if (hundreds !=0)
				numberCs += changeHundreds(hundreds);
			// tens and ones
			int tao = (number % 100);
			if (tao != 0)
			numberCs += changeTensAndOnes(tao);
		} else if (number == 0) { // zero
			numberCs += "zero";
		} else { // number bigger than 9999, no change
			numberCs += number;
		}
		return numberCs;
	}
	// MAIN METHO/existing-content//existing-content//existing-content//existing-content//existing-content////
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String info = "o- - - - - - - -\n" +
			"| Program creates a character string from a positive integer\n" +
			"| Numbers bigger than 9999 are not changed.\n" +
			"| End program by typing a negative integer.\n" +
			"o- - - - - - - -\n";
		int number;
		System.out.println(info);
		do {
			System.out.print("Type in number: ");
			number = reader.nextInt();
			if (number < 0)
				System.out.println("Nice doing business with you!");
			else
				System.out.println(number +" -->" + numberToString(number));
		} while (number >= 0);
	}
}

