public class Comparing {
	public static void main (String[] args) {
		int iNumber1 = 2;
		int iNumber2 = 3;
		double dNumber1 = 2.5;
		char character1 = 'M';
		char character2 = 'm';
		boolean truth = false;
		boolean anotherTruth = false;
		// prints true, because both variables have the value false
		// you can do an equality comparison to boolean type variables
		truth = (truth == anotherTruth);
		System.out.println(truth);
		// prints false, because 3 is not lower than 2.5
		truth = iNumber2 < dNumber1;
		System.out.println(truth);
		// prints true, because 2 and 3 are not equal
		truth = (iNumber1 != iNumber2);
		System.out.println(truth);
		// prints false, because 2 is not higher than 2.5
		// compared numbers need not to be of the same type
		truth = iNumber1 > dNumber1;
		System.out.println(truth);
		// prints true, because characters M and m are different characters.
		truth = character1 != character2;
		System.out.println(truth);
	}
}

