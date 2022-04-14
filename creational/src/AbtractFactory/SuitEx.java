package AbtractFactory;

public class SuitEx {
	public static void main(String[] args) {
		Suit suit1 = SuitFactory.getSuit(new CombatFactory());
		Suit suit2 = SuitFactory.getSuit(new SpaceFactory());
		Suit suit3 = SuitFactory.getSuit(new StealthFactory());
	}
}