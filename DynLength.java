import java.util.Scanner;
public class DynLength {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		// array variable
		int[] dynArr;

		System.out.print("Give the size of the array: ");
		int size = reader.nextInt();

		// value of the array variable is assigned to be a reference to the int array
		dynArr = new int[size];

		System.out.println("dynArr.length == " + dynArr.length);

		for (int i=1; i <= dynArr.length; ++i) {
			System.out.print(i+". element value (index == "+(i-1)+"): ");
			dynArr[i-1] = reader.nextInt();
		}

		System.out.println();

		for (int i=0; i < dynArr.length; ++i) {
			System.out.println("dynArr[" + i + "] == " + dynArr[i]);
		}
	}
}

