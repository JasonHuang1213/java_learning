public class ParameterExample {
	// declaration of private class method growAndPrint
	private static void growAndPrint (int number) {
		/* parameter is number. It has nothing to do with the variable number defined 
                    in the main method*/
		// increment the parameter by two
		number += 2;
		System.out.println("growAndPrint: number == " + number);
	}
	// main method declaration
	public static void main(String[] args) {
		/* possible to define a variable with the same name as one in growAndPrint 
                   because they do not concern each other */
		int number = 5; // this variable only exists in the main method
		System.out.println("main: number == " + number);
		growAndPrint (number);
		System.out.println("main: number == " + number);
	}
}
