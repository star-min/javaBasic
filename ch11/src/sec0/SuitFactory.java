package sec0;

public class SuitFactory {
	static public Suit getSuit(SuitAbtractFactory suitAbtractFactory) {
		return suitAbtractFactory.createSuit();
	}
}
