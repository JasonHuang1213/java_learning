public class SoapDispenser {
	// -- attributes ------------------------

	// volume in milliliters
	private int volume;
	// unit also a milliliter
	private int soapLeft;
	// amount of one dose in milliliters
	private int doseSize;

	// -- constructor ----------------------

	public SoapDispenser(int t, int k) {
		volume = t;
		doseSize = k;
	}

	// -- methods ---------------------------

	public int giveSoapLeft() {
		return soapLeft;
	}

	public int refill(int amount) {
		// negative number is changed to zero
		if (amount < 0) {
			amount = 0;
		}
		int soapAdded = 0;
		if ((soapLeft + amount) > volume) { // try to refill too much
			soapAdded = volume - soapLeft;
			soapLeft = volume;
			return soapAdded;
		} else { // fill the right amount
			soapLeft += amount;
			return amount;
		}
	}

	public int press() {
		int offerSoap = doseSize;
		if (offerSoap > soapLeft) { // asking more than there is to give
			offerSoap = soapLeft;
			soapLeft = 0;
			return offerSoap;
		} else { // ask less than there is to give
			soapLeft -= offerSoap;
			return offerSoap;
		}
	}
}