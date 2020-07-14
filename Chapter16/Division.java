import java.util.Scanner;
public class Division {
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		int dividend = 0, divider = 0;
		boolean input_ok = true;

		// ask for dividend
		do {
			try {
				System.out.print("Type in dividend: ");
				dividend = reader.nextInt();
				
				input_ok = true;
			} catch (java.util.InputMismatchException p) {
				input_ok = false;
				System.out.println("Number must be an integer!");
				/* If an exception occurs, input given in the last round will hang.
				Hanging input is read with nextLine() method */
				reader.nextLine();
			}
		} while (!input_ok);

		// ask for divider, also check that divider is not zero
		do {
			try {
				System.out.print("Type in divider (non-zero): ");
				divider = reader.nextInt();
				input_ok = true;
			} catch (java.util.InputMismatchException p) {
				input_ok = false;
				System.out.println("Number must be an integer!");
				reader.nextLine();
			}
		} while (!input_ok || (divider == 0));
			double result = (1.0*dividend) / divider;
			System.out.println("Division result is " + result);
	}
}


