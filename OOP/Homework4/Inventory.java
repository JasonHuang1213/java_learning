package homework4;
import java.util.*;

public class Inventory {

	public static void main(String[] args) {
		ArrayList<MachinePart> parts = new ArrayList<MachinePart>();
		parts.add(new LocalParts("gear", 1000, 0.5, 500));
		parts.add(new LocalParts("nut", 50000, 0.01, 100));
		parts.add(new PurchasedParts("axle", 2000, 80));
		parts.add(new PurchasedParts("screw", 50000, 0.1));
		
		System.out.println("All parts:");
		for(MachinePart part : parts) {
			System.out.println(part.toString());
		}
		
		System.out.println("\nNames and inventory values:");
		for(MachinePart part : parts) {
			System.out.println(part.getName() + ": " + part.calculateValue());
		}
	}

}
