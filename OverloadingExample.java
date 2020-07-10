public class OverloadingExample{
	// declaration of parameterless hey method
	private static void hey() {
		System.out.println("Hey!");
	}
	// declaration of a single parameter hey method
	private static void hey(int eAmount) {
		if (eAmount > 0) {
			System.out.print("H");
			for (int i = 0; i < eAmount; i++) { // printing e letters
				System.out.print("e");
			}
			System.out.println("y!");
		}
	}
	// declaration of hey method with two parameters
	private static void hey(int eAmount, int amount) {
		if ((eAmount > 0) && (amount > 0)) {
			for (int i = 0; i < amount; i++) { // printing greetings
				hey(eAmount); // call for single parameter hey method
			}
		}
	}
	// main method declaration
	public static void main(String[] args) {
		hey(); // call for parameterless hey method
		System.out.println("- - - - - - -");
		hey(6); // call for single parameter hey method
		hey(2); // again the single parameter hey method
		System.out.println("- - - - - - -");
		hey(3, 4); // call for hey method with two parameters
	}
}
