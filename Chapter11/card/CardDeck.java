public class CardDeck
{
	private Card[] CardDeck;
	public CardDeck()
	{
		// array that can hold 52 cards
		CardDeck = new Card[52];

		// create Card type objects as the array components
		int ind = 0;
		for (int m=1; m<=4; ++m) { // suits: hearts, spades, diamonds and clubs
			for(int a=1; a<=13; ++a) { // values: 1-13
				CardDeck[ind] = new Card(m, a);
				++ind;
			}
		}
	}

	// method for checking the card, Card is not removed from the deck
	public String checkCard(int howMany) {
		if (howMany < 0)
			howMany = 0;
		else if (howMany >= CardDeck.length)
			howMany = CardDeck.length -1; // amount of array elements - 1

		/* next we need the toString method to present the reference to a Card type object as a character string */
		return CardDeck[howMany].toString();
	}

	// main method for testing the CardDeck class
	public static void main(String args[])
	{
		CardDeck cd = new CardDeck();

		// check five first cards from the deck
		for (int i=0; i<5; ++i) {
			System.out.println(cd.checkCard(i));
		}
	}
}