public class SoapDispenserTest {
	public static void main(String[] args) {

		// create a dispenser that can hold 1600 ml of soap,
		// and it offers 2 ml of soap with one press
		SoapDispenser dispenser = new SoapDispenser(1600,2);
		// fill the dispenser
		int soap = 2000;
		int fillResult = dispenser.refill(soap);

		System.out.println("Dispenser refilled with "+fillResult+" ml of soap.");
		if (fillResult < soap) {
			System.out.println("Soap was left over.");
		} else {
			System.out.println("No soap left over.");
		}

		// use dispenser 700 times
		int useTimes = 700;
		System.out.println("Use dispenser "+useTimes+" times.");
		for (int i=0; i < useTimes; ++i) {
			dispenser.press();
		}

		System.out.println("Dispenser has " + dispenser.giveSoapLeft()+" ml of soap left.");

		// use dispenser until it is empty
		int presses = 0;
		while (dispenser.press() != 0) {
			presses++;
		}

		System.out.println("Dispenser was used " + presses + 
			" times before it was empty.");
	}
}