/*
* SumofNumbers.java
* program to practice reading data
* (c) Viope Solutions Oy
* ver. Java5
*/
// Import another class that is not included in java.lang
import java.util.Scanner;
public class SumofNumbers {
	public static void main(String[] args) {
		int number1 = 0, number2 = 0;
		// Define variable reader to be a Scanner type variable and its 
		//value to be the value from new Scanner(System.in)
		Scanner reader = new Scanner(System.in);	
		System.out.print("Type in the first number: ");
		// Object reader calls for method nextInt()
		number1 = reader.nextInt();
		System.out.print("Type in the second number: ");
		number2 = reader.nextInt();
		System.out.print(number1 + " + " + number2 + " = " + (number1 + number2));
	}
}
