public class CharReverse {
	
	/*
	* reverse method
	*/
	private static char[] turn(char[] characters) {
		/* returning array to same size as the one received as parameter */
		char[] retuning = new char[characters.length];
		int j = 0;
		for (int i = characters.length-1; i >= 0; --i) {
			retuning[j] = characters[i];
			j++;
		}
		// return the array
		return retuning;
	}

	/*
	* printer method
	*/
	private static void printer(char[] characters) {
		for (int i = 0; i < characters.length; ++i) {
			System.out.print(characters[i]);
		}
		System.out.println();
	}

	// main method
	public static void main(String[] args) {
		char[] characterTable = {'V', 'i', 'o', 'p', 'e'};
		char[] reverse;
		printer(characterTable);
		reverse = turn(characterTable);
		printer(reverse);
	}
}


