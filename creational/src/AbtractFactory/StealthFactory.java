package AbtractFactory;

public class StealthFactory implements SuitAbtractFactory {
	@Override
	public Suit createSuit() {
		System.out.println("StealthFactory~!");
		return new Suit();
	}
}
