package assignment_32;
import java.util.HashMap;
import java.util.Scanner;

public class Assignment_32 {

	static final int SIZE = 10;
	public static void main(String[] args) {
		// Create and initialize HashMap
		HashMap<Integer,Double> products = new HashMap<Integer,Double>();
		for(int i=0; i<SIZE; i++) {
			products.put(i, i+5.5);
		}
		
		// Print out HashMap products
		System.out.println("Products:");
		for(int i=0; i<SIZE; i++) {
			System.out.println(i + ": " + products.get(i));
		}
		
		// Ask user product number
		int pNumber;
		Scanner input = new Scanner(System.in);
		for(;;) {
			System.out.println("Give a product number(-1 exit)");
			pNumber = input.nextInt();
			if(pNumber == -1) {
				input.close();
				break;
			}
			else {
				// Print out its price
				if(products.containsKey(pNumber)) {
					System.out.println("The price of product " + pNumber + " is " + products.get(pNumber));
				}
				else {
					System.out.println("Not found");
				}
			}
		}

	}

}
