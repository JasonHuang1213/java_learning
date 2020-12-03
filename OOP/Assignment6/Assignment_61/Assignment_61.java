package assignment_61;
import java.util.*;

public class Assignment_61 {
	
	public static void main(String[] args) {
		
		ArrayList<Measurable> measurable = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		double scaleV = 0;
		
		// Create and initialize some Rectangle and Circle objects
		measurable.add(new Rectangle(0, 0, 10, 15));
		measurable.add(new Rectangle(0, 0, 5, 10));
		measurable.add(new Circle(0, 0, 10));
		measurable.add(new Circle(0, 0, 5));
		
		// Print the areas and perimeters of all objects
		System.out.println("All objects redefined: ");
		for (Measurable m : measurable) {
			printObject(m);
		}
		
		// Scale all objects with a scale value asked from the user
		System.out.println("\nEnter a scale value: ");
		scaleV = input.nextDouble();
		for (Measurable m : measurable) {
			m.scale(scaleV);
		}
		
		// Print out all objects again
		System.out.println("All objects after being scaled: ");
		for (Measurable m : measurable) {
			printObject(m);
		}
		
		input.close();
	}

	static void printObject(Measurable m) {
		System.out.println("Perimeter: " + m.perimeter());
		System.out.println("Area: " + m.area() + "\n");
	}
}
