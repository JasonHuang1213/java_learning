import java.util.Scanner;
public class JumpResults {
	public static void main(String[] args) {
		// prepare array variable
		double[] jumps;
		int amountOfJumps = 0;
		Scanner reader = new Scanner(System.in);
		System.out.println("How many jumps?");

		// make sure that the amount of jumps is sensible
		do {
			amountOfJumps = reader.nextInt();
			if (amountOfJumps <= 0) {
				System.out.println("Amount of jumps can not be " +
				amountOfJumps + " !!");
				System.out.print("Give a new amount of jumps: ");
			} else {
				System.out.println(amountOfJumps + " is a sensible amount.");
			}
		} while (amountOfJumps <= 0);

		// array creation and reference assignment to array variable
		jumps = new double[amountOfJumps];

		// ask for jumps
		for (int i = 0; i < jumps.length; ++i) {
			System.out.print("Type in the result of " + (i+1) + " jump: ");
			jumps[i] = reader.nextDouble();
		}
		System.out.println();

		// print the jump results and calculate the sum of results
		double sum = 0;
		System.out.println("Jump results:");
		for (int i = 0; i < jumps.length; ++i) {
			System.out.print(jumps[i] + " ");
			sum += jumps[i];
		}

		// and average result
		double average = sum / jumps.length;
		System.out.println("\nAverage value of the jumps was " + average);
	}
}

