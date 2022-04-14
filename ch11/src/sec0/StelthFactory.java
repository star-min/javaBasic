package sec0;

public class StelthFactory implements SuitAbtractFactory {
	@Override
	public Suit createSuit() {
		System.out.println("StelthFactory");
		return new Suit();
	}
}
