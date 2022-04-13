package sec4;

public class SmartPhone extends Phone {
	SmartPhone(String owner){		super(owner);	}

	@Override
	void turnOn() {
		System.out.println("스마트폰의 전원을 켭니다.");
	}
	@Override
	void turnOff() {
		System.out.println("스마트폰의 전원을 끔니다.");
	}
	void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}