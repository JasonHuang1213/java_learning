public class Methods {
	// declaration of method foo
	private static void foo() {
		System.out.println("Begin foo");
		// call for method bar
		bar();
		System.out.println("Last sentence of method foo");
	}
	// declaration of method bar
	private static void bar() {
		System.out.println("Begin bar");
		// call for method foobar
		foobar();
		System.out.println("Last sentence of method bar");
	}
	// declaration of method foobar
	private static void foobar() {
		System.out.println("Begin foobar");
		System.out.println("Last sentence of method foobar");
	}
	// declaration of main method
	public static void main(String[] args) {
		System.out.println("call for foo() in main method");
		foo();
		System.out.println("---");
		System.out.println("call for bar() in main method");
		bar();
	}
}
