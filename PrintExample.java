/*
* PrintExample.java
* program to practice print() and println() methods
* (c) Viope Solutions Oy
*/
public class PrintExample {
	public static void main(String[] args) {
		// following is the definitions and initializations of the variable printingMethods
		int printingMethods = 2;
		// following statements print text in screen
		System.out.println("Hi Java student!");
		System.out.print("This is an example ");
		System.out.println("of methods");
		// notice the use of slashes '\'
		System.out.println("\t\"println()\" and\n\t\"print()\"");
		// print a line change
		System.out.println();
		// character string combining with + operator prior to printing
		System.out.println("Number of methods shown " +
		printingMethods + " methods");
	}
}
