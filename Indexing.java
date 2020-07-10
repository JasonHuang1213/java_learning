import java.util.Scanner;
public class Indexing {
	public static void main(String[] args) {
		final int elements = 5;

		// define an array variable for a 5 element int 
		int[] iArray = new int[elements];
		Scanner reader = new Scanner(System.in);

		// print the values of the elements in the array
		for (int i = 0; i < elements; ++i) {
			System.out.println("iArray[" + i + "] == " + iArray[i]);
		}
		System.out.println();

		// ask for numbers and assign them to the array
		for (int i = 0; i < elements; ++i) {
			System.out.print("Type in " + (i + 1) + ". number: ");
			iArray[i] = reader.nextInt();
		}
		System.out.println();

		// print the values of the elements in the array
		for (int i = 0; i < elements; ++i) {
			System.out.println("iArray[" + i + "] == " + iArray[i]);
		}
	}
}

