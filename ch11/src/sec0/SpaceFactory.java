package sec0;

public class SpaceFactory implements SuitAbtractFactory {
	@Override
	public Suit createSuit() {
		System.out.println("SpaceFactory");
		return new Suit();
	}
}