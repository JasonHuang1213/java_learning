public class Card {
	private static int value;
	private static String suit;

	public Card(String suit, int value) {
		this.suit = suit;
		this.value = value;
	}

	// overridden toString() method to ease card printing
	public String toString() {
		return suit + " " + value;
	}

	// override equals method
	public boolean equals(Object thing) {
		if (!(thing instanceof Card))	// instanceof operator checks if thing variable is an instance from Card class
			return false;				// instanceof returns true or false
		Card card = (Card)thing;
		if (Card.value == value && Card.suit == suit)
			return true;
		else
			return false;
	}

	// main method for class testin/existing-content/////
	public static void main(String[] args) {

		// create two seemingly identical cards
		Card Card1 = new Card("Cross", 4);
		Card Card2 = new Card("Cross", 4);

		if (Card1.equals(Card2)) {
			System.out.println("\""+Card1+"\" is the same as \""+Card2+"\"");
		} else {
			System.out.println("\""+Card1+"\" is NOT the same as \""+Card2+"\"");
		}
	}
}