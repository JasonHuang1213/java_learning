public class Test {
	public static void main(String[] args) {

		Snake snake = new Snake();
		Horse horsey = new Horse();
		Bird birdy = new Bird();

		System.out.print("Snake says: ");
		snake.voice();
		System.out.print("Horse says: ");
		horsey.voice();
		System.out.print("Bird says: ");
		birdy.voice();
	}
}

class Snake extends Animal {
	public void voice() {
		System.out.println("Ssssshhh...");
	}
}

class Horse extends Animal {
	public void voice() {
		System.out.println("Ihahaa...");
	}
}

class Bird extends Animal {
	public void voice() {
		System.out.println("Tsirp, tsirp...");
	}
}
abstract class Animal {
// abstract method, algorithm must be declared in subclass
public abstract void voice(); // note the semi-colon following the method signature
}

