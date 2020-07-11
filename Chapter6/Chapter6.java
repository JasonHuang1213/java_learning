/*
* Chapter6.java
* Made for Viope course, chapter six
* (c) Viope Solutions Oy
*/
import java.util.Scanner;
public class Chapter6 {
	public static void main(String[] args) {
		// literal constant
		final double PI = 3.142;
		// initialize the needed variables
		double circleArea = 0;
		double radius = 0;
		// create the needed objects 
		Scanner reader = new Scanner(System.in);
		// program starts
		System.out.println("** Circle area **");
		System.out.println("Type in the radius of a circle and I will tell the area.");
		System.out.println("Separate decimals with comma.");
		// ask for radius until it is bigger than one and smaller than
		do {
			System.out.print("radius: ");
			// read radius
			radius = reader.nextDouble();
		} while((radius <= 1) || (radius >= 100));
		// calculate area
		circleArea = PI * radius * radius;
		// print area
		System.out.println("Area of the circle is: " + circleArea);
	}
}
