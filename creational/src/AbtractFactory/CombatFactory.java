package AbtractFactory;

public class CombatFactory implements SuitAbtractFactory {
	@Override
	public Suit createSuit() {
		System.out.println("CombatFactory~!");
		return new Suit();
	}
}
