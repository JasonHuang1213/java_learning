public class Change {
	
	/*
	* refresh method
	*/
	private static void refresh(int[] table) {
		// refresh every elements value
		for (int i = 0; i < table.length; ++i) {
			// new value is set to be the square of the old value
			table[i] = table[i] * table[i] * table[i];
		}
	}

	/*
	* printer method
	*/
	private static void printer(int[] table) {
		for (int i = 0; i < table.length; ++i) {
			System.out.print(table[i] + " ");
		}
		System.out.println();
	}

	// main method
	public static void main(String[] args) {
		int[] table = {0, 1, 2, 3, 4, 5};
		System.out.print("Before the call of refresh method: ");
		printer(table);
		refresh(table);
		System.out.print("After calling the refresh method: ");
		printer(table);
	}
}


