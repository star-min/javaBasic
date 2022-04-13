package sec1;

public class AnonymousEx {
	public static void main(String[] args) {
		//인터페이스는 선언과 구현을 반드시 해야함
		//인터페이스(선언) -> 상속 -> 자식클래스(구현)
		//익명의 클래스 : 자식(구현)클래스를 만들지 않고, 직접 생성자의 블록에서 구현내용을 기술해서 객체를 생성 
		RemoteControl rc = new RemoteControl() {
			int volume;
			public void turnOn() { System.out.println("전원 ON"); }
			public void turnOff() { System.out.println("전원 OFF"); }
			public void setVolume(int volume) { this.volume = volume; }
			public int getVolume() { return volume; }
		};
	}
}