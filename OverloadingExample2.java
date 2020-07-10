public class OverloadingExample2 {
	private static void typeAndAmount(int a, int b) {
		System.out.println("two parameters: ");
		System.out.println("int a == " + a + "\nint b == " + b);
	}
	private static void typeAndAmount (String a, int b) {
		System.out.println("two parameters: ");
		System.out.println("String a is \"" + a + "\"\nint b == " + b);
	}
	private static void typeAndAmount (boolean a) {
		System.out.println("single parameter: ");
		System.out.println("boolean a == " + a);
	}
	public static void main(String[] args) {
		typeAndAmount(1 + 2, 5 + 4);
		System.out.println("- - -");
		typeAndAmount(4 < 5 && 4 >= 4);
		System.out.println("- - -");
		typeAndAmount("character" + "string", 2004);
		System.out.println("- - -");
		typeAndAmount(4 != 4);
		System.out.println("- - -");
		typeAndAmount("mar", 10);
		System.out.println("- - -");
	}
}
