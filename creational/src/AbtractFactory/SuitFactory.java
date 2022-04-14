package AbtractFactory;

public class SuitFactory {
	static public Suit getSuit(SuitAbtractFactory suitAbstractFactory) {
		return suitAbstractFactory.createSuit();
	}
}