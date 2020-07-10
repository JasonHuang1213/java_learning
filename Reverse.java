public class Reverse {
	public static void main(String[] args) {
		/* Define an array variable that refers to a five element String array. 
		   Note the use of array initializer. */
		String[] numbers = {"one", "two", "three", "four", "five"};

		// print the values of the array elements starting from the beginning
		for (int i = 0; i < numbers.length; ++i) {
			System.out.println(numbers[i]);
		}

		System.out.println("- - -");

		// print the values of the array elements starting from the end
		for (int i = (numbers.length - 1); i >= 0; --i) {
			System.out.println(numbers[i]);
		}
	}
}

