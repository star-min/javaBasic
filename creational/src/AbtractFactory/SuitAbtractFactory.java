package AbtractFactory;
//Abstract Factory : 관련 있는 객체들을 모아서 팩토리로 만들고 조건에 따라 팩토리 중에서 선택하게 하는 패턴
public interface SuitAbtractFactory {
	Suit createSuit();
}