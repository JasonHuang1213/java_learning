/*
* Chapter5.java
* Made for Viope course, chapter five
* (c) Viope Solutions Oy
*/
import java.util.Scanner;
public class Chapter5 {
	public static void main(String[] args) {
		// literal constant
		final double PI = 3.142;	
		// initialize the needed variables
		double circleArea = 0;
		double radius = 0;
		// create the needed objects
		Scanner reader = new Scanner(System.in);
		// program begins
		System.out.println("** Circle area **");
		System.out.println("Type in the circle radius and I will tell you the area.");
		System.out.println("Separate decimals with comma.");
		// ask for radius
		System.out.print("radius: ");
		// read radius
		radius = reader.nextDouble();
		// calculate area
		circleArea = PI * radius * radius;
		// print area
		System.out.println("area of the circle: " + circleArea);
	}
}

